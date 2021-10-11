package wac.miles.springBootTest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import wac.miles.springBootTest.model.House;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/house")
@Api(value="house", description="rest endpoint for house objects..")
public class HouseController {

    @ApiOperation(value = "Returns a house object give the id.",response = House.class)
    @GetMapping("/{id}")
    public @ResponseBody  House getById(@PathVariable(name="id") Long id){
        House house = new House();
        house.setBathrooms(2);
        house.setBedrooms(4);
        return house;
    }

    @ApiOperation(value = "Returns all house objects.",response = House.class)
    @GetMapping("/all")
    public @ResponseBody List<House> getAll(){
        ArrayList<House>  houses = new ArrayList<>();
        //House house = new House();
        //house.setBathrooms(2);
        //house.setBedrooms(4);
        //houses.add(house);
        return houses;
    }




}
