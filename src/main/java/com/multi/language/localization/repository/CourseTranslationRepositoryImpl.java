package com.multi.language.localization.repository;

import com.multi.language.localization.entity.CourseTranslation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseTranslationRepositoryImpl implements CourseTranslationRepository {

    private final CourseTranslationJpa courseTranslationJpa;

    @Override
    public Optional<CourseTranslation> findByCourseIdAndLanguage(Long courseId, String lang) {
        return courseTranslationJpa.findByCourse_IdAndLanguage(courseId,lang);
    }
}
