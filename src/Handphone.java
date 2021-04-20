import java.util.Scanner;
public class Handphone {

	Scanner s = new Scanner(System.in);
	private double size, thickness;
	private int weight; 
	
	Handphone(){
		System.out.print("Please enter size of handphone(inches): ");
		this.size = s.nextDouble();
		System.out.print("Please enter thickness of handphone(mm): ");
		this.thickness = s.nextDouble();
		System.out.print("Please enter weight of handphone(gram): ");
		this.weight = s.nextInt();
	}
	public double getSize() {
		return this.size;
	}
	public double getThickness(){
		return this.thickness;
	}
	public Integer getWeight(){
		return this.weight;
	}
	
}
