package com.example.buoi4.Model;

import java.time.LocalDate;

public class Course {
    private int id;
    private String lectureName;
    private String place;
    private LocalDate startDate;
    
    public Course() {
    }
    public Course(int id, String lectureName, String place, LocalDate startDate) {
        this.id = id;
        this.lectureName = lectureName;
        this.place = place;
        this.startDate = startDate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLectureName() {
        return lectureName;
    }
    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public LocalDate getstartDate() {
        return startDate;
    }
    public void setstartDate(LocalDate startDate) {
        this.startDate = startDate;
    }    

}
