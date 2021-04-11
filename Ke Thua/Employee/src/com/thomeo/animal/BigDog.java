package com.thomeo.animal;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Hello");

    }

    public void greets(Dog another){
        System.out.println("Hello 2 ");
    }
    public void greets(BigDog another1){
        System.out.println("Hello 3");
    }


}
