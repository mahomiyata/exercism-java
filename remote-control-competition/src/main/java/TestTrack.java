import java.util.*;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        ArrayList<ProductionRemoteControlCar> prods = new ArrayList<ProductionRemoteControlCar>();
        prods.add(prc1);
        prods.add(prc2);
        Collections.sort(prods);
        return prods;
    }
}
