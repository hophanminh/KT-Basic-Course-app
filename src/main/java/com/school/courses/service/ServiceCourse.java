package com.school.courses.service;

import com.school.courses.model.entity.Course;
import com.school.courses.model.entity.dto.CourseDto;
import com.school.courses.repo.CourseRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ServiceCourse {
    @Autowired
    private CourseRepo repo;
    public List<CourseDto> getCourses() {
        List<CourseDto> result = new ArrayList<>();

        log.debug("Get course:");

        repo.findAll()
                .forEach(course -> result.add(mapToDto(course)));

        return result;
    }

    private CourseDto mapToDto(Course course) {
        return CourseDto.builder()
                .mark(course.getMark())
                .name(course.getName())
                .build();
    }
}
