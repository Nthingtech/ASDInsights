package com.ari.adsbackend.services;

import com.ari.adsbackend.dto.ChildDTO;
import com.ari.adsbackend.model.ChildModel;
import com.ari.adsbackend.repositories.ChildRepository;
import com.ari.adsbackend.services.exceptions.DatabaseException;
import com.ari.adsbackend.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ChildService {

    @Autowired
    private ChildRepository repository;

    @Transactional(readOnly = true)
    public Page<ChildDTO> findAllPaged(Pageable pageable) {
        Page<ChildModel> list = repository.findAll(pageable);
        return list.map(x -> new ChildDTO(x));
    }

    @Transactional(readOnly = true)
    public ChildDTO findById(Long id) {
        Optional<ChildModel> obj = repository.findById(id);
        ChildModel entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new ChildDTO(entity);
    }

    @Transactional
    public ChildDTO insert(ChildDTO dto) {
        var entity = new ChildModel();
        entity.setName(dto.getName());
        entity = repository.save(entity);
        return new ChildDTO(entity);
    }

    @Transactional
    public ChildDTO update(Long id, ChildDTO dto) {
        try {
            ChildModel entity = repository.getReferenceById(id);
            entity.setName(dto.getName());
            entity = repository.save(entity);
            return new ChildDTO(entity);
        }
        catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Id not found " + id);
        }
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id) {
        if (!repository.existsById(id)){
            throw new ResourceNotFoundException("Resource not found");
        }
        try {
            repository.deleteById(id);
        }
        catch (DataIntegrityViolationException e){
            throw new DatabaseException("Integrity violation");
        }
    }

}
