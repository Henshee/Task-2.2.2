package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Cars;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private CarDao carDao = new CarDaoImp();

    @Override
    public List<Cars> carList(int count) {
        return carDao.carList(count);
    }
}
