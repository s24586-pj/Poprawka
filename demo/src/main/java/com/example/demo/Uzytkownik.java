package com.example.demo;

public class Uzytkownik {

    String id;
    double saldo;

    public Uzytkownik(String id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Uzytkownik{" +
                "id='" + id + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
