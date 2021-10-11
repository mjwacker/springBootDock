package wac.miles.springBootTest.repository;

import org.springframework.data.repository.CrudRepository;
import wac.miles.springBootTest.model.House;

public interface HouseRepository  extends CrudRepository<House, Long> {
}
