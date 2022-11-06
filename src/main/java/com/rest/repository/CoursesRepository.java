package com.rest.repository;

import com.rest.entities.Courses;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;


public interface CoursesRepository extends MongoRepository<Courses,String> {

    List<Courses> findCoursesByCoursesName(String name);

}


