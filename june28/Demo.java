/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package june28;

/**
 *
 * @author mehak
 */
public class Demo {
   public static void main(String args[]){
       Employee e1 = new Employee();
       e1.name="MEhakpreet Kaur";
       e1.id=121;
       e1.salary=100000;
       System.out.println(e1.name);
       e1.shift();
       Employee e2 =new Employee(130, "Mehakpeet" ,230000);
        e2.display();
        int res=e2.add(12,12,12);
        System.out.println(res);

   } 
}
