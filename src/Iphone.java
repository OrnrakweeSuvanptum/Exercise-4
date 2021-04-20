import java.util.Scanner;
public class Iphone extends Handphone { //extends Handphone
	
	Scanner s = new Scanner(System.in);
	private String brand, operatingSystem, SIM;
	private int RAM, storage;
	private double price; 
	
	Iphone(){
		
		this.brand = "IPHONE";
		System.out.print("Please enter the operating system: ");
		this.operatingSystem = s.nextLine();
		System.out.print("Please enter SIM type: ");
		this.SIM = s.nextLine();
		System.out.print("Please enter RAM: ");
		this.RAM = s.nextInt();
		System.out.print("Please enter storage: ");
		this.storage = s.nextInt();
		System.out.print("Please enter price of Iphone: ");
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
