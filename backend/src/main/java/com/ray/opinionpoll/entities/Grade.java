package com.ray.opinionpoll.entities;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import java.util.Date;

/**
 * Created by i851981 on 11/5/17.
 */
public class Grade {
    @DateTimeFormat(iso = ISO.DATE)
    private Date date;
    private String grade;
    private int score;

    public Grade( Date date, String grade, int score) {
        this.date = date;
        this.grade = grade;
        this.score = score;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
