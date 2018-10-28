package WebService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // This class talks to to the database adn is referred as Repository
public interface TourAppRepository extends JpaRepository<POI,Integer> {

    //custom query to db excluding the common ones
}
