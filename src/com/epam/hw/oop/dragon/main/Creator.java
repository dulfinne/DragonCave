package com.epam.hw.oop.dragon.main;

import java.util.ArrayList;
import java.util.List;

import com.epam.hw.oop.dragon.bean.Cave;
import com.epam.hw.oop.dragon.bean.Treasure;

public class Creator
{
	public static Cave createCave()
	{
		List<Treasure> treasures = new ArrayList<Treasure>();
		
		treasures.add(new Treasure("Ruby", "red", false, 2, 33 ));
		treasures.add(new Treasure("Diamond", "blue", true, 4, 190 ));
		treasures.add(new Treasure("Emerald", "green", true, 3.3, 48 ));
		treasures.add(new Treasure("Alexandrite", "chameleon", false, 5, 12 ));
		treasures.add(new Treasure("Euclase", "white", true, 6, 29 ));
		treasures.add(new Treasure("Spinel", "red", false, 12.1, 239 ));
		
		Cave cave = new Cave(treasures);
		return cave;
	}
}
