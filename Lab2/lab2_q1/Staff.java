/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_q1;

/**
 *
 * @author Computer Science
 */
public class Staff extends Employee{
    private String title;

    public void setTitle(String t) {
       title=t;
    }

    public String getTitle() {
        return title;
    }
    @Override
   public String toString()
    {
        return "Name of person is "+getName() +" ,"+ " Name of class is "+this.getClass();
    }    
}
