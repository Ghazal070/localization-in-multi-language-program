package com.multi.language.localization.service;

import com.multi.language.localization.entity.CourseTranslation;

import java.util.Optional;

public interface CourseTranslationService {


    Optional<CourseTranslation> findByCourseIdAndLanguage(Long courseId,String lang);
}
