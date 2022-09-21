package com.school.courses.controller;

import com.school.courses.model.entity.dto.CourseDto;
import com.school.courses.service.ServiceCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class Controller {

    @Autowired
    private ServiceCourse service;

    @GetMapping
    public List<CourseDto> getCourse() {
        return service.getCourses();
    }

}
