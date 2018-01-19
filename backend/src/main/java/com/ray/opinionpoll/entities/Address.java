package com.ray.opinionpoll.entities;

import java.util.ArrayList;

/**
 * Created by i851981 on 11/5/17.
 */
public class Address {
    private String building;
    private ArrayList<Float> coord;
    private String street;
    private long zipcode;

    public Address(String building, ArrayList<Float> coord, String street, long zipcode) {
        this.building = building;
        this.coord = coord;

        this.street = street;
        this.zipcode = zipcode;
    }

    public ArrayList<Float> getCoord() {
        return coord;
    }

    public void setCoord(ArrayList<Float> coord) {
        this.coord = coord;
    }


    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }


}
