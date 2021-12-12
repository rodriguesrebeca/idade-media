package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//  Escreva um programa que lê nome e idade de 5 pessoas e
        //  ao final informa quem é o mais novo, o mais velho e qual a média de idade.
        Scanner scan = new Scanner(System.in);
        People[] person = new People[5];

        for (int i=0; i < person.length; i++){
            System.out.println("Digite o nome e em seguida a idade: ");
            person[i]=new People(scan.next(), scan.nextInt());
        }

        int younger = Integer.MAX_VALUE, older = 0;
        float average = 0;
        String nameOlder= "", nameYounger= "";

        for(int i=0; i<person.length; i++){
            if(younger > person[i].getAge()){
                younger = person[i].getAge();
                nameYounger = person[i].getName();
            }
            if(older < person[i].getAge()){
                older = person[i].getAge();
                nameOlder = person[i].getName();
            }

            average += person[i].getAge();
            if(i + 1 == person.length){
                average = average / person.length;
            }
        }
        System.out.println("IDADE DO MAIS NOVO: " + younger);
        System.out.println("NOME DO MAIS NOVO: " + nameYounger);
        System.out.println("IDADE DO MAIS VELHO: " + older);
        System.out.println("NOME DO MAIS VELHO: " + nameOlder);
        System.out.println("MÉDIA DAS IDADES: " + average);
    }


}
