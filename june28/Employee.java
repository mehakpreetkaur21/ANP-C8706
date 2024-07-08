/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mehak
 */
package june28;
public class Employee {
    int id;
    String name;
    double salary;
    static String companyName="TCS";
    void shift(){
        System.out.println("9 to 5");
    }
    void getsalary(){
        System.out.println("100000/-");
    }
    public Employee (){
        System.out.println("");
    }
    public Employee(int idd, String namee,double salaryy){
        id = idd;
        name=namee;
        salary=salaryy;
    }

    public void display(){
        System.out.println("is id:"+id);
        System.out.println(" name is :"+name);
        System.out.println(" salary is :"+salary);
        System.out.println("company is :"+companyName);
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
}
