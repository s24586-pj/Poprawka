package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
public class ListaPrzedmiotow {

    private final ArrayList<Przedmiot> przedmioty = new ArrayList<>();

    public ListaPrzedmiotow(){
        przedmioty.add(new Przedmiot("Mleko",3));
        przedmioty.add(new Przedmiot("Piwo",5));
        przedmioty.add(new Przedmiot("Sok",7));
    }

    public ArrayList<Przedmiot> getPrzedmioty() {
        return przedmioty;
    }
    public void DodajDoListy(Przedmiot przedmiot){
        przedmioty.add(przedmiot);
    }

}
