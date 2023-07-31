package com.ari.adsbackend.dto;

import com.ari.adsbackend.model.ChildModel;

import java.util.ArrayList;
import java.util.List;

public class ChildDTO {

    private Long id;
    private String firstName;
    private String lastName;

    private List<ChildReportDTO> childReportDTOS = new ArrayList<>();

    public ChildDTO() {
    }

    public ChildDTO(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ChildDTO(ChildModel entity) {
        id = entity.getId();
        firstName = entity.getFirstName();
        lastName = entity.getFirstName();
        entity.getChildReportModels().forEach(childReportModel -> this.childReportDTOS.add(new ChildReportDTO(childReportModel)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<ChildReportDTO> getChildReportDTOS() {
        return childReportDTOS;
    }
}
