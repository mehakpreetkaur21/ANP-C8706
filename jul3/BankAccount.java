/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul3;

/**
 *
 * @author mehak
 */
public class BankAccount {
    static double RATE=5.7,TIME=2;
    public static double deposit(int amount){
        double si=(amount*RATE*TIME)/100;
        double f_amount=si+amount;
        return f_amount;
    }
     public static double deposit(int amount,double rate){
        double si=(amount*rate*TIME)/100;
        double f_amount=si+amount;
        return f_amount;
    }
     public static void main(String[] args){
         double a= deposit(12000);
         double b= deposit(12000,6.7);
         System.out.println(a + "  "+b);
     }
}
