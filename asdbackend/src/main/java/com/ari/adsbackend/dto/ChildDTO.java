package com.ari.adsbackend.dto;

import com.ari.adsbackend.model.ChildModel;

public class ChildDTO {

    private Long id;
    private String name;

    //private List<ChildReportDTO> childReportDTOS = new ArrayList<>();

    public ChildDTO() {
    }

    public ChildDTO(Long id, String name, String lastName) {
        this.id = id;
        this.name = name;
    }

    public ChildDTO(ChildModel entity) {
        id = entity.getId();
        name = entity.getName();
        //entity.getChildReportModels().forEach(childReportModel -> this.childReportDTOS.add(new ChildReportDTO(childReportModel)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public List<ChildReportDTO> getChildReportDTOS() {
        return childReportDTOS;
    }*/

}
