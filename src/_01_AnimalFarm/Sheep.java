package _01_AnimalFarm;

public class Sheep extends Animal{
	String Name = "";
	Sheep(String name){
		Name = name;
	}
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Baaaaah Baaaaah");
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return Name;
	}

}
