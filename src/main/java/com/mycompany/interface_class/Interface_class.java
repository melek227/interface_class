/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interface_class;

//interfaceler de abstractlar gibi newlenemez




public class Interface_class {

    public static void main(String[] args) {
       
      CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
      //parametre olarak gönderdiğimiz OracleCustomerDal constructora parametre olarak gönderilen ICustomerDal referansına eşitlenecek
      customerManager.add();
    }
}
