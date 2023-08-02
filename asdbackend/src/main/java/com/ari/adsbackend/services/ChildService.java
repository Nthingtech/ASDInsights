package com.ari.adsbackend.services;

import com.ari.adsbackend.dto.ChildDTO;
import com.ari.adsbackend.model.ChildModel;
import com.ari.adsbackend.repositories.ChildRepository;
import com.ari.adsbackend.services.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ChildService {

    @Autowired
    private ChildRepository repository;

    @Transactional(readOnly = true)
    public List<ChildDTO> findAll() {
        List<ChildModel> list = repository.findAll();
        return list.stream().map(x -> new ChildDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ChildDTO findById(Long id) {
        Optional<ChildModel> obj = repository.findById(id);
        ChildModel entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        return new ChildDTO(entity);
    }

    @Transactional
    public ChildDTO insert(ChildDTO dto) {
        var entity = new ChildModel();
        entity.setName(dto.getName());
        entity = repository.save(entity);
        return new ChildDTO(entity);
    }
}
