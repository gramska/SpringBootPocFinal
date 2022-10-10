package com.example.demoJava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoJava.models.TrackingModel;

@Repository
public interface TrackingDao extends JpaRepository<TrackingModel, String> {

}
