import java.util.Scanner;

public class Home {
	String type;
	double cost;
	int happinessFactor;

	public Home (String Type) {
		type = Type;
		switch (Type) {
		case "MANSION":
			cost = 100;
			happinessFactor = 3;
			break;
		case "HOUSE":
			cost = 50;
			happinessFactor = 2;
			break;
		case "APARTMENT":
			cost = 25;
			happinessFactor = 1;
			break;
		default:
			type = "PARENTS BASEMENT";
			cost = 0;
			happinessFactor = -2;
		}
	}
	public void help (){
		System.out.println("Pick from: ");
		System.out.println("MANSION, HOUSE, APARTMENT, or PARENTS BASEMENT");
	}
	
	public String newHome (Home home){
		String userInput;
		Scanner input = new Scanner(System.in);
		System.out.println("What home do you want? Type HELP for options");
		userInput = input.nextLine().toUpperCase();
		while (userInput.equals("HELP")) {
			home.help();
			userInput = input.nextLine().toUpperCase();
		}
		System.out.println("You have successfully moved to a " + userInput + ".");
		System.out.println();
		return userInput;
	}
	public Home classChangeHome (String home){
		Home newHome = new Home (home);
		return newHome;
	}
}


