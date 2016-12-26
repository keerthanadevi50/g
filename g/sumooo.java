package com.example.domain;
public class sumooo
{
    public void sumOf(int input)
    {
        
 
        int copy = input;
 
        
 
        int sum = 0;
 
        while (copy != 0)
        {
            
            int lastDig = copy%10;
 
           
 
            sum = sum + lastDig;
 
            
 
            copy = copy/10;
        }
 
       
 
        System.out.println("Sum Of All Digits In "+input+" = "+sum);
    }
 
    public static void main(String[] args)
    {
        sumOf(47862);
 
        
    }
}


