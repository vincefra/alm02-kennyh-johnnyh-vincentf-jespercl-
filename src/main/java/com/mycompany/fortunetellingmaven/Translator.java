/*
 */
package com.mycompany.fortunetellingmaven;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author kennyhoang
 */
@Named(value = "fortuneTeller")
@SessionScoped
public class Translator implements Serializable {
    
    private String name,lastname,gender,answer;
    ArrayList<String> answerList = new ArrayList<>();
    
    public Translator(){
        
        answerList.add("du kommer dö snart");
        answerList.add("du kommer leva förevigt");
        //for(int i = 0; i < 10; i++){
        //    answerList.add("hej " + i);
        //}
        
       // FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Managed Bean Initialized", null);
       // FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        
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
    public void setAnswer(){
        
        Person p = new Person(name,lastname,gender);
        RandomFactor rf = new RandomFactor(p);
        this.answer = answerList.get(rf.getRandomNumber());
         
    }

    public String getAnswer() {
        return answer;
    }
    
    
    public String generateAnswer(){
        
        setAnswer();
        
        return "page2";
    }
    /*public void Reset(){
        this.loan = null;
        this.rate = null;
        this.year = null;
        this.monthlyPayment = null;
        this.username = null;
    }

    //denna metod körs under process_validations men är tom. Process validation fasen konverterar den skickade värdet och kollar ifall det stämmer med det som efterfrågats.
    public void test(){
      */  
    
}
