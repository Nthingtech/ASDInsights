package com.ari.adsbackend.dto;

import com.ari.adsbackend.model.UserModel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDTO {

    private Long id;

    @NotBlank(message = "Required field")
    private String name;

    @Email(message = "Please enter a valid email")
    private String email;
    private String userProfile;

    Set<RoleDTO> roles = new HashSet<>();

    List<ChildReportDTO> childReportDTOS = new ArrayList<>();

    public UserDTO() {}

    public UserDTO(Long id, String name, String lastName, String email, String userProfile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.userProfile = userProfile;
    }

    public UserDTO(UserModel entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        userProfile = entity.getUserProfile();
        entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
        entity.getChildReportModels().forEach(childReport -> this.childReportDTOS.add(new ChildReportDTO(childReport)) );
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public List<ChildReportDTO> getChildReportDTOS() {
        return childReportDTOS;
    }
}
