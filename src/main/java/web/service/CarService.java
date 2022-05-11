package web.service;

import web.model.Cars;

import java.util.List;

public interface CarService {
    List<Cars> carList(int count);
}
