package com.ari.adsbackend.services;

import com.ari.adsbackend.model.ChildModel;
import com.ari.adsbackend.repositories.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService {

    @Autowired
    private ChildRepository repository;

    public List<ChildModel> findAll() {
        return repository.findAll();
    }

}
