package com.ari.adsbackend.controller;

import com.ari.adsbackend.model.ChildModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/children")
public class ChildController {

    @GetMapping
    public ResponseEntity<List<ChildModel>> findAll() {
        List<ChildModel> list = new ArrayList<>();
        list.add(new ChildModel(10L, "Cesar", "Bueno"));
        list.add(new ChildModel(11L, "Amanda", "Antunes"));
        list.add(new ChildModel(13L, "José", "Abreu"));
        return ResponseEntity.ok().body(list);
    }
}
 //TODO NEXT : OBSERVAÇÕES IMPORTANTES SOBRE O SISTEMA