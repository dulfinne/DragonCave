package com.epam.hw.oop.dragon.controller;

import com.epam.hw.oop.dragon.controller.dto.Request;
import com.epam.hw.oop.dragon.controller.dto.Response;

public interface Command
{
	public Response execute(Request request);
}
