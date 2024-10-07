/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.club;

/**
 *
 * @author HP 15S-EQ2019NS
 */
public class Person{//para herencia comparte id y nombre con socio
    public int personId;
    public String personName;
//constructor para persona
    public Person(int personId, String personName){
        this.personId= personId;
        this.personName= personName;
    }
    //get y set id
    public int getPersonId() {
    return personId;
}
    public void setPersonId(int personId) {
    this.personId= personId;
}
//get y set name
    public String getPersonName() {
    return personName;
}
    public void setPersonName(String personName) {
    this.personName = personName;
}
}
