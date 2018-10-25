package com.luoExpress.exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class Test_Animal {
	public static void main(String[] args) {
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		Animal animal3 = getAnimal();
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(animal1);
		list.add(animal2);
		list.add(animal3);
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Animal animal = (Animal) iterator.next();
			animal.eat();
			if(animal instanceof Cat){
				((Cat) animal).catchMouse();
			}
			if(animal instanceof Dog){
				((Dog) animal).keepHome();
			}
		}
	}
	public static Animal getAnimal(){
		
		return new Dog();
		
	}
}