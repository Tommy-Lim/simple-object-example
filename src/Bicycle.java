
public class Bicycle {
	
	private String bicycleType;
	private int bicycleSpokes;
	private int bicycleWheels;
	private int bicycleCost;
	private String bicycleName;
	
	public Bicycle(String name){
		bicycleName = name;
		bicycleType="";
		bicycleSpokes=0;
		bicycleWheels=0;
		bicycleCost=0;
	}
	
	public void setType(String type){
		bicycleType = type;
	}
	
	public void setSpokes(int spokes){
		bicycleSpokes = spokes;
	}
	
	public void setWheels(int wheels){
		bicycleWheels = wheels;
	}
	
	public void bicycleCost(int bicycles){
		bicycleCost = bicycleWheels*bicycleSpokes*bicycles;
	}
	
	public String getName(){
		return bicycleName;
	}

	public String getType(){
		return bicycleType;
	}
	
	public int getSpokes(){
		return bicycleSpokes;
	}
	
	public int getWheels(){
		return bicycleWheels;
	}
	
	public int getCost(){
		return bicycleCost;
	}
	
}
