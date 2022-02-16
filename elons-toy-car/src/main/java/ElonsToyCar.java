public class ElonsToyCar {

    int distance = 0;
    int batteryPercentage = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        } else {
            return "Battery at " + batteryPercentage + "%";
        }
    }

    public void drive() {
        if (batteryPercentage != 0) {
            distance += 20;
            batteryPercentage -= 1;
        }
    }
}
