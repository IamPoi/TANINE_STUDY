package starcar;

public class MainClass {
	public static void main(String[] args) {
		StarCarHighGrade high = new StarCarHighGrade(CarSpecs.COLOR_BLUE, CarSpecs.TIRE_WILD, CarSpecs.DISPLACEMENT_2200, CarSpecs.TIRE_WILD);
		StarCarLowGrade low = new StarCarLowGrade(CarSpecs.COLOR_RED, CarSpecs.TIRE_NORMAL, CarSpecs.DISPLACEMENT_2200, CarSpecs.TIRE_NORMAL);
		
		high.getSpec();
		low.getSpec();
	}

}
