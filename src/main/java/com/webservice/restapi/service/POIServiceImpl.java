package com.webservice.restapi.service;

import com.webservice.restapi.entity.POI;
import com.webservice.restapi.repository.POIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** Implementing the Methods from POIService */

@Service // stereotype for service layer,same with component annotation
public class POIServiceImpl implements POIService {

    @Autowired
    private POIRepository poiRepository;

    @Override
    public List<POI> findAll()
    {
        return poiRepository.findAll();
    }

    @Override
    public List<POI> findByTourid(int tourid)
    {
        return poiRepository.findByTourid(tourid);
    }
}
