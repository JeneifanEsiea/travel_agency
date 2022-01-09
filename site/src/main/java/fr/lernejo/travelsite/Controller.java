package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @PostMapping("/api/inscription")
    public void Register(@RequestBody Registration registration) {

    }

    @GetMapping("/api/travels")
    public List<Travel> getTravels(@RequestParam("userName") String userName) {
        return List.of(new Travel("Sri Lanka", 26.0), new Travel("Algeria", 14.0));
    }
}
