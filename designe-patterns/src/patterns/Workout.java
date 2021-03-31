package patterns;

import java.util.ArrayList;
import java.util.List;

public class Workout implements IObservable {

	private List<IObserver> observers;
	private String exercise;
	
	public Workout() {
		this.observers =  new ArrayList<IObserver>();
	}
	
	@Override
	public void subscribe(IObserver subscriber) {
		// TODO Auto-generated method stub
		this.observers.add(subscriber);
		subscriber.setWorkout(this);
	}

	@Override
	public void unsubscribe(IObserver subscriber) {
		// TODO Auto-generated method stub
		this.observers.remove(subscriber);
		subscriber.setWorkout(null);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(IObserver observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		// TODO Auto-generated method stub
		return this.getExercise();
	}
	private String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
		System.out.println("The demonstrator is doing " + exercise);
		this.notifyObservers();
	}

}
