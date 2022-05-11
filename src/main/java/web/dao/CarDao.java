package web.dao;

import web.model.Cars;

import java.util.List;

public interface CarDao {
    List<Cars> carList(int count);
}
