package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao{
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("KAMAZ", 100, 2020));
        cars.add(new Car("GAZ", 120, 2015));
        cars.add(new Car("URAL", 140, 2022));
        cars.add(new Car("BELAZ", 80, 2010));
        cars.add(new Car("SHAKMAN", 110, 2023));
    }

    @Override
    public List<Car> getCarList() {
        return cars;
    }

    @Override
    public void setCarList(List<Car> cars) {
        this.cars = new ArrayList<>(cars);
    }
}
