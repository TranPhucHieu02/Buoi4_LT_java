package com.example.buoi4.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.buoi4.Model.Course;
@Service
public class CourseService {
    private List<Course> lsCourse = new ArrayList<>();

    public void add(Course newProduct){
        lsCourse.add(newProduct);
    }
    public List<Course> GetAll(){
        return lsCourse;
    }
}
