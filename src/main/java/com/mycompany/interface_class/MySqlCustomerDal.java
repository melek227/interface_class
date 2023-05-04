/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_class;

/**
 *
 * @author melek
 */
public class MySqlCustomerDal implements ICustomerDal, IRepository { 
    
    //bir class birden fazla interfaceyi implemente edebilir
    //yazılım katmanları arasındaki geçişlerde bağımlılıkları önlemek için interfaceler kullanırız
    
    //extends ve implementasyonun farkı=>
        //--Bir class birden fazla interfaceyi implemente edebilir.
        //--Bir class tek bir abstract classı extends edebili

    @Override
    public void Add() {
        System.out.println("MySql eklendi");
    }
    
}
