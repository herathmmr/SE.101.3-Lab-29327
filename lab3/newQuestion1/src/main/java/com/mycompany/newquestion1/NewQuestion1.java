

package com.mycompany.newquestion1;

/**
 *
 * @author Malshan
 */
public class NewQuestion1 {

    public static void main(String[] args) {
        
        encapsulation e1=new encapsulation();
        e1.setName("malshan");
        e1.setAge(22);
        e1.setSalary(25000.00f);
       
        
        System.out.println("Name: "+e1.getName());
        System.out.println("Age: "+e1.getAge());
        System.out.println("Salary: "+e1.getSalary());
    }
}
