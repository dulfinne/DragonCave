package com.epam.hw.oop.dragon.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.epam.hw.oop.dragon.controller.CommandName;
import com.epam.hw.oop.dragon.bean.Treasure;
import com.epam.hw.oop.dragon.controller.CaveController;
import com.epam.hw.oop.dragon.controller.dto.Request;
import com.epam.hw.oop.dragon.controller.dto.Response;

public class Output
{
	public void printMenu()
	{
		System.out.println("Menu: ");
		System.out.println("1.View all treasures");
		System.out.println("2.View the most expensive treasure");
		System.out.println("3.Select treasures for a given amount");
		System.out.println("4.Exit");
		System.out.println("Your choice:");
	}
	
	public void printTreasures(String title, List<Treasure> treasures)
	{
		System.out.printf("%15s|%10s|%10s|%5s|%6s", "Name", "Color", "Is glowing", "Weigth", "Cost");
		System.out.println();
		
		for(Treasure treasure : treasures)
		{
			System.out.printf("%15s|%10s|%10b|%6.1f|%6d", treasure.getName(), treasure.getColor(), 
					treasure.isGlowing(), treasure.getWeigth(), treasure.getCost());
			System.out.println();
		}
		
		System.out.println();
	}
	
	public void printNoSuchOperation(Response response) {
		System.out.println(response.getErrorMessage());
	}
}
