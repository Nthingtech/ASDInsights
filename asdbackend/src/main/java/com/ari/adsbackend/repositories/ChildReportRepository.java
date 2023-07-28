package com.ari.adsbackend.repositories;

import com.ari.adsbackend.model.ChildReportModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildReportRepository extends JpaRepository<ChildReportModel, Long> {
}
