package com.restful.springrest.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.restful.springrest.entities.Loads;

public interface LoadDao extends JpaRepository<Loads, Integer>{

	@Query("SELECT l FROM Loads l WHERE l.id = :id")
    Loads getOne(@Param("id") UUID id);

}
