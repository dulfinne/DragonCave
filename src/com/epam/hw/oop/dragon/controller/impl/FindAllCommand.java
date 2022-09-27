package com.epam.hw.oop.dragon.controller.impl;

import java.util.List;

import com.epam.hw.oop.dragon.bean.Cave;
import com.epam.hw.oop.dragon.bean.Treasure;
import com.epam.hw.oop.dragon.controller.Command;
import com.epam.hw.oop.dragon.controller.CommandName;
import com.epam.hw.oop.dragon.controller.dto.Request;
import com.epam.hw.oop.dragon.controller.dto.Response;
import com.epam.hw.oop.dragon.dao.TreasureRepository;
import com.epam.hw.oop.dragon.logic.CaveLogic;

public class FindAllCommand implements Command
{
	private final CaveLogic logic = CaveLogic.getInstance();

	@Override
	public Response execute(Request request)
	 {
			
			List<Treasure> treasures = logic.findAll();
			
//			response.setCommand(CommandName.FIND_ALL.toString());
//			response.setTreasures(treasures);
	 
			Response response = new Response(CommandName.FIND_ALL.toString(), treasures);

			return response;
	 }
}
