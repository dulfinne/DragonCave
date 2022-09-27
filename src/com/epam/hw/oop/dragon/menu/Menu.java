package com.epam.hw.oop.dragon.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.epam.hw.oop.dragon.bean.Treasure;
import com.epam.hw.oop.dragon.controller.CaveController;
import com.epam.hw.oop.dragon.controller.CommandName;
import com.epam.hw.oop.dragon.controller.dto.Request;
import com.epam.hw.oop.dragon.controller.dto.Response;
import com.epam.hw.oop.dragon.view.Output;

public class Menu
{
	CaveController controller = new CaveController();
	Output output = new Output();
	
	public void runMenu()
	{
		Scanner scan = new Scanner(System.in);

		boolean stop = false;
		
		while(!stop)
		{
			output.printMenu();
			
			int input = Integer.parseInt(scan.nextLine());
			
			switch (input) {
			case 1: 
				Request request1 = new Request(CommandName.FIND_ALL.name());
				Response response1 = controller.doAction(request1);
				output.printTreasures("All treasures:", response1.getTreasures());
				break;
			
			case 2: 
				Request request2 = new Request(CommandName.MOST_EXPENSIVE.name());
				Response response2 = controller.doAction(request2);
				List<Treasure> treasures = new ArrayList<>();
				treasures.add(response2.getTreasure());
				output.printTreasures("Most expensive treasure:", treasures);
				break;

			case 3: 				
				System.out.print("Sum:");
				
				int sum = Integer.parseInt(scan.nextLine());
				
				Request request3 = new Request(CommandName.BY_SUM.name(), sum);
				Response response3 = controller.doAction(request3);
				output.printTreasures("Treasures by sum:", response3.getTreasures());				
				break;
				
			case 4: 
				System.out.println("SEE YOU SOON!");
				
				stop = true;
				return;
				
			default:
				Request wrongRequest = new Request(String.valueOf(input));
				Response wrongResponse = controller.doAction(wrongRequest);
				output.printNoSuchOperation(wrongResponse);
				
			}			
		}
	}
}