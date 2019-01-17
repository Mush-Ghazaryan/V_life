package com.training;

public class Work extends PersonCreator {


    private String prof;

    private enum proffession {PROGRAMMER, MEDIC, SALES_PERSON}

    private int workTime;

    private int salary;

    public void letsWork() {
        selectingProfession();
        personEngagement();
        startingWork();
        isBalanceNeeded();
    }

    private void setProffession(String prof) {
        this.prof = prof;
    }

    private String getProffession() {
        return prof;
    }


    public void selectingProfession() {

        System.out.println("Select the job from the list: ");
        System.out.println("PROGRAMMER, MEDIC, SALES PERSON");
        prof = input.nextLine();

    }

    @Override
    public void personEngagement() {
        switch (getProffession()) {
            case "PROGRAMMER":
                System.out.println("Programmer's Salary is 12$ Per Hour");
                salary = 12;
                break;
            case "MEDIC":
                System.out.println("Medic's Salary is 20$ Per Hour");
                salary = 20;
                break;
            case "SALES PERSON":
                System.out.println("Sales Person's Salary is 4$ Per Hour");
                salary = 4;
                break;
        }
    }

    private void startingWork() {
        System.out.println("Enter time (in hour) how long to work: ");
        workTime = input.nextInt();
        for (int i = 0; i < workTime * 60; i++) {
            System.out.println(">>");
        }
    }

    @Override
    public void isBalanceNeeded() {
        Study study = new Study();
        for (int i = 0; i < 25; i++) {
            currentBalance += workTime * salary;
            System.out.println("New Balance is " + currentBalance + "$");
            if (currentBalance < study.getJavaBasics()) {
                System.out.println("Your balance is not enough for " + prof + "'S studying");
                System.out.println("You have to work more");
                startingWork();
            }else{
                break;
            }
        }
       System.out.println("Let's go for studying.");
    }
}




