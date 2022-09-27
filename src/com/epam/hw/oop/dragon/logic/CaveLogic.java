package com.epam.hw.oop.dragon.logic;

import java.util.ArrayList;
import java.util.List;

import com.epam.hw.oop.dragon.bean.Cave;
import com.epam.hw.oop.dragon.bean.Treasure;
import com.epam.hw.oop.dragon.dao.TreasureRepository;

public class CaveLogic
{
	private final Cave cave = TreasureRepository.getCave();

	
	private static final CaveLogic instance = new CaveLogic();
	
	private CaveLogic() {}
	
	public static CaveLogic getInstance()
	{
		return instance;
	}
	
	public List<Treasure> findAll()
	{
		return cave.getTreasures();
	}
	
	public Treasure findMostExpensive()
	{
		List<Treasure> treasures = cave.getTreasures();
		
		int imax = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < treasures.size(); i++)
		{
			int current = treasures.get(i).getCost();
			if(current > max)
			{
				max = current;
				imax = i;
			}
		}
		
		return treasures.get(imax);
	}
	
	public List<Treasure> findBySum(int sum)
	{
		List<Treasure> treasures = cave.getTreasures();
		List<Treasure> result = new ArrayList<>();
		
		for(int i = 0; i < treasures.size(); i++)
		{
			Treasure currentTreasure = treasures.get(i);
			sum -= currentTreasure.getCost();
			
			if(sum >= 0)
			{
				result.add(currentTreasure);
			}
			else
			{
				break;
			}
		}
		
		return result;
	}
}
