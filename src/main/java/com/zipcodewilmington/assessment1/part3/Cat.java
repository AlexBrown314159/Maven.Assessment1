package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        name = "Ellie";
        age = 5;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        age = 5;

    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        name = "Sylvester";

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        String name = "CatName";
        Integer age = 0;

    }

    /**
     * @return meow as a string
     */
    public String speak() {
        String sound = "Meow";
        return sound;

    }
}
