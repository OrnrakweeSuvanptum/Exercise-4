import java.util.Scanner;
public class Oppo extends Handphone {

	Scanner s = new Scanner(System.in);
	private String brand, operatingSystem, SIM;
	private int RAM, storage;
	private double price; 
	
	Oppo(){
		
		this.brand = "OPPO";
		System.out.print("Please enter the operating system: ");
		this.operatingSystem = s.nextLine();
		System.out.print("Please enter SIM type: ");
		this.SIM = s.nextLine();
		System.out.print("Please enter RAM: ");
		this.RAM = s.nextInt();
		System.out.print("Please enter storage: ");
		this.storage = s.nextInt();
		System.out.print("Please enter price of Oppo: ");
		this.price = s.nextDouble();
	}
	public String getBrand() {
		return this.brand;
	}
	public String getOperatingSystem() {
		return this.operatingSystem;
	}
	public String getSIM() {
		return this.SIM;
	}
	public Integer getRAM() {
		return this.RAM;
	}
	public Integer getStorage() {
		return this.storage;
	}
	public double getPrice() {
		return this.price;
	}
	
}
