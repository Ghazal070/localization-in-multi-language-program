package com.multi.language.localization.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
public class LocaleConfig {

    // Use AcceptHeaderLocaleResolver to get the locale from the Accept-Language header
    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        // You can set a default locale if needed
        localeResolver.setDefaultLocale(new java.util.Locale("en", "US"));
        localeResolver.getSupportedLocales();
        return localeResolver;
    }

    // Interceptor to change locale dynamically using "lang" parameter in the URL (optional)
//    @Bean
//    public LocaleChangeInterceptor localeChangeInterceptor() {
//        LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
//        interceptor.setParamName("lang"); // Parameter to change the locale (e.g., ?lang=en)
//        return interceptor;
//    }

    // Register interceptor (optional if you want to change locale via the "lang" query param)
//    @Bean
//    public WebMvcConfigurer localeConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addInterceptors(InterceptorRegistry registry) {
//                registry.addInterceptor(localeChangeInterceptor());
//            }
//        };
//    }

    // Configure the MessageSource to load message properties files
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages"); // Location of your message files
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setCacheSeconds(3600); // Reload every hour
        return messageSource;
    }
}