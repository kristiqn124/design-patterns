package patterns;

import java.util.HashMap;

public class ConcreteCommandsFactory extends  CommandsFactory{
	private HashMap<String, ICommand> commands;
	
	public ConcreteCommandsFactory(Workout workout) {
		this.commands = new HashMap<String, ICommand>();
		
		this.commands.put("Get Up", new GetUp(workout));
		this.commands.put("Lay Down", new LayDown(workout));
	}
	
	@Override
	public ICommand GetCommand(String commandName) {
		// TODO Auto-generated method stub
		return this.commands.get(commandName);
	}

}
