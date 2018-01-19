package com.ray.opinionpoll.repositories;

import com.ray.opinionpoll.entities.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by i851981 on 11/5/17.
 */
public interface RestaurantRepository extends MongoRepository<Restaurant,Integer> {
}
