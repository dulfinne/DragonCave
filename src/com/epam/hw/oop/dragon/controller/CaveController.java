package com.epam.hw.oop.dragon.controller;

import com.epam.hw.oop.dragon.controller.dto.Request;
import com.epam.hw.oop.dragon.controller.dto.Response;

public class CaveController
{
	private final CommandProvider provider = new CommandProvider();
	
	public Response doAction(Request request)
	{
		String commandName = request.getCommand();
		Command command = provider.getCommand(commandName);
		
		Response response = command.execute(request);
		
		return response;	
	}
}
