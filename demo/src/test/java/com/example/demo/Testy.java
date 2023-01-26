package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Testy {

   Sklep sklep;

   @BeforeEach
   void Setup(){
       ListaPrzedmiotow listaPrzedmiotow=new ListaPrzedmiotow();
       sklep=new Sklep(listaPrzedmiotow);
   }
   @Test
    void PoprawnieSprawdzaCene(){
       Paragon test = sklep.Koszyk(
               new Uzytkownik("1",500),new Przedmiot("Mleko",3)
       );
       assertThat(test).hasToString("Paragon{saldo=497.0, status=UDALOSIE}");
   }
    @Test
    void PoprawnieSprawdzaCeneprzy100(){
        Paragon test = sklep.Koszyk(
                new Uzytkownik("1",100),new Przedmiot("Piwo",5)
        );
        assertThat(test).hasToString("Paragon{saldo=95.0, status=UDALOSIE}");
    }
    @Test
    void NieJestNullem(){
        Paragon test = sklep.Koszyk(
                new Uzytkownik("1",500),new Przedmiot("Mleko",5)
        );
        assertThat(test).isNotNull();
    }

}
