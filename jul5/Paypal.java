/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jul5;

/**
 *
 * @author mehak
 */
public class Paypal implements PaymentMethod {
    String email="hello@gmail.com";
       @Override
    public void pay(){
        System.out.println("pay here");
    }
     @Override
    public void getPaymentDetails(){
        System.out.println(email);
        
    }
}
