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
        name = "Name of Cat";
        age = Integer.MAX_VALUE;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        age = Integer.MAX_VALUE;

    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        name = "Name of Cat";
        Integer age = 0;

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        String name = "Cat Name";
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
