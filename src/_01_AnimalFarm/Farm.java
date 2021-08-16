package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		ArrayList<Animal> animal = new ArrayList<Animal>();
		for (int i = 0; i < 5; i++) {
			Animal pig1 = new Pig("e");
			animal.add(pig1);
		}
		animals[0] = new Pig("e");
		int x = animals.length;
//		Animal cow1 = new Cow("Cow1");
//		Animal cow2 = new Cow("Cow2");
//		Animal sheep1 = new Sheep("Sheep1");
//		Animal sheep2 = new Sheep("Sheep1");
//		Animal horse1 = new Horse("Horse1");
//		Animal pig1 = new Pig("Pig1");
//		animal.add(cow1);
//		animal.add(cow2);
//		animal.add(sheep1);
//		animal.add(sheep2);
//		animal.add(horse1);
//		animal.add(pig1);
		for (int i = 0; i < animal.size(); i++) {
			animal.get(i).makeNoise();
		}
		
	}
}
