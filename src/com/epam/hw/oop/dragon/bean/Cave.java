package com.epam.hw.oop.dragon.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cave implements Serializable
{
	private static final long serialVersionUID = 1L; 
	
	private List<Treasure> treasures;
	
	public Cave()
	{
		treasures = new ArrayList<Treasure>();
	}
	
	public Cave(List<Treasure> treasures)
	{
		this.treasures = treasures;
	}

	public List<Treasure> getTreasures()
	{
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures)
	{
		this.treasures = treasures;
	}
	
	public void add(Treasure treasure)
	{
		treasures.add(treasure);
	}
	
	public void delete(Treasure treasure)
	{
		treasures.remove(treasure);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(treasures);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cave other = (Cave) obj;
		return Objects.equals(treasures, other.treasures);
	}

	@Override
	public String toString()
	{
		return "Cave [treasures=" + treasures + "]";
	}
}
