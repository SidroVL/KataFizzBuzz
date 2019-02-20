/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.Fizzbuzz;

/**
 *
 * @author dam229
 */
public class FizzBuzz {
    
    public String getFizzBuzz(int i){
        
        String numero= "" + i;
        
        if (i%3==0 && i%5==0 ) {
            return "FizzBuzz";
        }
        else if((i%5==0 || numero.contains("5")) && ( i%3==0 || numero.contains("3"))){
            return "FizzBuzz";
        }
        else if (i%5==0 || numero.contains("5")) {
             return "Buzz";
        } 
        else if ( i%3==0 || numero.contains("3")) {
            return "Fizz";
        }
        else return i+"";
        
    }
}
