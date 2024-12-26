package com.multi.language.localization.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
@RequiredArgsConstructor
public class LocalizationServiceImpl implements LocalizationService {

    private final MessageSource messageSource;

    @Override
    public String getLocaleMessage(String messageKey, Locale locale) {
        return messageSource.getMessage(messageKey,null,locale);
    }
}
