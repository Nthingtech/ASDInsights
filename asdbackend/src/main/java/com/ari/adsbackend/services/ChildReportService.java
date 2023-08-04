package com.ari.adsbackend.services;

import com.ari.adsbackend.dto.ChildReportDTO;
import com.ari.adsbackend.model.ChildReportModel;
import com.ari.adsbackend.repositories.ChildReportRepository;
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
public class ChildReportService {

    @Autowired
    private ChildReportRepository repository;

    @Transactional(readOnly = true)
    public Page<ChildReportDTO> findAllPaged(Pageable pageable) {
        Page<ChildReportModel> list = repository.findAll(pageable);
        return list.map(x -> new ChildReportDTO(x));
    }

    @Transactional(readOnly = true)
    public ChildReportDTO findById(Long id) {
        Optional<ChildReportModel> obj = repository.findById(id);
        ChildReportModel entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new ChildReportDTO(entity);
    }

    @Transactional
    public ChildReportDTO insert(ChildReportDTO dto) {
        var entity = new ChildReportModel();
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new ChildReportDTO(entity);
    }

    @Transactional
    public ChildReportDTO update(Long id, ChildReportDTO dto) {
        try {
            ChildReportModel entity = repository.getReferenceById(id);
            copyDtoToEntity(dto, entity);
            entity = repository.save(entity);
            return new ChildReportDTO(entity);
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

    private void copyDtoToEntity(ChildReportDTO dto, ChildReportModel entity) {

        entity.setDatePost(dto.getDatePost());
        entity.setDayRating(dto.getDayRating());
        entity.setSocialInteraction(dto.getSocialInteraction());
        entity.setAnxiety(dto.getAnxiety());
        entity.setPleasant(dto.getPleasant());
        entity.setImpatience(dto.getImpatience());
        entity.setAggressiveness(dto.getAggressiveness());
        entity.setFriendliness(dto.getFriendliness());
        entity.setCommunication(dto.getCommunication());
        entity.setConcentration(dto.getConcentration());
        entity.setEmotion(dto.getEmotion());
        //entity.setUserModel(dto.getUserModel());
        //entity.setChildModel(dto.getChildModel());
    }

}

//TODO resolver possível problema com user_id e child_id no json
