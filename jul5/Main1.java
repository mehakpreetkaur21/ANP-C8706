/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul5;

/**
 *
 * @author mehak
 */
public class Main1 {
    public static void main(String args[]){
        Paypal p =new Paypal();
        CreditCard p2 =new CreditCard();
        p.pay();
        p.getPaymentDetails();
        p2.pay();
        p2.getPaymentDetails();
    }
}
