import java.util.Scanner;

public class Car {
	String type;
	double cost;
	int happinessFactor;

	public Car(String Type) {
		type = Type;
		switch (Type) {
		case "BMW":
			cost = 100;
			happinessFactor = 3;
			break;
		case "VOLKSWAGON":
			cost = 50;
			happinessFactor = 2;
			break;
		case "HONDA":
			cost = 25;
			happinessFactor = 1;
			break;
		default:
			type = "BEATER";
			cost = 0;
			happinessFactor = -2;
		}
	}
	public void help (){
		System.out.println("Pick from: ");
		System.out.println("BMW, VOLKSWAGON, HONDA, or BEATER");
	}
	
	public String newCar (Car car){
		String userInput;
		Scanner input = new Scanner(System.in);
		System.out.println("What car do you want? Type HELP for options");
		userInput = input.nextLine().toUpperCase();
		while (userInput.equals("HELP")) {
			car.help();
			userInput = input.nextLine().toUpperCase();
		}
		System.out.println("You have successfully bought a " + userInput + ".");
		System.out.println();
		return userInput;
	}
}
