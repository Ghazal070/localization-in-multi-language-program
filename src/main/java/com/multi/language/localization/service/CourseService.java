package com.multi.language.localization.service;

import com.multi.language.localization.entity.Courses;

import java.util.Locale;

public interface CourseService {

    String getCourseTitle(Long courseId,  Locale locale);

    Courses createCourse(String code, String title, Locale locale);
}
