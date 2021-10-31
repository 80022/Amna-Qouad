/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_q2;

/**
 *
 * @author Computer Science
 */
public class Lab2_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Subject sub=new Subject("CS381","Software Development",3);
        Address add=new Address(20,"Minia","Egypt");
        Student std=new Student("Ali",3.0,sub,add);
        std.setID(99);
        std.display();
    }
    
}
