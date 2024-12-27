package com.multi.language.localization.service;

import com.multi.language.localization.entity.CourseTranslation;
import com.multi.language.localization.repository.CourseRepository;
import com.multi.language.localization.repository.CourseTranslationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Locale;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CourseTranslationServiceImpl implements CourseTranslationService {
    private final CourseTranslationRepository courseTranslationRepository;

    @Override
    public Optional<CourseTranslation> findByCourseIdAndLanguage(Long courseId, String lang) {
        return courseTranslationRepository.findByCourseIdAndLanguage(courseId,lang);
    }

    @Override
    @Transactional
    public CourseTranslation createCourseTranslation(String title, Locale locale) {
        CourseTranslation courseTranslation = new CourseTranslation();
        courseTranslation.setTitle(title);
        courseTranslation.setLanguage(locale.getLanguage());
        return courseTranslationRepository.createCourseTranslation(courseTranslation);
    }
}
