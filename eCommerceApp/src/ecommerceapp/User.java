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
public class User {
    private String userName;
    private String name ;
    private String surName;
    private String password;
    private String dateOfBirth;
    private String emailAdress;
    private String homeAdress;
    private String workAdress;

    private ArrayList<Product>productsOrdered;
    private ArrayList<Product>favoriteProducts;

    private CreditCard creditCard;

    public User(String userName, String name, String surName, String password, String dateOfBirth, String emailAdress, 
            String homeAdress, String workAdress, CreditCard creditCard){
        this.userName=userName;
        this.name=name;
        this.surName=surName;
        this.password=password;
        this.dateOfBirth=dateOfBirth;
        this.emailAdress=emailAdress;
        this.homeAdress=homeAdress;
        this.workAdress=workAdress;
        this.creditCard=creditCard;

        favoriteProducts=new ArrayList<>();
        productsOrdered=new ArrayList<>();
        
    
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getHomeAdress() {
        return homeAdress;
    }
    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public String getWorkAdress() {
        return workAdress;
    }
    public void setWorkAdress(String workAdress) {
        this.workAdress = workAdress;
    }
    public CreditCard getCreditCard(){
        return creditCard;
        
    }
    public void setCreditCard(CreditCard creditCard){
        this.creditCard=creditCard;
    }

    
        public ArrayList<Product> getProductsOrdered(){
        return productsOrdered;
    }

    public void performOrdering(){
        if (productsOrdered.size()!=0) {
            System.out.println(getName()+" all your orders: ");
            for(Product product:productsOrdered){
                System.out.println(product.getProductName());
            }
            System.out.println("**************************************");
        }
        else{
            System.out.println(getName()+" your shopping cart is empty");
        }
        System.out.println("**************************************");

    }
    
    public void performFavorites(){
        if (favoriteProducts.size()!=0) {
            System.out.println("Dear "+ getName() + ": Your favorite products: ");
            for(Product product: favoriteProducts){
                System.out.println(product.getProductName());
            }  
            
        }
        else{
            System.out.println(getName()+" your favorite list is empty");
        }
        System.out.println("**************************************");
        
    }

    public void addOrdering(Product product){
        this.productsOrdered.add(product);
    }
    
    public void removeOrdering(Product product){
        this.productsOrdered.remove(product);
        System.out.println(product.getProductName()+" has been removed from your shopping cart");
    }

    public void addFavorite(Product product){
        favoriteProducts.add(product);    
    }
    
    public void removeFavorite(Product product){
        favoriteProducts.remove(product);
    }
    

    
    
    
    public void purchaseProduct(Product product,int numOfOrder,CreditCard creditCard){
        if (product.getProductStock()>0) {            
            this.addOrdering(product);
    }
        else{
            System.out.println("Sorry "+product.getProductName()+" is out of stock");
        }
    }

    


}

    


  

