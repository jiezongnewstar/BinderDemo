// AnimalManager.aidl
package com.xibei.binderdemo;

import com.xibei.binderdemo.Animal;

interface AnimalManager{

    List<Animal> getAnimals();

    Animal getAnimal();

    int getAnimalCount();

    int getFirstAnimalLegs();

    void setAnimalName(String name);

    void setAnimalLegs(int legs);

}
