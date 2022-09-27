package com.epam.hw.oop.dragon.dao;

import com.epam.hw.oop.dragon.bean.Cave;
import com.epam.hw.oop.dragon.main.Creator;

public class TreasureRepository
{

	private static Cave cave = Creator.createCave();

	public static Cave getCave()
	{
		return cave;
	}

	public static void setCave(Cave cave)
	{
		TreasureRepository.cave = cave;
	}	
}
