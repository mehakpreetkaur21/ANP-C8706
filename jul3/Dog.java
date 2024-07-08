/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul3;

/**
 *
 * @author mehak
 */
public class Dog extends Animal
{
    @Override
       public void sound(){
        System.out.println("The dog barks");
    }
    public static void main(String args[]){
 Animal a=new Animal();
 Animal d =new Dog();
        a.sound();
        d.sound();
        
    }
}
