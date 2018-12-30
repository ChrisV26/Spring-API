package WebService;

import WebService.Model.POI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  // This class is responsible for queries to the database and is referred as Repository
public interface POIRepository extends JpaRepository<POI,Integer> {

    //Custom Queries for the DB excluding the common ones

    /*@Query("SELECT lat,lng FROM POI poi WHERE Tour=?1")
    List<POI> findByTourChoice(int Tour);*/

   /* @Query("SELECT poi.TourID,poi.lat,poi.lng,TourName.tourName,poi.tour_description FROM POI poi INNER JOIN poi.tourName WHERE TourID=?1")
    List<Object> findByTourID(int TourID);*/

    @Query("SELECT poi.TourID,poi.lat,poi.lng,poi.tour_description FROM POI poi INNER JOIN poi.tourName WHERE poi.TourID=:TourID")
    List<POI> findByTourID(@Param("TourID") int TourID);

}
