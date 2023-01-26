package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class Sklep {

 ListaPrzedmiotow listaPrzedmiotow;

    public Sklep(ListaPrzedmiotow listaPrzedmiotow) {
        this.listaPrzedmiotow = listaPrzedmiotow;
    }

    public Paragon Koszyk(Uzytkownik uzytkownik,Przedmiot przedmiot){
         double saldo=0;
        double AktualneSaldoUzytkownika;
        double cenaPrzedmiotu;
          AktualneSaldoUzytkownika= uzytkownik.getSaldo();
         cenaPrzedmiotu=przedmiot.getCena();
         saldo=AktualneSaldoUzytkownika-cenaPrzedmiotu;

       if(saldo<0)
       {
           System.out.println("Masz za malo pieniedzy na koncie by zrobic zakupy");
           return null;
       }
       if(saldo>0){
           System.out.println("Udalo ci sie zrobic zakupy");
           return new Paragon(saldo,Status.UDALOSIE);
       }
        return null;

    }


}
