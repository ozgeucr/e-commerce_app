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
public class Product {
    private String productName;
    private String productColor;
    private String productCatagory;
    private int productStock;
    private double productWeight;
    private String infoAboutProduct;
   
    private User user;
    private ArrayList<Product>productsOrdered;

    public Product(String productName,String productColor, String productCatagory, String infoAboutProduct, 
            int productStock,double productWeight,double price){
        this.infoAboutProduct=infoAboutProduct;
        this.productCatagory=productCatagory;
        this.productColor=productColor;
        this.productName=productName;
        this.productStock=productStock;
        this.productWeight=productWeight;
        productsOrdered=new ArrayList<>();


        
    }
    public User getUser(){
        return user;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCatagory() {
        return productCatagory;
    }

    public void setProductCatagory(String productCatagory) {
        this.productCatagory = productCatagory;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public String getInfoAboutProduct() {
        return infoAboutProduct;
    }

    public void setInfoAboutProduct(String infoAboutProduct) {
        this.infoAboutProduct = infoAboutProduct;
    }


    public ArrayList<Product> getProductsOrdered(int numOfOrder) {
        return productsOrdered;
    }
    
    public boolean controlStock(int numOfOrder){

        if (numOfOrder > 0) {
            if (this.productStock >= numOfOrder) {
                this.productStock -= numOfOrder;
                System.out.println(numOfOrder+" of the  "+getProductName()+" you selected have been added to your cart");
                return true;
            }    
            else {
            System.out.println("We are sorry. " + productName + " does not have enough stock");
            return false;
            }
        } 
        else {
            System.out.println("Invalid number of orders");
            return false;
        }    
    }
    
}




    
    

