/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul1;

/**
 *
 * @author mehak
 */
public class Employee {
    String name, department;
    int id;
    double salary;
    public Employee(){
        System.out.println("Default constructor");
    }
    public Employee(String namee, String dept, int idd, double sal){
    this.name=namee;
    this.department=dept;
    this.id=idd;
    this.salary=sal;
    }
    public void display(){
        System.out.println("Name is :"+name);
        System.out.println("Department is :"+department);
        System.out.println("id is :"+id);
        System.out.println("salary is :"+salary);
    }
    public static void main(String args[]){
        Employee e1=new Employee();
        e1.display();
        Employee e2=new Employee("abc","dept1",121,122220);
        e2.display();
        
    }
}
