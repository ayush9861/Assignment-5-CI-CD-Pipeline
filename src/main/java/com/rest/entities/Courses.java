package com.rest.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import org.springframework.data.annotation.Id;


import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Document
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String coursesId;


    private String coursesName;

    private String coursesCode;

    private int coursesDuration;

    public Courses(String coursesId, String coursesName, String coursesCode, int coursesDuration) {
        this.coursesId = coursesId;
        this.coursesName = coursesName;
        this.coursesCode = coursesCode;
        this.coursesDuration = coursesDuration;
    }




    public Courses() {

    }


    public String getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(String coursesId) {
        this.coursesId = coursesId;
    }

    public String getCoursesName() {
        return coursesName;
    }

    public void setCoursesName(String coursesName) {
        this.coursesName = coursesName;
    }

    public String getCoursesCode() {
        return coursesCode;
    }

    public void setCoursesCode(String coursesCode) {
        this.coursesCode = coursesCode;
    }

    public int getCoursesDuration() {
        return coursesDuration;
    }

    public void setCoursesDuration(int coursesDuration) {
        this.coursesDuration = coursesDuration;
    }

    @Override
    public String toString() {
        return "Courses [coursesName=" + coursesName + ", coursesId=" + coursesId + ", coursesCode=" + coursesCode + ", coursesDuration=" + coursesDuration + "]";
    }


}