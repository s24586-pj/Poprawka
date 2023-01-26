package com.example.demo;

public class Paragon {

    double saldo;
    Status status;

    public Paragon(double saldo, Status status) {
        this.saldo = saldo;
        this.status = status;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Paragon{" +
                "saldo=" + saldo +
                ", status=" + status +
                '}';
    }
}
