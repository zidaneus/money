package service;

import java.util.Collection;

import model.Car;

public interface CarService {

    Boolean add(Car car);

    void update(Car car);

    Collection<Car> getCars(String search);

    void delete(Car car);

}