package WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This means that this class is a Controller
public class ApplicationController {

    @Autowired //automatically resolve the instance
            // and inject it into the class that declared it
    TourAppRepository tourAppRepository;

   // handle the queries for the db,see tutorial
}
