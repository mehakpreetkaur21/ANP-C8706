/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul3;

/**
 *
 * @author mehak
 */
public class Motorcycle extends Vehicle {
    @Override
     public void drive(){
     System.out.println("Wear a helmet and drive on the highway");
    }
    
             public static void main(String args[]){
 Vehicle a=new Vehicle();
 Vehicle c =new Car();
        a.drive();
        c.drive();
        
    }
}
    
}
