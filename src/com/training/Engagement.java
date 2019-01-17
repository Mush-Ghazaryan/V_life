package com.training;


public class Engagement extends PersonCreator {


    private String personWish;


    private enum whatToDo {STUDY, WORK, ENTERTAIN}


    private String personName;
    //   private long personBirthday;
    private String personGender;


    public void engagementKeyMethod() {
        definePersonName();
        definePersonGender();
        personEngagement();
        isBalanceNeeded();

    }

    public void setPersonWish(String personWish) {
        this.personWish = personWish;
    }

    public String getPersonWish() {
        return personWish;
    }

    private void definePersonName() {

        System.out.println("Please, input your name: ");
        personName = input.nextLine();
    }

    private void definePersonGender() {

        System.out.println("Please, choose gender  male/female: ");
        personName = input.nextLine();
    }

    @Override
    public void personEngagement() {
        System.out.println("Choose, what you want to do from the list: ");
        System.out.println("STUDY, WORK, ENTERTAIN");
        personWish = input.nextLine();

    }


    @Override
    public void isBalanceNeeded() {
        Study study = new Study();
        switch (getPersonWish()) {
            case "STUDY":
                if (currentBalance < study.getJavaBasics() && currentBalance < study.getIntermediateJava() &&
                        currentBalance < study.getAdvancedJava()) {
                    System.out.println("You have no enough money on you Balance.");
                    System.out.println("Please, get money and try again.");
                } else {
                    System.out.println("Choose what course you prefer. ");
                    break;
                }
            case "WORK":
                System.out.println("What profession do you prefer?");
                break;

            case "ENTERTAIN":
                System.out.println("Enjoy");
        }
    }
}

