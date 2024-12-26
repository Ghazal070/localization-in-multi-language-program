package com.multi.language.localization.repository;

import com.multi.language.localization.entity.CourseTranslation;

import java.util.Optional;

public interface CourseTranslationRepository {
    Optional<CourseTranslation> findByCourseIdAndLanguage(Long courseId, String lang);
}
