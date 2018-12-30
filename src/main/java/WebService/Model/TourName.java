package WebService.Model;

import javax.persistence.*;

@Entity //Tells Hibernate that TourName.java is an entry to the table 'tour' in DB
@Table(name="tour")
public class TourName {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tour_name;

    /*  To declare a side as not responsible for the relationship,
    * the attribute mappedBy is used.
    *‘mappedBy’ refers to the property name of the association on the owner side.
    * */
    @OneToOne(fetch=FetchType.LAZY,mappedBy = "tourName")
    private POI poi;

    public TourName(){}

    public TourName(int id, String tour_name,POI poi)
    {
        this.setId(id);
        this.setTourName(tour_name);
        this.setPOI(poi);
    }

    //Setters
    private void setId(int id){ this.id=id;}

    private void setTourName(String tour_name){this.tour_name=tour_name;}

    private void setPOI(POI poi){this.poi=poi;}

    //Getters
    public int getId() {
        return id;
    }

    public String getTourName() {
        return tour_name;
    }

    public POI getPoi() {
        return poi;
    }
}
