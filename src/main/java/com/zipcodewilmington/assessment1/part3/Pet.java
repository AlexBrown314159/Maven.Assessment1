package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {

    String petName;
    int petAge;

    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public Pet() {

        String petName = "";
        int petAge = 0;
        PetOwner petOwner;

    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        String petName = name;

    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        int petAge = age;

    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {

        String petName = name;
        int petAge = age;

    }

    /**
     * @return name of this pet
     */
    public String getName() {

        return petName;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {

        return petAge;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {

        PetOwner petOwner = newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {

        return petOwner;
    }
}
