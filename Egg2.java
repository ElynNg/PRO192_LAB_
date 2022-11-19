package LAB;

public class Egg2 {
	public static void main(String[] args) {
		up();
		down();
		center();
		up();
		down();
		center();
		down();
		up();
		center();
		down();
	}
	
	public static void up() {
		System.out.println("  _______  ");
		System.out.println(" /       \\ ");
		System.out.println("/         \\");
	}
	
	public static void down() {
		System.out.println("\\         /");
		System.out.println(" \\_______/ ");
	}
	
	public static void center() {
		System.out.println("-\"-'-\"-'-\"-");
	}
}
