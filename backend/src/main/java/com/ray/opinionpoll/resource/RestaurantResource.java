package com.ray.opinionpoll.resource;

import com.ray.opinionpoll.entities.Restaurant;
import com.ray.opinionpoll.repositories.RestaurantRepository;
import com.ray.opinionpoll.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by i851981 on 11/5/17.
 */

@RestController
@RequestMapping("/rest/restaurants")
public class RestaurantResource {

    private RestaurantService restaurantService;

    @Autowired
    public RestaurantResource(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/all")
    public List<Restaurant> getAll() { return this.restaurantService.findAll(); }
}
