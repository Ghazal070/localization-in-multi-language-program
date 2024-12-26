package com.multi.language.localization.controller;

import com.multi.language.localization.config.LocaleConfig;
import com.multi.language.localization.service.CourseService;
import com.multi.language.localization.service.LocalizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping("api/v1/courses")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;
    private final LocalizationService localizationService;

    @GetMapping("/{courseId}")
    public String getCourse(@PathVariable Long courseId, Locale locale) {
        return courseService.getCourseTitle(courseId, locale);
    }

    @GetMapping("/welcome")
    public String welcome(Locale locale) {
        return localizationService.getLocaleMessage("welcome.message", locale);
    }
}
