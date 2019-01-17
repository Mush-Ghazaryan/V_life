package com.training;

public class Study extends PersonCreator {
    public int javaBasics = 100;
    private int intermediateJava = 300;
    private int advancedJava = 1200;

    public void setJavaBasics(int javaBasics) {
        this.javaBasics = javaBasics;
    }
    public int getJavaBasics() {
        return javaBasics;
    }
    public void setIntermediateJava(int intermediateJava) {
        this.intermediateJava = intermediateJava;
    }
    public int getIntermediateJava() {
        return javaBasics;
    }
    public void setAdvancedJava(int advancedJava) {
        this.advancedJava = advancedJava;
    }
    public int getAdvancedJava() {
        return javaBasics;
    }


    public void letsStudy() {
        personEngagement();
        isBalanceNeeded();
    }

    @Override
    public void personEngagement() {
//switch
    }

    @Override
    public void isBalanceNeeded() {

    }
}
