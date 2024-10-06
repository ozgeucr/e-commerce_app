/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommerceapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ozgeucar
 */
public class ECommerceApp {

    public static void main(String[] args) {




        CreditCard creditCard1 = new CreditCard("100293788733321", "ÖZGE UÇAR",
                "199", "07/29");
        CreditCard creditCard2= new CreditCard("156267393803998", "EYLÜL ÖZASLAN", "344", "11/26");

        User user1 = new User("ozgeucr", "Özge", "Uçar", "123ozge", "06/01/2004", "ozge@gmail.com", "İzmir ksk", "Manisa Muradiye", creditCard1);
        User user2=new User("eylulozasln", "Eylül", "Özarslan", "123eylul", "23/09/2005", "eylul@gmail.com", "izmir ksk", "manisa muradiye", creditCard2);
        
        Product laptop = new Product("Laptop", "Silver", "Electronics", "15-inch, Intel i7, 16GB RAM,1 tb SSD", 10, 2.5, 450000.0);
        Product phone = new Product("Dress", "Silver", "Clothing", "Sateen mini boy ", 20, 0.1, 1500.0);
        Product shirt = new Product("Shirt", "Blue", "Clothing", "Cotton, Standart size", 30, 0.2, 730.0);
        
        user2.performFavorites();
        user2.performOrdering();
        
        ArrayList<Product> products=new ArrayList<>();
        products.add(laptop);
        products.add(phone);
        products.add(shirt);

        user2.addFavorite(phone);
        user2.addFavorite(shirt);
        user2.removeFavorite(phone);
        user2.performFavorites();

        
        
        System.out.println("Welcome "+user1.getName() );
        
        
        
        for(int j=0;j<products.size();j++){
            System.out.println((j+1)+". "+products.get(j).getProductName());
        }
        Scanner scanner1=new Scanner(System.in);
        System.out.println("chose to your favorites product");
        int choice2=scanner1.nextInt();
        if (choice2>=1 && choice2<=products.size()) {
            Product chosenProduct=products.get(choice2-1);
            user1.addFavorite(chosenProduct);
            user1.performFavorites();
        }
        else{
            System.out.print("The product can not chose");
        }
        
        
        
        
        for(int i=0;i<products.size();i++){
            System.out.println((i+1)+". "+products.get(i).getProductName());
        }
        Scanner scanner2=new Scanner(System.in);
        System.out.println(" chose product for adding cart");
        int choice=scanner2.nextInt();
        if (choice>=1 && choice<=products.size()) {            
            Product addingCart =products.get(choice-1);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter How much product you want to buy? : ");
            int numOfOrder=scanner.nextInt();    
            Order order1=new Order(user1, addingCart);
            order1.processOrder(numOfOrder, user1.getCreditCard());

            user1.performOrdering();

        }
        else{
            System.out.println("invalid choice try again...");
        }

    }            
            
}




        
        
     
