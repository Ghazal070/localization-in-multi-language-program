package com.multi.language.localization.repository;

import com.multi.language.localization.entity.Courses;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Locale;

@Repository
@RequiredArgsConstructor
public class CourseRepositoryImpl implements CourseRepository{

    private final CourseJpa courseJpa;

    @Override
    public Courses createCourse(Courses courses) {
        return courseJpa.save(courses);
    }
}
