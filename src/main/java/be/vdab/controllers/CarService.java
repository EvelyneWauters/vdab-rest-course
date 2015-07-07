package be.vdab.controllers;

import be.vdab.domain.Car;
import be.vdab.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.*;
import static org.springframework.web.bind.annotation.RequestMethod.*;


@RestController
@RequestMapping("car")
public class CarService {

    @Autowired
    private CarRepository carRepository;


    @RequestMapping(value="/{carId}")
    @ResponseBody
    public Car findById(@PathVariable("carId") int id)  {
        return carRepository.findOne(id);
    }

    @RequestMapping("/cars")
    @ResponseBody
    public String findAllCars()   {
        return carRepository.findAll().toString();

    }


    @RequestMapping(value="/new/create", method = POST, consumes = APPLICATION_JSON_VALUE)
    public void create(@RequestBody Car car) {
        carRepository.save(car);
    }
}
