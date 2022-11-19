package LAB;

public class TwoRockets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head();
		body_1();
		body_2();
		body_1();
		head();
	}
	
	public static void head() {
		System.out.println("   /\\       /\\");
		System.out.println("  /  \\     /  \\");
		System.out.println(" /    \\   /    \\");
	}

	public static void body_1() {
		System.out.println("+------+ +------+");
		System.out.println("|      | |      |");
		System.out.println("|      | |      |");
		System.out.println("+------+ +------+");
	}
	
	public static void body_2() {
		System.out.println("| Viet | | Viet |");
		System.out.println("| Nam  | | Nam  |");
	}
}
