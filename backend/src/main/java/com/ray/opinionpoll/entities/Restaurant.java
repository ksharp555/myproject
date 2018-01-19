package com.ray.opinionpoll.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by i851981 on 11/5/17.
 */

@Document(collection="restaurants")
public class Restaurant {


    @Id
    private BigInteger restaurant_id;
    private String borough;
    private String cuisine;
    private String name;
    private Address address;
    private ArrayList<Grade> grades;


    public Restaurant(BigInteger restaurant_id, String borough, String cuisine, String name, Address address, ArrayList<Grade> grades) {
        this.restaurant_id = restaurant_id;
        this.borough = borough;
        this.cuisine = cuisine;
        this.name = name;
        this.address = address;
        this.grades = grades;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public BigInteger getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(BigInteger restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getBorough() {
        return borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }




}
