/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_q2;
import com.sun.jndi.cosnaming.IiopUrl;

/**
 *
 * @author Computer Science
 */
public class Student {
    String name;
    private int ID;
    double student_GPA;
    Subject subject;
    Address address;

    public Student(String name, double student_GPA,Subject subject, Address address) {
        this.name = name;
        this.student_GPA = student_GPA;
        this.subject = subject;
        this.address = address;
    }

   
    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
    void display()
    {
        System.out.println("Student name is: "+name+" ,Std_id is: "+ID+ " and std_GPA is:  "+ student_GPA);
        System.out.println("Student_subject is: "+subject.name+" ,Subject_id is: "+subject.id+" and Subject_hours is: "+subject.hours);
        System.out.println("Student_Address is: "+address.country+" "+address.city+" "+address.streetNo);
    }
    
}
