package com.ari.adsbackend.controller;

import com.ari.adsbackend.model.ChildModel;
import com.ari.adsbackend.services.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/children")
public class ChildController {

    @Autowired
    private ChildService service;

    @GetMapping
    public ResponseEntity<List<ChildModel>> findAll() {
        List<ChildModel> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
 //TODO NEXT : OBSERVAÇÕES IMPORTANTES SOBRE O SISTEMA