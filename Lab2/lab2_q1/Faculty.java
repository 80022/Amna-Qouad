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
public class Faculty extends Employee {
       private int  office_hour;
    private String rank;
    public void setOffice_hour(int o) {
        office_hour = o;
    }

    public void setRank(String r) {
        rank = r;
    }

    public int getOffice_hour() {
        return office_hour;
    }

    public String getRank() {
        return rank;
    }
    
    @Override
   public String toString()
    {
        return "Name of person is "+getName() +" ,"+ " Name of class is "+this.getClass();
    }
    
}
