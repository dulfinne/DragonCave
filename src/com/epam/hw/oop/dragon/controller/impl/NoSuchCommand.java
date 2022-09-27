package com.epam.hw.oop.dragon.controller.impl;

import com.epam.hw.oop.dragon.controller.Command;
import com.epam.hw.oop.dragon.controller.CommandName;
import com.epam.hw.oop.dragon.controller.dto.Request;
import com.epam.hw.oop.dragon.controller.dto.Response;

public class NoSuchCommand implements Command
{
	@Override
	 public Response execute(Request request){
			
//			response.setCommand(CommandName.NO_SUCH_COMMAND.toString());
//			response.setErrorMessage("No such command.");
		
			Response response = new Response(CommandName.NO_SUCH_COMMAND.toString(), "No such command");
			
			return response;
	 }
}
