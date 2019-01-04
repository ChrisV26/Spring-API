package com.webservice.restapi.repository;

import com.webservice.restapi.entity.POI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  // This class is responsible for queries to the database and is referred as Repository
public interface POIRepository extends JpaRepository<POI,Integer> {

    //Custom Queries for the DB excluding the common ones

    List<POI> findByTourid(int tourid);

}
