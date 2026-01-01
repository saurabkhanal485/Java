import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestVehicle {
	
	static Vehicle[] v1;
	static int cnt=0;
	static {
		v1=new Vehicle[100];
		v1[0] =new Vehicle (103,"XYZ","Twowheeler",new Date());
		v1[1] = new Vehicle(104,"ABC","FourWheeler",new Date());
		v1[2] = new Vehicle(105,"BCA","ThreeWheeler",new Date());
		cnt=3;
	}
	
	public static boolean addNewVehicle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int vId=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String nm=sc.nextLine();
		System.out.println("enter Type");
		String vType=sc.nextLine();
		
		System.out.println("enter purchase date(dd/mm/yyyy)");
		String dt=sc.next();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date bdt=null;
		try {
			bdt=sdf.parse(dt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Vehicle v=new Vehicle(vId,nm,vType,bdt);
		if(cnt==v1.length) {
			return false;
		}else {
			v1[cnt]=v;
			cnt++;
			return true;
		}
		
	}
	
	
	public static void displayAll() {
		for (int i=0; i<cnt; i++) {
			System.out.println(v1[i]);
		}
	}
	}
	


