package com.multi.language.localization.repository;

import com.multi.language.localization.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseJpa extends JpaRepository<Courses,Long> {
}
