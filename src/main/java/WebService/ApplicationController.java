package WebService;

import WebService.Model.POI;
import WebService.Model.TourName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController // This means that this class is a Controller
public class ApplicationController
{

    @Autowired //automatically resolve the instance
            // and inject it into the class that declared it
    POIRepository POIRepository;

    @Autowired
    TourNameRepository TourNameRepository;

   /* With these methods we handle the queries for the db */

    // Return all rows from poi table
    @GetMapping(path="/poi")
    public List<POI> index()
    {
        return POIRepository.findAll();
    }

   // Return all rows of lat,lng where TourName=1 from poi table
    /*@GetMapping(path="poi/{Tour}")
    public List<POI> showTour(@PathVariable int Tour){
       return tourAppRepository.findByTourChoice(Tour);
    }*/

    @GetMapping(path="poi/{TourID}")
    public List<POI> showTourID(@PathVariable int TourID)
    {return POIRepository.findByTourID(TourID);}


}
