package com.multi.language.localization.service;

import java.util.Locale;

public interface LocalizationService {

    String getLocaleMessage(String messageKey, Locale locale);
}
