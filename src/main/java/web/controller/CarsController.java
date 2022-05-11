package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

import java.util.Optional;

@Controller
public class CarsController {

    private final CarServiceImp carServiceImp;

    @Autowired
    public CarsController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping("/cars")
    public String CarsTest(@RequestParam(value = "count") Optional<Integer> count, Model model) {

        model.addAttribute("cars", carServiceImp.carList(count.orElse(0)));

        return "cars";
    }
}
