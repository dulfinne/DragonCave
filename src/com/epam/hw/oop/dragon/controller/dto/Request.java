package com.epam.hw.oop.dragon.controller.dto;

public class Request
{
	private String command;
	private int sum;

	public Request(String command) {
		this.command = command;
	}
	
	public Request(String command, int sum) {
		this.command = command;
		this.sum = sum;
	}

	public String getCommand()
	{
		return command;
	}

	public void setCommand(String command)
	{
		this.command = command;
	}

	public int getSum()
	{
		return sum;
	}

	public void setSum(int sum)
	{
		this.sum = sum;
	}
}
