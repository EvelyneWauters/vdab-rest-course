package be.vdab.controllers;

import be.vdab.domain.Car;
import be.vdab.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.*;
import static org.springframework.web.bind.annotation.RequestMethod.*;


@RestController
@RequestMapping("car")
public class CarService {

    @Autowired
    private CarRepository carRepository;


    @RequestMapping(value="id/{carId}")
    @ResponseBody
    public Car findById(@PathVariable("carId") int id)  {
        return carRepository.findOne(id);
    }

    @RequestMapping("/cars")
    @ResponseBody
    public String findAllCars()   {
        return carRepository.findAll().toString();
    }


    @RequestMapping(value="/create", method = POST, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity create(@RequestBody Car car) {
        carRepository.save(car);
        HttpHeaders header = new HttpHeaders();
        header.add("Location", "http://localhost:8080/car/id/" + car.getId());
        return new ResponseEntity(header, HttpStatus.CREATED);
    }


    @RequestMapping(value="/delete/{carId}", method = DELETE)
    public void deleteById(@PathVariable("carId") int id)   {
        carRepository.delete(id);
    }

    @RequestMapping(value="/update", method = PUT, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity update(@RequestBody Car car)  {
        carRepository.save(car);
        HttpHeaders header = new HttpHeaders();
        header.add("Location", "http://localhost:8080/car/id/" + car.getId());
        return new ResponseEntity(header, HttpStatus.CREATED);
    }
}












