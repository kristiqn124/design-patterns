package patterns;


public interface IObserver {
	void update();
	void setWorkout(IObservable workout);
}
