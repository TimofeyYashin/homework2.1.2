package Transport;

public class Car extends EngineCheck {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Началось обслуживание легкого авто " + getModelName());
        super.check();
    }
}
