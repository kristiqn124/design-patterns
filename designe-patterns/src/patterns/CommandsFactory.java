package patterns;

public abstract class CommandsFactory {
	public abstract ICommand GetCommand(String commandName);
}
