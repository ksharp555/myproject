package com.ray.opinionpoll.repositories;

import com.ray.opinionpoll.entities.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by i857019 on 8/9/17.
 */
public interface UserRepository extends MongoRepository <Users,Integer>
{
}
