package com.epam.hw.oop.dragon.bean;

import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String color;
	private boolean isGlowing;
	private double weigth;
	private int cost;
	
	public Treasure() {}
	
	public Treasure(String name, String color, boolean isGlowing, double weigth, int cost)
	{
		this.name = name;
		this.color = color;
		this.isGlowing = isGlowing;
		this.weigth = weigth;
		this.cost = cost;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public double getWeigth()
	{
		return weigth;
	}
	public void setWeigth(double weigth)
	{
		this.weigth = weigth;
	}
	public boolean isGlowing()
	{
		return isGlowing;
	}
	public void setGlowing(boolean isGlowing)
	{
		this.isGlowing = isGlowing;
	}
	public int getCost()
	{
		return cost;
	}
	public void setCost(int cost)
	{
		this.cost = cost;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(color, cost, isGlowing, name, weigth);
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
		Treasure other = (Treasure) obj;
		return Objects.equals(color, other.color) && cost == other.cost && isGlowing == other.isGlowing
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(weigth) == Double.doubleToLongBits(other.weigth);
	}

	@Override
	public String toString()
	{
		return "Treasure [name=" + name + ", color=" + color + ", isGlowing=" + isGlowing + ", weigth=" + weigth
				+ ", cost=" + cost + "]";
	}
	
	
}
