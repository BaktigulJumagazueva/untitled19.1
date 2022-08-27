package com.company;

import java.util.Objects;

public enum Days {
    MONDAY("дуйшомбу"),
    TUESDAY("шейшемби"),
    WEDNESDAY("шаршемби"),
    THURSDAY("бейшемби"),
    FRIDAY("жума"),
    SATURDAY("ишемби"),
    SUNDAY("жекшемби");


    private String kurguzchaKundor;

    Days(String kurguzchaKundor) {
    }


    public String getKurguzchaKundor() {
        return kurguzchaKundor;
    }

    public void setKurguzchaKundor(String kurguzchaKundor) {
        this.kurguzchaKundor = kurguzchaKundor;
    }

    String Days(String kurguzchaKundor) {
        this.kurguzchaKundor = kurguzchaKundor;


        if (Objects.equals(kurguzchaKundor, "дуйшомбу")) {
            System.out.println("техникалык английский,техникалак сабак ");
        } else if (Objects.equals(kurguzchaKundor, "шейшемби")) {
            System.out.println("практикалык сабак, практикалык английский");
        } else if (Objects.equals(kurguzchaKundor, "шаршемби")) {
            System.out.println("техникалак сабак, практикалык английский");
        } else if (Objects.equals(kurguzchaKundor, "бейшемби")) {
            System.out.println("практикалык сабак, Soft skills");
        } else if (Objects.equals(kurguzchaKundor, "жума")) {
            System.out.println("техникалак сабак, Event");
        } else if (Objects.equals(kurguzchaKundor, "ишемби")) {
            System.out.println("оз алдынча практика");
        }
        if (Objects.equals(kurguzchaKundor, "жекшемби")) {
            System.out.println("оз алдынча практика");
        }


        return kurguzchaKundor;
    }
}
