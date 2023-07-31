package com.ari.adsbackend.dto;

import com.ari.adsbackend.model.ChildModel;
import com.ari.adsbackend.model.ChildReportModel;
import com.ari.adsbackend.model.UserModel;
import com.ari.adsbackend.model.enums.ChildFeel;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public class ChildReportDTO {

    private Long id;
    @PastOrPresent(message = "Post date cannot be in the future")
    private LocalDate datePost;
    private Integer dayRating;
    private Integer socialInteraction;
    private Integer anxiety;
    private Integer pleasant;
    private Integer impatience;
    private Integer aggressiveness;
    private Integer friendliness;
    private Integer communication;
    private Integer concentration;
    private ChildFeel emotion;

    private UserModel author;

    private ChildModel child;

    public ChildReportDTO() {
    }

    public ChildReportDTO(Long id, LocalDate datePost, Integer dayRating, Integer socialInteraction,
                          Integer anxiety, Integer pleasant, Integer impatience, Integer aggressiveness, Integer friendliness, Integer communication,
                          Integer concentration, ChildFeel emotion, UserModel author, ChildModel child) {
        this.id = id;
        this.datePost = datePost;
        this.dayRating = dayRating;
        this.socialInteraction = socialInteraction;
        this.anxiety = anxiety;
        this.pleasant = pleasant;
        this.impatience = impatience;
        this.aggressiveness = aggressiveness;
        this.friendliness = friendliness;
        this.communication = communication;
        this.concentration = concentration;
        this.emotion = emotion;
        this.author = author;
        this.child = child;
    }

    public ChildReportDTO(ChildReportModel entity) {
        id = entity.getId();
        datePost = entity.getDatePost();
        dayRating = entity.getDayRating();
        socialInteraction = entity.getSocialInteraction();
        anxiety = entity.getAnxiety();
        pleasant = entity.getPleasant();
        impatience = entity.getImpatience();
        aggressiveness = entity.getAggressiveness();
        friendliness = entity.getFriendliness();
        communication = entity.getCommunication();
        concentration = entity.getConcentration();
        emotion = entity.getEmotion();
        author = entity.getUserModel();
        child = entity.getChildModel();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDatePost() {
        return datePost;
    }

    public void setDatePost(LocalDate datePost) {
        this.datePost = datePost;
    }

    public Integer getDayRating() {
        return dayRating;
    }

    public void setDayRating(Integer dayRating) {
        this.dayRating = dayRating;
    }

    public Integer getSocialInteraction() {
        return socialInteraction;
    }

    public void setSocialInteraction(Integer socialInteraction) {
        this.socialInteraction = socialInteraction;
    }

    public Integer getAnxiety() {
        return anxiety;
    }

    public void setAnxiety(Integer anxiety) {
        this.anxiety = anxiety;
    }

    public Integer getPleasant() {
        return pleasant;
    }

    public void setPleasant(Integer pleasant) {
        this.pleasant = pleasant;
    }

    public Integer getImpatience() {
        return impatience;
    }

    public void setImpatience(Integer impatience) {
        this.impatience = impatience;
    }

    public Integer getAggressiveness() {
        return aggressiveness;
    }

    public void setAggressiveness(Integer aggressiveness) {
        this.aggressiveness = aggressiveness;
    }

    public Integer getFriendliness() {
        return friendliness;
    }

    public void setFriendliness(Integer friendliness) {
        this.friendliness = friendliness;
    }

    public Integer getCommunication() {
        return communication;
    }

    public void setCommunication(Integer communication) {
        this.communication = communication;
    }

    public Integer getConcentration() {
        return concentration;
    }

    public void setConcentration(Integer concentration) {
        this.concentration = concentration;
    }

    public ChildFeel getEmotion() {
        return emotion;
    }

    public void setEmotion(ChildFeel emotion) {
        this.emotion = emotion;
    }

    public UserModel getAuthor() {
        return author;
    }

    public void setAuthor(UserModel author) {
        this.author = author;
    }

    public ChildModel getChild() {
        return child;
    }

    public void setChild(ChildModel child) {
        this.child = child;
    }
}
