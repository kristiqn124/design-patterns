package patterns;

public class Coach {
	private ICommand command;
 
	public void setCommand(ICommand command) {
		this.command = command;
	}
 
	public void executeCommand() {
		this.command.execute();
	}
 
}
