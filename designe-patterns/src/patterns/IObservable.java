package patterns;

public interface IObservable {
	void subscribe(IObserver subscriber);
	void unsubscribe(IObserver subscriber);
	void notifyObservers();
	String getUpdate();
}
