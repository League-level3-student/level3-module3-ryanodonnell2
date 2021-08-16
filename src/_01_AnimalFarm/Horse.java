package _01_AnimalFarm;

public class Horse extends Animal{
	String Name = "";
	Horse(String name){
		Name = name;
	}
	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Neigh Neigh");
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return Name;
	}
}
