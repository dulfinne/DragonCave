package com.epam.hw.oop.dragon.controller;

import java.util.HashMap;
import java.util.Map;

import com.epam.hw.oop.dragon.controller.impl.BySumCommand;
import com.epam.hw.oop.dragon.controller.impl.FindAllCommand;
import com.epam.hw.oop.dragon.controller.impl.MostExpensiveCommand;
import com.epam.hw.oop.dragon.controller.impl.NoSuchCommand;

public class CommandProvider
{
	private Map<CommandName, Command> commands = new HashMap<>();

	public CommandProvider(){
		commands.put(CommandName.FIND_ALL, new FindAllCommand());
		commands.put(CommandName.MOST_EXPENSIVE, new MostExpensiveCommand());
		commands.put(CommandName.BY_SUM, new BySumCommand());
		commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
	}
	
	public Command getCommand(String operation)
	{
	     CommandName commandName;
		 Command command;
		 
		 try
		 {
		    commandName = CommandName.valueOf(operation);
			command = commands.get(commandName);
			
			if (command == null)
			{
			    command = commands.get(CommandName.NO_SUCH_COMMAND);
			}
		 }
		 catch(Exception e)
		 {
		    command = commands.get(CommandName.NO_SUCH_COMMAND);
		 }
		 
		 return command;
	}
}
