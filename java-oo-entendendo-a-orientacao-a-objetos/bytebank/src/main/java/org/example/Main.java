package org.example;

public class Main {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 200;

        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;

        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();

        segundaConta.saldo = 50;

        System.out.println("Primeira conta tem " + primeiraConta.saldo);
        System.out.println("Segunda conta tem " + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

//        caso não estanciado em um contrutor, o atributo irá vir com o valor
//        igual a zero, mas podemos setar ele, setar no construtor, ou colocar um valor padrão no atributo
        primeiraConta.agencia = 146;

        System.out.println(primeiraConta.agencia);

        if (primeiraConta == segundaConta) {
            System.out.println("Mesma conta");
        } else {
            System.out.println("COntas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}