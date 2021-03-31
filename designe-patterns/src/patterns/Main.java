package patterns;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkoutSubscribers firstFitnessSubscriber = new WorkoutSubscribers("Ivan");
		WorkoutSubscribers secondFitnessSubscriber = new WorkoutSubscribers("Kaloyan");
		WorkoutSubscribers thirdFitnessSubscriber = new WorkoutSubscribers("John");
		
		Workout demonstrator = new Workout();
		
		demonstrator.subscribe(firstFitnessSubscriber);
		demonstrator.subscribe(secondFitnessSubscriber);
		demonstrator.subscribe(thirdFitnessSubscriber);
		
		CommandsFactory commandsFactory = new ConcreteCommandsFactory(demonstrator);
		
		ICommand getUp = commandsFactory.GetCommand("Get Up");
		ICommand layDown = commandsFactory.GetCommand("Lay Down");
		
		Coach coach = new Coach();
	
		coach.setCommand(getUp);
		coach.executeCommand();
		
		System.out.println();
		
		coach.setCommand(layDown);
		coach.executeCommand();
	}

}
