package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;


@Controller
public class CarController {

    CarServiceImpl carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue="5") int amount, Model model) {
        List<Car> carList = carService.getCars();
        if (amount > 0 && amount <= carList.size()) {
            model.addAttribute("cars", carService.getCars().subList(0, amount));
        } else {
            model.addAttribute("cars", carService.getCars());
        }
        return "cars";
    }
}
