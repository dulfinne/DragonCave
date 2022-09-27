package com.epam.hw.oop.dragon.controller.impl;

import java.util.List;

import com.epam.hw.oop.dragon.bean.Treasure;
import com.epam.hw.oop.dragon.controller.Command;
import com.epam.hw.oop.dragon.controller.CommandName;
import com.epam.hw.oop.dragon.controller.dto.Request;
import com.epam.hw.oop.dragon.controller.dto.Response;
import com.epam.hw.oop.dragon.logic.CaveLogic;

public class BySumCommand implements Command
{
	private final CaveLogic logic = CaveLogic.getInstance();
    
	@Override
	 public Response execute(Request request)
	 {
			
			int sum = request.getSum();
			List<Treasure> treasures = logic.findBySum(sum);
			
//			response.setCommand(CommandName.BY_SUM.toString());
//			response.setTreasures(treasures);
			Response response = new Response(CommandName.BY_SUM.toString(), treasures);

			return response;
	 }
}
