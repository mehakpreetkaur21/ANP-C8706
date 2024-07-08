/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul2;

/**
 *
 * @author mehak
 */
public class SportsCar extends Car {
    public  void  drive(){
        System.out.println("The sportscar is racing");
    }
    public static void main(String args[]){
        SportsCar s=new SportsCar();
        Car c=new Car();
        c.drive();
       s.drive();
    }
}
