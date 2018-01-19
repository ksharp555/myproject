package com.ray.opinionpoll.services;

import com.ray.opinionpoll.entities.Restaurant;
import java.util.List;

/**
 * Created by i851981 on 11/8/17.
 */
public interface RestaurantService {
    public List<Restaurant> findAll();
}
