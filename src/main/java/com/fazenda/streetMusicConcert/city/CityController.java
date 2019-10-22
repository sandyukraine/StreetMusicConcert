package com.fazenda.streetMusicConcert.city;

import com.fazenda.streetMusicConcert.instrument.MusicalInstrument;
import com.fazenda.streetMusicConcert.place.Place;
import com.fazenda.streetMusicConcert.util.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @RequestMapping("/city/{name}")
    public City getCityByName(@PathVariable("name") String name) {
        return cityRepository.findByName(name);
    }

    @RequestMapping("/cities")
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }
}