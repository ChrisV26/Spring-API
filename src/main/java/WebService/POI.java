package WebService;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity //Tells that POI.java is an entry to the table poi in DB
@Table(name = "poi")
public class POI {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private BigDecimal lat;
    private BigDecimal lng;
    private int Tour;
    private int name_id;
    
    public POI(int id,BigDecimal lat,BigDecimal lng, int Tour,int name_id)
    {
        this.setId(id);
        this.setLat(lat);
        this.setLng(lng);
        this.setTour(Tour);
        this.setName_id(name_id);
    }

    // Setters
    private void setTour(int Tour) {
        this.Tour=Tour;
    }

    private void setLng(BigDecimal lng) {
        this.lng=lng;
    }

    private void setLat(BigDecimal lat) {
        this.lat =lat;
    }

    private void setId(int id) {
        this.id=id;
    }

    private void setName_id(int name_id){
        this.name_id =name_id;
    }

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

    public int getTour() {
        return Tour;
    }

    public int getName_id() {
        return name_id;
    }
}
