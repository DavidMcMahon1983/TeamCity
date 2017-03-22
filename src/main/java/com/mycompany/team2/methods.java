/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.team2;

/**
 *
 * @author David
 */
public class methods {
    
    static String country = "";
    
    public int addNum(int x, int y){
      
      return x+y;  
        
    }
    
    public int subNum(int x, int y){
        
        return x-y;
    }
    
    public int mulNum(int x, int y){
        
        return x * y;
    }
    
    public int divNum(int x, int y){
        
        return x / y;
    }
    
    public int retCountry(int x, int y){
       
        if(x > 10 && x <20 && y > 10 && y <20)
            
            country = "Ireland";
        
        
        if(x < 10 && y <10)
            
            country = "England";
        
        if(x > 20 && x <30 && y > 20 && y <30 )
            
            country = "France";
        
        if(x > 50 && x <60 && y > 50 && y <60)
            
            country = "Spain";
        
        return 0;
          
    }
    
    public String getCountry(){
        
        return country;
    }
    
    
    
    
    
}
