
public class BikeShop {

	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle("coolbike");
		bike1.setType("flames");
		bike1.setWheels(2);
		bike1.setSpokes(20);
		bike1.bicycleCost(2);
		
		
		System.out.println("Bicycle name is: "+bike1.getName());
		System.out.println("Bicycle type is: "+bike1.getType());
		System.out.println("Bicycle number of wheels is: "+bike1.getWheels());
		System.out.println("Bicycle number of spokes is: "+bike1.getSpokes());
		System.out.println("Bicycle(s) cost is: "+bike1.getCost());
	}

}
