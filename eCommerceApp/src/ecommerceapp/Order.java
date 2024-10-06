/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerceapp;

import java.util.ArrayList;

/**
 *
 * @author ozgeucar
 */
public class Order {
    private Product product;
    private User user;

    private ArrayList<Product> productsOrdered;
    
    public Order(User user,Product product){
        this.product=product;
        this.user=user;
        if (user != null) {
            this.productsOrdered=user.getProductsOrdered();
        }
        else{
            this.productsOrdered=new ArrayList<>();
        }

    }
    public User getUser() {
        return user;
    }


    
    public void processOrder(int numOfOrder, CreditCard creditCard) {

            if (numOfOrder > 0) {

            
                if (product.controlStock(numOfOrder)) {
                    user.purchaseProduct(product, numOfOrder, creditCard);
                
                    if (creditCard != null) {
                        System.out.println("Your order has happened successfully");
                    } 
                    else {
                        System.out.println("Your order details are invalid");
                    }
                 } 
                else {
                    System.out.println("Not enough stock for the product: " + product.getProductName());
                }
            } 
            else {
                System.out.println("Invalid order quantity: " + numOfOrder);
            }
        }
    }





