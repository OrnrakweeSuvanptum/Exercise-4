
public class Main {

	public static void main(String[] args) {
		
		Iphone I = new Iphone();
		System.out.println("Size: " + I.getSize() + "inches");
		System.out.println("Thickness: " + I.getThickness() + "mm");
		System.out.println("Weight: " + I.getWeight() + "g");
		System.out.println("Brand: " + I.getBrand());
		System.out.println("Operating System: " + I.getOperatingSystem());
		System.out.println("SIM type: " + I.getSIM());
		System.out.println("RAM: " + I.getRAM() + "gb");
		System.out.println("Storage: " + I.getStorage() + "gb");
		System.out.println("Price: RM" + I.getPrice());
		System.out.println();
		
		Oppo O = new Oppo();
		System.out.println("Size: " + O.getSize() + "inches");
		System.out.println("Thickness: " + O.getThickness() + "mm");
		System.out.println("Weight: " + O.getWeight() + "g");
		System.out.println("Brand: " + O.getBrand());
		System.out.println("Operating System: " + O.getOperatingSystem());
		System.out.println("SIM type: " + O.getSIM());
		System.out.println("RAM: " + O.getRAM() + "gb");
		System.out.println("Storage: " + O.getStorage() + "gb");
		System.out.println("Price: RM" + O.getPrice());

	}

}
