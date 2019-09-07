/*
 */
package com.mycompany.fortunetellingmaven;

/**
 *
 * @author kenny
 */
public final class RandomFactor {

    RandomFactor(Person person) {
        this.person = person;
        setRandomNumber();
    }
    
    private int randomNumber;
    private final Person person;

    public void setRandomNumber() {

        if (person.getName().length() <= 5) {
            randomNumber = 0;

        } else {
            randomNumber = 1;
        }
        //Random randomGenerator=new Random();

        //randomNumber = randomGenerator.nextInt(10);
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
