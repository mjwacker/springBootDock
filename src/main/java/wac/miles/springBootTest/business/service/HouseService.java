package wac.miles.springBootTest.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wac.miles.springBootTest.model.House;
import wac.miles.springBootTest.repository.HouseRepository;

@Service
public class HouseService {

    @Autowired
    HouseRepository houseRepository;

    House findById(Long id){
        House house = houseRepository.findById(id).get();

        return house;


    }


}
