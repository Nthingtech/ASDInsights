package com.ari.adsbackend.services;

import com.ari.adsbackend.dto.ChildDTO;
import com.ari.adsbackend.model.ChildModel;
import com.ari.adsbackend.repositories.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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

}
