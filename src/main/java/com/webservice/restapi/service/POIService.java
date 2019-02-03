package com.webservice.restapi.service;

import com.webservice.restapi.entity.POI;

import java.util.List;

/** Interface to declare our common Methods */

public interface POIService {

    List<POI> findAll();
    List<POI> findByTourid(int tourid);
}
