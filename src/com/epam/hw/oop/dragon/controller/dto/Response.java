package com.epam.hw.oop.dragon.controller.dto;

import java.util.List;

import com.epam.hw.oop.dragon.bean.Treasure;

public class Response
{
	private String command;
	private Treasure treasure;
	private List<Treasure> treasures;
	private String errorMessage;

	public Response(String operationName, Treasure treasure) 
	{
		this.command = operationName;
		this.treasure = treasure;
	}
	
	public Response(String operationName, List<Treasure> treasures) {
		this.command = operationName;
		this.treasures = treasures;
	}

	public Response(String operationName, String errorMessage) {
		this.command = operationName;
		this.errorMessage = errorMessage;
	}
	
	public String getCommand()
	{
		return command;
	}

	public void setCommand(String operationName)
	{
		this.command = operationName;
	}

	public Treasure getTreasure()
	{
		return treasure;
	}

	public void setTreasure(Treasure treasure)
	{
		this.treasure = treasure;
	}

	public List<Treasure> getTreasures()
	{
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures)
	{
		this.treasures = treasures;
	}

	public String getErrorMessage()
	{
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}
	
}
