package fr.lernejo.prediction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class Controller {
    @GetMapping("/api/temperature")
    public ListWeather getTemperature(@RequestParam String country){
        System.out.println("one, two, this is a test????");
        final TemperatureService temperatureService = new TemperatureService();
        double temperature1 = temperatureService.getTemperature(country);
        double temperature2 = temperatureService.getTemperature(country);
        //Date d'aujourd'hui
        LocalDate date1 = LocalDate.now();
        //Date d'aujourd'hui - 1
        LocalDate date2 = LocalDate.now().minusDays(1);
        return new ListWeather(country, List.of(new Weather(date1.toString(),temperature1),new Weather(date2.toString(),temperature2)));
}}

