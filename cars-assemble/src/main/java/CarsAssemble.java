public class CarsAssemble {

    int baseProducedCarsPerHour = 221;

    public double productionRatePerHour(int speed) {
        double productionRate = 0.0;
        if (speed >= 1 && speed <= 4) {
            productionRate = baseProducedCarsPerHour * speed;
        } else if (speed >= 5 && speed <= 8) {
            productionRate = baseProducedCarsPerHour * speed * 0.9;
        } else if (speed == 9) {
            productionRate = baseProducedCarsPerHour * speed * 0.8;
        } else if (speed == 10) {
            productionRate = baseProducedCarsPerHour * speed * 0.77;
        }
        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {
        int productionRate = (int)(productionRatePerHour(speed) / 60);
        return productionRate;
    }
}
