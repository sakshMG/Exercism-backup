public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double num = speed * 221;

        if (speed >= 1 && speed <= 4) return num;

        if (speed >= 5 && speed <= 8) return num * 0.9;

        if (speed == 9) return num * 0.8;
        
        if (speed == 10) return num * 0.77;

        return num;
        
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
