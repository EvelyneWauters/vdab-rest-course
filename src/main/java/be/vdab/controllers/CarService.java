package be.vdab.controllers;

import be.vdab.domain.Car;
import be.vdab.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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


    @RequestMapping(value="/create", method = RequestMethod.POST, consumes = "application/json")
    public void create(@RequestBody Car car) {
        carRepository.save(car);
    }
}
