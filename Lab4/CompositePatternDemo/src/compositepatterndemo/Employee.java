/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterndemo;

import java.util.List;

/**
 *
 * @author Kade
 */
public class Employee {
    private String name;
   private String dept;
   private int salary;
   private List<Employee> subordinates;
    private Employee(){}
    public void add(){}
    public void remove(){}
    public List<Employee> getSubordinates(){
     return null;
    }
    public String toString (){
     return null;
    }
}
