package com.ari.adsbackend.controller;

import com.ari.adsbackend.dto.ChildDTO;
import com.ari.adsbackend.services.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/children")
public class ChildController {

    @Autowired
    private ChildService service;

    @GetMapping
    public ResponseEntity<List<ChildDTO>> findAll() {
        List<ChildDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ChildDTO> findById(@PathVariable Long id) {
        ChildDTO dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

}


