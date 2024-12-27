package com.multi.language.localization.repository;

import com.multi.language.localization.entity.Courses;

import java.util.Locale;

public interface CourseRepository {
    Courses createCourse(Courses courses);

}
