package com.rest.service;

import com.rest.entities.Courses;
import com.rest.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {

    @Autowired
    private CoursesRepository coursesRepository;

    public List<Courses> getAllCourses() {
        List<Courses> list = this.coursesRepository.findAll();
        return list;
    }

    public Courses getCoursesById(String id) {

        return coursesRepository.findById(id).get();
    }


    public Courses AddCourses(Courses courses) {

        return coursesRepository.save(courses);

    }
    public void deleteCourses(String aid) {
        this.coursesRepository.deleteById(aid);
    }


    public List<Courses> getCoursesbyName(String name) {
        // TODO Auto-generated method stub
        return coursesRepository.findCoursesByCoursesName(name);
    }


}