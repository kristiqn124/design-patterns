package patterns;

public class LayDown implements ICommand {
	private Workout workout;
	private String exercise;
	
	public LayDown(Workout workout) {
		this.workout = workout;
		this.setExercise("Lay Down");
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.workout.setExercise(this.getExercise());
		
	}

	private String getExercise() {
		return exercise;
	}

	private void setExercise(String exercise) {
		this.exercise = exercise;
	}

}
