package com.example.paketshop;

import java.util.Locale;

public class Main {
    static Locale locale;

    public static Locale getLocale()
    {
        if(locale == null)
        {
            locale = new Locale("Deutsch", "DE");
        }
        return locale;
    }

    public static void setLocale(Locale newLocale)
    {
        locale = newLocale;
    }
}
