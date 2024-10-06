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
public class CreditCard {
    private String cardNumber;
    private String userOfCard;
    private String securityCode;
    private String expirationDateOfCard;
    
    public CreditCard(String cardNumber,String userOfCard, String securityCode,String expirationDateOfCard){
        this.cardNumber=cardNumber;
        this.userOfCard=userOfCard;
        this.securityCode=securityCode;
        this.expirationDateOfCard=expirationDateOfCard;
    }


    
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUserOfCard() {
        return userOfCard;
    }

    public void setUserOfCard(String userOfCard) {
        this.userOfCard = userOfCard;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDateOfCard() {
        return expirationDateOfCard;
    }

    public void setExpirationDateOfCard(String expirationDateOfCard) {
        this.expirationDateOfCard = expirationDateOfCard;
    }
    
    
    
    
         
}
