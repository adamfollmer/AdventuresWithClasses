
public class City {
	String locationName;
	int costOfLivingMultiplier;
	double happinessFactor;
	String cityType;
	
	public City (String LocationName){
		locationName = LocationName;
		switch (locationName){
		case "MILWAUKEE":
			costOfLivingMultiplier = 2;
			happinessFactor += 10;
			cityType = "CITY";
			break;
		case "CHICAGO":
			costOfLivingMultiplier = 4;
			happinessFactor -= 5;
			cityType = "CITY";
			break;
		case "BEAVER DAM":
			costOfLivingMultiplier = 1;
			happinessFactor++;
			cityType = "TOWN";
			break;
		default:
			locationName = "DUBUQUE";
			costOfLivingMultiplier = 1;
			happinessFactor -= 10;
			cityType = "TOWN";			
		}
	}
	public void help (){
		System.out.println("Pick from: ");
		System.out.println("MILWAUKEE, CHICAGO, BEAVER_DAM, or DUBUQUE");
	}
}

