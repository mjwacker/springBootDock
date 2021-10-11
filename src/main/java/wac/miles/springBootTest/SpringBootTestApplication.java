package wac.miles.springBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import wac.miles.springBootTest.model.House;
import wac.miles.springBootTest.repository.HouseRepository;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootTestApplication {

	@Autowired
	HouseRepository houseRepository;

	public static void main(String[] args) {

		SpringApplication.run(SpringBootTestApplication.class, args);
	}

	@PostConstruct
	private void initDb(){
		House house = new House();
		house.setBathrooms(3);
		house.setBedrooms(3);
		house.setId(1L);
		houseRepository.save(house);

		House house2 = new House();
		house2.setBathrooms(2);
		house2.setBedrooms(4);
		house2.setId(2L);
		houseRepository.save(house2);
	}



}
