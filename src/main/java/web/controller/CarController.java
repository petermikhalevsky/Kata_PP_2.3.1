package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private CarService carservice;
    private CarDao cardao;

    @Autowired
    public CarController(CarService carservice, CarDao cardao) {
        this.carservice = carservice;
        this.cardao = cardao;
    }

    @GetMapping(value="/Car")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = cardao.getCarList();
        cars = carservice.getCarList(cars, count);
        model.addAttribute("cars", cars);
        return "Car";
    }
}
