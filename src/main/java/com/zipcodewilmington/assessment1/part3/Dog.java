package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        name = "";
        age = 0;
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        PetOwner expectedOwner = null;
        String expectedName = "DogName";
        Integer expectedAge = 0;

    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
