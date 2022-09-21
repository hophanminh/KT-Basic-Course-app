package com.school.courses.repo;

import com.school.courses.model.entity.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface CourseRepo extends CrudRepository<Course, BigInteger> {
}
