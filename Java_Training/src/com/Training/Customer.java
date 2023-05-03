package com.Training;

public abstract class Customer {
       public void accountNumber(int a) {
          System.out.println(a);
       }
       public void accountHolderName(String name) {
         System.out.println(name);
       }
       public abstract void pinNo();
}
