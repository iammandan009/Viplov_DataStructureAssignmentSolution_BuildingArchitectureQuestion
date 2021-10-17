package com.skyScraper.main;
import java.util.Scanner;
import com.skyScraper.operations.*;

public class Driver {

	public static void main(String[] args) 
	{
		
		Scanner usrInput= new Scanner(System.in);
		System.out.println("Plese enter the size of the building");
		int sizeOfBuilding = usrInput.nextInt();
		BuildingOperations building = new BuildingOperations();
		for(int i=1; i<=sizeOfBuilding; i++)
			{
				System.out.println("Enter the floor size on Day " +i);
				
				building.push(usrInput.nextInt());
				
			} 
		
		building.arrangeFloor();
		
		

		

	}

}
