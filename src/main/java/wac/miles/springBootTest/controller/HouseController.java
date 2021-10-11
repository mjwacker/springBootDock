package wac.miles.springBootTest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wac.miles.springBootTest.model.House;
import wac.miles.springBootTest.repository.HouseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@RestController
@RequestMapping("/house")
@Api(value="house", description="rest endpoint for house objects..")
public class HouseController {

    @Autowired
    HouseRepository houseRepository;

    @ApiOperation(value = "Returns a house object give the id.",response = House.class)
    @GetMapping("/{id}")
    public @ResponseBody  House getById(@PathVariable(name="id") Long id){
        return houseRepository.findById(id).orElse(new House());
    }

    @ApiOperation(value = "Returns all house objects.",response = House.class)
    @GetMapping("/all")
    public @ResponseBody List<House> getAll(){
        ArrayList<House>  houses = new ArrayList<>();
        return  StreamSupport.stream(houseRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());

    }




}
