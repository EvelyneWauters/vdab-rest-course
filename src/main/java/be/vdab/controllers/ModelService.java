package be.vdab.controllers;


import be.vdab.domain.CarModel;
import be.vdab.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/model")
public class ModelService {

    @Autowired
    private ModelRepository modelRepository;

    @RequestMapping("/all")
    public String findAll()    {
        return modelRepository.findAll().toString();
    }

}
