package starcar;

public class StarCarHighGrade extends StarCar{
	
	int tax = 2000;

	public StarCarHighGrade(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getSpec() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------");
		System.out.println("color : "+color);
		System.out.println("tire : "+tire);
		System.out.println("displacement : "+displacement);
		System.out.println("handle : "+handle);
		
		if(displacement > 2000) {tax =2500;}
		
		System.out.println("tax : "+tax);
		System.out.println("-------------------------------");
		
	}

}
