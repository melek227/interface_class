/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_class;

/**
 *
 * @author melek
 */
public class CustomerManager {
    private ICustomerDal customerDal; //strateji patterni interfaceler veya abstract classlar newlenemediği için kullanılır
    
    
    public CustomerManager(ICustomerDal customerDal){ //customerManagerin constructorunda kullanacağımız veritabanını belirtiyoruz
        this.customerDal=customerDal; //this.customerDal classın attributesi 
       //customerDal constructora parametre olarak gönderilen class
    
    }
    
    public void add(){//ICustomerDaldaki addi çağıracak.Burada daldan gelen verileri kullanan iş kodları yazılır
        //müşterinin adı girilmiş mi veriler doğru mu benzeri iş kodları burada yazılır
        
        customerDal.Add(); //Add customerDalın fonksiyonu
    };
    
}
