package com.webservice.restapi.service;

import com.webservice.restapi.entity.POI;

import java.util.List;

public interface POIService {

    List<POI> findAll();
    List<POI> findByTourid(int tourid);
}
