package com.epam.hw.oop.dragon.controller.impl;

import com.epam.hw.oop.dragon.bean.Treasure;
import com.epam.hw.oop.dragon.controller.Command;
import com.epam.hw.oop.dragon.controller.CommandName;
import com.epam.hw.oop.dragon.controller.dto.Request;
import com.epam.hw.oop.dragon.controller.dto.Response;
import com.epam.hw.oop.dragon.logic.CaveLogic;

public class MostExpensiveCommand implements Command
{
	private final CaveLogic logic = CaveLogic.getInstance();
	
	@Override
	public Response execute(Request request)
	{
		
		Treasure treasure = logic.findMostExpensive();
//		response.setCommand(CommandName.MOST_EXPENSIVE.toString());
//		response.setTreasure(treasure);
		Response response = new Response(CommandName.MOST_EXPENSIVE.toString(), treasure);

		return response;
	}
}
