package _01_AnimalFarm;

public class Cow extends Animal{
	String Name = "";
	Cow(String name){
		Name = name;
	}
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Mooooooooo");
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return Name;
	}

}
