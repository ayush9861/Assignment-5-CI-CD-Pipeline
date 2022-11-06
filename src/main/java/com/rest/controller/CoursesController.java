package com.rest.controller;

import com.rest.entities.Courses;
import com.rest.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/courses")
@CrossOrigin(origins = "*")

public class CoursesController {

    @Autowired
    private CoursesService coursesService;



    @GetMapping("/")
    private List<Courses> getCourses()
    {
        return coursesService.getAllCourses();
    }



    @GetMapping("/{id}")
    private Courses getById(@PathVariable String id)
    {
        return coursesService.getCoursesById(id);
    }


    @PostMapping("/add")
     public Courses addCourses(@RequestBody Courses courses) {
        return coursesService.AddCourses(courses);
    }

    @PutMapping("/update/{id}")
    private Courses UpdateCourses(@RequestBody Courses courses,@PathVariable String id)
    {
        courses.setCoursesId(id);
        this.coursesService.AddCourses(courses);
        return courses;
    }


    @DeleteMapping("/{id}")
    private void delete (@PathVariable String id)
    {
        coursesService.deleteCourses(id);

    }
    @GetMapping("/getByName/{name}")
    public List<Courses> getServerByName(@PathVariable (value = "name") String name)
    {
        return coursesService.getCoursesbyName(name);
    }
}


