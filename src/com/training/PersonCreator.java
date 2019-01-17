package com.training;

import java.util.*;

public abstract class PersonCreator {
    private String personName;

    private String personGender;
    public double currentBalance = 0;

    Scanner input = new Scanner(System.in);


    public PersonCreator() {

    }

    public PersonCreator(String name, String gender) {
        personName = name;
        personGender = gender;

    }


    private String getPersonName() {
        personName = input.nextLine();
        System.out.println("Please, input your name: ");
        return personName;
    }



    private String getPersonGender() {
        personGender = input.nextLine();
        System.out.println("Please, choose gender (male/female): ");
        return personGender;
    }
    public abstract void personEngagement();
    public abstract void isBalanceNeeded();


}
