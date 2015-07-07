package be.vdab.controllers;


import be.vdab.repository.MakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/make")
public class MakeService {

    @Autowired
    private MakeRepository makeRepository;

    @RequestMapping("/all")
    public String allCarMakes() {
        return makeRepository.findAll().toString();
    }
}
