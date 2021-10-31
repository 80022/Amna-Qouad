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
public class Person {
    private String name;
    private String address;
    private double phone_number;
    private String email_address;
    MyDate MyDate;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public double getPhone_number() {
        return phone_number;
    }

    public String getEmail_address() {
        return email_address;
    }
    public String toString()
    {
        return "Name of person is "+getName() +" ,"+ " Name of class is "+this.getClass();
    }
    
}
