package patterns;

public class WorkoutSubscribers implements IObserver {
	private String name;
	private IObservable workout;
	private String currentExercise;
	
	public WorkoutSubscribers(String name) {
		this.setName(name);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		if (workout == null) {
			System.out.print(this.getName() + " is not watching any workouts");
		}
		
		this.currentExercise = this.workout.getUpdate();
		System.out.println("Online fitness enthusiast " + this.getName() + " is doing " + this.currentExercise);
	}
	
	@Override
	public void setWorkout(IObservable workout) {
		// TODO Auto-generated method stub
		this.workout = workout;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
