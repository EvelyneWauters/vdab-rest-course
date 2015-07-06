package be.vdab;

import be.vdab.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
    @Autowired
    private CarRepository repository;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello()   {
        return repository.findAll().toString();
    }

}
