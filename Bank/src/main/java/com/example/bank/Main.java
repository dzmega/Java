package com.example.bank;

import java.time.format.ResolverStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    static Locale locale;

    public static Locale getLocale()
    {
        if(locale == null)
        {
            locale = new Locale("de", "DE");
        }
        return locale;
    }

    public static void setLocale(Locale newLocale)
    {
        locale = newLocale;
    }
}
