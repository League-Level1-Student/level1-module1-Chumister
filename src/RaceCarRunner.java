

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		String Ford = "Ford";
		int position =5;
		RaceCar SNES= new RaceCar(Ford, position);
		// 2. Print the RaceCar's position in the race
		System.out.println(position);
		// 3. Crash the RaceCar
		SNES.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if (SNES.isDamaged()) {
		SNES.pit();
		} else {
		SNES.getPositionInRace();		

		}
		// 5. Help the car move into first place.
		for (int i = 0; i < 8; i++) {
			SNES.overtake();
			
		}
	}
}
