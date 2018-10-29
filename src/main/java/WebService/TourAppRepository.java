package WebService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository  // This class talks to to the database adn is referred as Repository
public interface TourAppRepository extends JpaRepository<POI,Integer> {

    //custom query to db excluding the common ones


    @Query("SELECT lat,lng FROM POI poi WHERE Tour=?1")
    List<POI> findByTourChoice(int Tour);
}
