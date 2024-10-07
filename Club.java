/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.club;

import java.util.ArrayList;

/**
 *
 * @author HP 15S-EQ2019NS
 */
public class Club {

   public ArrayList<Member> members;

    public Club() {//constuctor para listar socios
        this.members = new ArrayList<>();
    }

public void addMember(Member member){ 
    if (members.size()<35){ //para un máximo de 35 socios
        for (Member i : members){
            if (i.getPersonId()==member.getPersonId()){//busca el id que obtuvo en el get
                System.out.println("El socio ya existe.");
                return;//para salir si el socio existe
            }
        }
        members.add(member);//crea el socio
        System.out.println("Se añadió el socio.");
    } else {
        System.out.println("El máximo de socios ya fue ingresado.");
        
        //socio y persona autorizada van acà? o se saca metodo addAuthorizedPerson de clase socio
    }
}
}