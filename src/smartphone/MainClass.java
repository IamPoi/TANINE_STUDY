package smartphone;

public class MainClass {
	public static void main(String[] args) {
		
		APhone a = new APhone();
		BPhone b = new BPhone();
		CPhone c = new CPhone();
		
		a.call();
		a.lte();
		a.tvRemote();
		System.out.println("----------------------------------------");
		b.call();
		b.lte();
		b.tvRemote();
		System.out.println("----------------------------------------");
		c.call();
		c.lte();
		c.tvRemote();
		System.out.println("----------------------------------------");
		
	}

}
