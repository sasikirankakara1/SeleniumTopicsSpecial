package tests;

public class Exaiii {

	public void clickSpecificNavbar(String taskbaarName) {
		System.out.println(taskbaarName);
	}
	public static void main(String[] args) {
		Exaiii exaiii = new Exaiii();
		exaiii.clickSpecificNavbar("Log in");
	}
}
