package _01_AnimalFarm;

public class Pig extends Animal{
	String Name = "";
	Pig(String name){
		Name = name;
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Oink Oink");
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return Name;
	}
}
