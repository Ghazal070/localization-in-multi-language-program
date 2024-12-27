package com.multi.language.localization.service;

import com.multi.language.localization.entity.CourseTranslation;
import com.multi.language.localization.entity.Courses;
import com.multi.language.localization.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private  final CourseRepository courseRepository;
    private final CourseTranslationService courseTranslationService;
    private final LocalizationService localizationService;

    @Override
    public String getCourseTitle(Long courseId, Locale locale) {

        Optional<CourseTranslation> byCourseIdAndLanguage = courseTranslationService.findByCourseIdAndLanguage(courseId, locale.getLanguage());
        if (byCourseIdAndLanguage.isPresent()) {
            CourseTranslation courseTranslation = byCourseIdAndLanguage.get();

                return courseTranslation.getTitle();
            }
            return localizationService.getLocaleMessage("Course.not.found",locale);
    }

    @Override
    public Courses createCourse(String code,String title, Locale locale) {
        Courses courses = new Courses();
        courses.setCode(code);
        CourseTranslation courseTranslation = courseTranslationService.createCourseTranslation(title, locale);
        courses.setTranslations(List.of(courseTranslation));
        return courseRepository.createCourse(courses);
    }
}
