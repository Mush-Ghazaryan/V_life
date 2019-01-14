package com.training;
import java.util.*;
public abstract class PersonCreator {
    private String personName;
    //   private long personBirthday;
    private String personGender;


Scanner input = new Scanner(System.in);
    enum Profession {PROGRAMMER, DOCTOR, AUTOMECHANIK}
    public PersonCreator() {

    }
    public PersonCreator(String name, String gender) {
        personName = name;
        personGender = gender;
    }


    public String getPersonName() {
        personName = input.nextLine();
        System.out.println("Please, input your name: ");
        return personName;
    }

    public void setPersonGender() {

    }

    public String getPersonGender() {
        personGender = input.nextLine();
        System.out.println("Please, choose gender (male/female): ");
        return personGender;
    }
    public abstract void personEngagement();


}
