package model.dao;

import java.util.Collection;
import java.util.List;

import model.Car;

public interface CarDao {
  void add(Car car);
  void update(Car car);
  void delete(Car car);
  Collection<Car> getCars(String search);
  public List findByCar(String name, Long price);
}