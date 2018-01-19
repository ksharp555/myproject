package com.ray.opinionpoll.services.servicesImpl;

import com.ray.opinionpoll.entities.Restaurant;
import com.ray.opinionpoll.repositories.RestaurantRepository;
import com.ray.opinionpoll.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by i851981 on 11/15/17.
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> findAll() {
        return this.restaurantRepository.findAll();
    }
}
