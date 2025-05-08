import java.util.ArrayList;

public class Signal implements Subject{

    ArrayList<Observer> observers;
    private int value;
    Samplar samplar;

    public Signal(Samplar samplar) {
        this.samplar = samplar;
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);

    }

    @Override
    public void unRegister(Observer o) {
        int observerIndex = observers.indexOf(o);
        if (observers.remove(o)) {
            System.out.println("The observer number " + (observerIndex +1)+" is deleted");
        }else{
            System.out.println("The observer is not found");
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer iterable_element : observers) {
            iterable_element.update(value);
        }
    }

    public void setSampler(Samplar samplar) {
        this.samplar = samplar; 
    }

    public void tick() {
        if (samplar != null) {
            value = samplar.sample();
            notifyObserver();
        }else{
            System.out.println("The samplar is not set yet");
        }
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public Samplar getSamplar() {
        return samplar;
    }
}
