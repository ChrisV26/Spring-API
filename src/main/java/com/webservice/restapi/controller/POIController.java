package com.webservice.restapi.controller;

import com.webservice.restapi.entity.POI;
import com.webservice.restapi.service.POIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController // This means that this class is a Controller
public class POIController
{

    @Autowired //automatically resolve the instance and inject it into the class that declared it
    POIService poiService;


   /* With these methods we handle the queries for the db */

    /**
     * @return all rows from POI table
     * */
    @RequestMapping(value="/poi",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<POI> index()
    {
        List<POI> allPois= poiService.findAll();
        return allPois;
    }


    /**
     * @return rows based on TourID
     * */
   @RequestMapping(value="poi/{tourid}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<POI> showTourID(@PathVariable int tourid)
    {
        List<POI> showTourID=poiService.findByTourid(tourid);
        return showTourID;
    }


}
