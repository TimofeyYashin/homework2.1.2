package Transport;

import service.Serviceable;

public abstract class Transport implements Serviceable {
    public String modelName;
    public int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void check() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();

        }

    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
