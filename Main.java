/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.club;

import java.util.Scanner;

/**
 *
 * @author HP 15S-EQ2019NS
 */
public class Main {

    public static void main(String[] args) {
        Club club = new Club(); //instancia para club
        Scanner scanner = new Scanner(System.in);
        // Agregar  socio
        System.out.println("--REGISTRO DE SOCIOS--");
        System.out.print("Número de documento: ");
        int id = scanner.nextInt();//sin nextInt estaba  sugieriendo cambiar a string
        scanner.nextLine();//para escribir en la misma línea que imprime
        System.out.print("Nombre: ");
        String name = scanner.nextLine();
        System.out.print("Tipo de suscripción VIP o Regular: ");
        String subscriptionType = scanner.nextLine();

        Member newMember = new Member(id, name, subscriptionType);//instancia para crear socio
        club.addMember(newMember);//método para agregsr miembro

        // Agregar persona autorizada
        System.out.println("--REGISTRO DE PERSONAS AUTORIZADAS--");
        System.out.print("Número de documento: ");
        int personId = scanner.nextInt();
        scanner.nextLine();//para escribir en la misma línea que imprime
        System.out.print("Nombre: ");
        String personName = scanner.nextLine();
        Person authorizedPerson = new Person(personId, personName);//instancia para crear persona autorizada
        newMember.addAuthorizedPerson(authorizedPerson);//agregar persona autorizada del socio
    }
}
