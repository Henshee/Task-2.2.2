package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{
    private Long counter = 0L;

    @Override
    public List<Cars> carList(int count) {
        List<Cars> carsList = new ArrayList<>();

        carsList.add(new Cars(++counter,"Tesla", 777, "silver"));
        carsList.add(new Cars(++counter,"Ferrari", 666, "dark"));
        carsList.add(new Cars(++counter,"Lamborghini", 555, "orange"));
        carsList.add(new Cars(++counter,"BMW", 333, "black"));
        carsList.add(new Cars(++counter,"Ford Mustang", 111, "yellow"));

        counter = 0L;

        if (count == 0) {
            return carsList;
        }
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
