package patterns;

public class GetUp implements ICommand {
	private Workout workout;
	private String exercise;
	
	public GetUp(Workout workout) {
		this.workout = workout;
		this.setExercise("Get Up");
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.workout.setExercise(getExercise());
	}

	public String getExercise() {
		return exercise;
	}

	private void setExercise(String exercise) {
		this.exercise = exercise;
	}

}
