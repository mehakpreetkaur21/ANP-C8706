/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul5;

/**
 *
 * @author mehak
 */
public class Main {
    public static void main(String args[]){
        CustomerImpl vv =new CustomerImpl();
        vv.saveCustomer();
        CustomerInterface.newFunctionality();
//        int a=vv.age;
        System.out.println(vv.age);
    }
}
