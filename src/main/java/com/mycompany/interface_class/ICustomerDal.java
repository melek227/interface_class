/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interface_class;

//Müşterinin farklı veri tabanları için implementasyonlarını yapalım
//interface mi abstract class mı olduğunu belirtmek için başına I koyduk
//DAL=>Data Access Layer

public interface ICustomerDal { 
    
    //interfaceler referans tutuculardır
    //bir interfacenin üyeleri de default olarak publictir
    void Add(); //başına public yazmadık
    
}
