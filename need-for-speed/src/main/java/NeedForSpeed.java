class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class

    int speed;
    int batteryDrain;
    int distance;
    int batteryPercentage;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distance = 0;
        this.batteryPercentage = 100;
    }

    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getBatteryDrain() {
        return this.batteryDrain;
    }

    public void drive() {
        if (batteryPercentage >= batteryDrain) {
            this.distance += this.speed;
            this.batteryPercentage -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class

    int distance;
    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        int driveCount = 100 / car.getBatteryDrain();
        return driveCount * car.getSpeed() >= this.distance;
    }
}
