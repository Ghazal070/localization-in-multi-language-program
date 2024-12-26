package com.multi.language.localization.repository;

import com.multi.language.localization.entity.CourseTranslation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CourseTranslationJpa extends JpaRepository<CourseTranslation,Long> {

    Optional<CourseTranslation> findByCourse_IdAndLanguage(Long courseId, String language);
}
