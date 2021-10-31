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
public class Student extends Person {
      final String status1="freshman";
    final String status2="sophomore";
    final String status3="junior";
    final String status4="senior";
    
    @Override
   public String toString()
    {
        return "Name of person is "+getName() +" ,"+ " Name of class is "+this.getClass();
    }
    
}
