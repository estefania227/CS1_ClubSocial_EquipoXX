/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.club;

import java.util.ArrayList;

/**
 *
 * @author HP 15S-EQ2019NS
 */
public class Member extends Person{//preguntar atributo publico para no utilizar get y set
    private double availableFunds;
    private String subscriptionType;
    ArrayList<Invoice> unpaidInvoices;//facturas sin pagar
    ArrayList<Person> authorizedPersons;
    
    //constructor para tomar datos de person y propios
    public Member(int id, String name, String subscriptionType) {
        super(id, name); //  los llama desde Person
        this.subscriptionType=subscriptionType;
        //monto fondo inicial: 100 mil si es VIP o 50 mil si es regular.
        if (subscriptionType=="VIP") {
            this.availableFunds=100000;
        } else {
            this.availableFunds=50000;
        }        
        //inicilizar listas facturas sin pagar y personas autorizada
        this.unpaidInvoices=new ArrayList<>();
        this.authorizedPersons=new ArrayList<>();
     }   
    
   // get y set id y name están desde person

    // get y set fondos disponibles
    public double getAvailableFunds() {
        return availableFunds;
    }
    public void setAvailableFunds(double availableFunds) {
        this.availableFunds= availableFunds;
    }

    // get y set tipo de suscrip.
    public String getSubscriptionType() {
        return subscriptionType;
    }
    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType= subscriptionType;
    }

    // get facturas sin pagar
    public ArrayList<Invoice> getUnpaidInvoices() {
        return unpaidInvoices;
    }
  
//obtener id socio
    public void addAuthorizedPerson(Person person) {
    if (authorizedPersons.size()<10){
        authorizedPersons.add(person);
        System.out.println("Se añadió a la persona autorizada.");
    } else {
        System.out.println("Máximo de personas a asociar: 10.");
    }
}
    

}
