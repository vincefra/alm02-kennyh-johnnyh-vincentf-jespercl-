/*
 */

package com.mycompany.fortunetellingmaven;

import java.io.Serializable;

/**
 *
 * @author kenny
 */
public class Person implements Serializable {
    private String name,lastname,gender;

    public Person(String name, String lastname,String gender) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



}
