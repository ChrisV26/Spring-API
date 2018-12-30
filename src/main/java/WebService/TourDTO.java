package WebService;

import java.math.BigDecimal;

public class TourDTO
{

    private int TourID;
    private BigDecimal lat;
    private BigDecimal lng;
    private String tour_name,tour_description;


    public TourDTO(int tourID, BigDecimal lat, BigDecimal lng, String tour_name, String tour_description) {
        TourID = tourID;
        this.lat = lat;
        this.lng = lng;
        this.tour_name = tour_name;
        this.tour_description = tour_description;
    }

    public void setTourID(int tourID) {
        TourID = tourID;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public void setTour_name(String tour_name) {
        this.tour_name = tour_name;
    }

    public void setTour_description(String tour_description) {
        this.tour_description = tour_description;
    }

    public int getTourID() {
        return TourID;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public String getTour_name() {
        return tour_name;
    }

    public String getTour_description() {
        return tour_description;
    }
}
