package com.ari.adsbackend.model;

import com.ari.adsbackend.model.enums.ChildFeel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "TB_REPORT")
public class ChildReportModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userModel;

    @ManyToOne
    @JoinColumn(name = "child_id")
    private  ChildModel childModel;

    public ChildReportModel() {}

    public ChildReportModel(Long id, LocalDate datePost, Integer dayRating, Integer socialInteraction, Integer anxiety, Integer pleasant, Integer impatience,
                            Integer aggressiveness, Integer friendliness, Integer communication, Integer concentration, ChildFeel emotion, UserModel userModel, ChildModel childModel) {
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
        this.userModel = userModel;
        this.childModel = childModel;
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

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public ChildModel getChildModel() {
        return childModel;
    }

    public void setChildModel(ChildModel childModel) {
        this.childModel = childModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildReportModel that = (ChildReportModel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
