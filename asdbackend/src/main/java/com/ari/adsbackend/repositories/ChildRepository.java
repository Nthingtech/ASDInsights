package com.ari.adsbackend.repositories;

import com.ari.adsbackend.model.ChildModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepository extends JpaRepository<ChildModel, Long> {
}
