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
public class Lab2_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Person p=new Person();
     p.setName("Ahmed");p.setAddress("minia");p.setPhone_number(334698643);p.setEmail_address("srfh@gmail.com");
     System.out.println(p.toString());
     
     Student std=new Student();
     std.setName("ali");std.setAddress("Alex");std.setEmail_address("fsscy.com");std.setPhone_number(45538765);
     System.out.println(std.toString())
             ;
     Employee emp =new Employee();
     emp.setName("esraa");emp.setAddress("minia");emp.setEmail_address("fdxsa.com");emp.setPhone_number(22345788); 
     emp.setOffice(110);emp.setSalary(3000);
     System.out.println(emp.toString());
     
     Faculty F=new Faculty();
     F.setName("Aya");F.setAddress("minia");F.setEmail_address("jhfre.com");F.setPhone_number(22345788); 
     F.setOffice(88);F.setSalary(2200);F.setOffice_hour(6);F.setRank("employee");
     System.out.println(F.toString());
     
     Staff S=new Staff();
     S.setName("Mohamed");S.setAddress("minia");S.setEmail_address("gfety.com");S.setPhone_number(26885218); 
     emp.setOffice(88);emp.setSalary(1500);S.setTitle(null);S.setTitle("staff_Software engineers");
     System.out.println(S.toString());
     
     MyDate M=new MyDate(2003,3,9);
   System.out.println(M.toString());
         
    }
    
}
