package com.webservice.restapi.entity;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity //Tells Hibernate that POI.java is an entry to the table 'poi' in DB
@Table(name = "poi") //poi as of Point of Interest
 public class POI {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private BigDecimal lat;
    private BigDecimal lng;
    private String tour_description;
    private int tourid;

    @OneToOne
    @JoinColumn(name="Tour")
    private TourName tourName;

    public POI(){}
    
    public POI(int id, BigDecimal lat, BigDecimal lng, String tour_description, int tourid, TourName tourName)
    {
        this.setId(id);
        this.setLat(lat);
        this.setLng(lng);
        this.setTourDescription(tour_description);
        this.setTourid(tourid);
        this.setTourName(tourName);
    }

    // Setters

    private void setLng(BigDecimal lng) {
        this.lng=lng;
    }

    private void setLat(BigDecimal lat) {
        this.lat =lat;
    }

    private void setId(int id) {
        this.id=id;
    }

    private void setTourDescription(String tour_description){
        this.tour_description =tour_description;
    }

    private void setTourid(int tourid){ this.tourid =tourid;}

    private void setTourName(TourName tourName){this.tourName=tourName;}

    // Getters
    public int getId() {
        return id;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public String getTourDescription() {
        return tour_description;
    }

    public int getTourid() { return tourid;}

    public TourName getTourName() {return tourName;}
}
