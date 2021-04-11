package com.thomeo.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Meiko");

        cat1.greets();

        Dog dog1 = new Dog("Shiba");
        Dog dog2 = new Dog("Kali");
        BigDog dog3 = new BigDog("Aya");

        dog1.greets();
        dog1.greets(dog2);

       dog3.greets(dog2);
       dog3.greets(dog3);

    }
}
