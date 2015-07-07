package be.vdab.controllers;

import be.vdab.domain.Car;
import be.vdab.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


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


}
