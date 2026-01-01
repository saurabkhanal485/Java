import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Vehicle v=new Vehicle(102,"khanal","Auto",new Date());
		System.out.println(v);
		Vehicle v1=new Vehicle(101,"Saurabh","FourWheeler",new Date());
		System.out.println(v1);
		
		v1.setvType("Twowheeler");
		System.out.println(v1);
		
		boolean status=TestVehicle.addNewVehicle();
		if(status) {
			System.out.println("Vehicle added Successfully");
		}
		else {
			System.out.println("ERror Adding vehicle");
		}
		TestVehicle.displayAll();

	}

}
