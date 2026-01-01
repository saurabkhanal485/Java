
public class Id {
public static int employeeIdCounter=1000;
public static int memberIdCounter=3000;


public static int getNewEmployeeId() {
	return ++ employeeIdCounter;
}

public static int getNewmemberId() {
	return ++ memberIdCounter;
}
}
