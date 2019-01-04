package com.webservice.restapi.entity;

import javax.persistence.*;

@Entity //Tells Hibernate that TourName.java is an entry to the table 'tour' in DB
@Table(name="tour")
public class TourName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tour_name;

    public TourName(){}

    public TourName(int id, String tour_name)
    {
        this.setId(id);
        this.setTourName(tour_name);
    }

    //Setters
    private void setId(int id){ this.id=id;}

    private void setTourName(String tour_name){this.tour_name=tour_name;}

    //Getters
    public int getId() {
        return id;
    }

    public String getTourName() {
        return tour_name;
    }

    /**
     * Impplementation of the toString() method
     * @return The name of the Tour
     */
    @Override
    public String toString(){
        return this.getTourName();
    }
}
