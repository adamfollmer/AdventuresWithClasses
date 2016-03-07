import java.util.Scanner;

public class City {
	String locationName;
	int costOfLivingMultiplier;
	double happinessFactor;
	
	public City (String LocationName){
		locationName = LocationName;
		switch (locationName){
		case "MILWAUKEE":
			costOfLivingMultiplier = 2;
			happinessFactor += 10;
			break;
		case "CHICAGO":
			costOfLivingMultiplier = 4;
			happinessFactor -= 5;
			break;
		case "BEAVER DAM":
			costOfLivingMultiplier = 1;
			happinessFactor++;
			break;
		default:
			locationName = "DUBUQUE";
			costOfLivingMultiplier = 1;
			happinessFactor -= 10;			
		}
	}
	public void help (){
		System.out.println("Pick from: ");
		System.out.println("MILWAUKEE, CHICAGO, BEAVER_DAM, or DUBUQUE");
	}
	
	public String cityMove (City city){
		String userInput;
		Scanner input = new Scanner(System.in);
		System.out.println("What city? Type HELP for options");
		userInput = input.nextLine().toUpperCase();
		while (userInput.equals("HELP")) {
			city.help();
			userInput = input.nextLine().toUpperCase();
		}
		System.out.println("You have successfull moved to " + userInput + ".");
		System.out.println();
		return userInput;
	}
}

