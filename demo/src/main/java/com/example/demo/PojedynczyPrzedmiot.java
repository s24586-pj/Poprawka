package com.example.demo;

public class PojedynczyPrzedmiot {

    String nazwa;

    public PojedynczyPrzedmiot(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "PojedynczyPrzedmiot{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
