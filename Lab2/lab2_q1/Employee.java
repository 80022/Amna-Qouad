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
public class Employee extends Person{
      private int office;
    private double salary;
    private int date_hired;
    public void setOffice(int office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public int getDate_hired() {
        return date_hired;
    }
    @Override
   public String toString()
    {
        return "Name of person is "+getName() +" ,"+ " Name of class is "+this.getClass();
    }
    

    
}
