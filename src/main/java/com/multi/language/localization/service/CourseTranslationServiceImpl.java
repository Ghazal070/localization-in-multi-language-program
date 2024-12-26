package com.multi.language.localization.service;

import com.multi.language.localization.entity.CourseTranslation;
import com.multi.language.localization.repository.CourseRepository;
import com.multi.language.localization.repository.CourseTranslationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseTranslationServiceImpl implements CourseTranslationService {
    private final CourseTranslationRepository courseTranslationRepository;

    @Override
    public Optional<CourseTranslation> findByCourseIdAndLanguage(Long courseId, String lang) {
        return courseTranslationRepository.findByCourseIdAndLanguage(courseId,lang);
    }
}
