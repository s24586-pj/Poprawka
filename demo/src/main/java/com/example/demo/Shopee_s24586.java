package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Shopee_s24586
{
	public Shopee_s24586(Sklep sklep){

		Paragon paragon =sklep.Koszyk(
				new Uzytkownik("1",100),new Przedmiot("Mleko",5)
		);
		System.out.println(paragon);

		}


	public static void main(String[] args) {
		SpringApplication.run(Shopee_s24586.class, args);
	}

}
