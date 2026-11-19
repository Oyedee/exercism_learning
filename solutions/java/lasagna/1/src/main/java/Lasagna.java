public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualMinutesInOven) {
        int expectedMinutes = expectedMinutesInOven();
        return expectedMinutes - actualMinutesInOven;
    }

    public int preparationTimeInMinutes(int layersAdded) {
        int layerInMinutes = layersAdded * 2;
        return layerInMinutes;
    }
    
    public int totalTimeInMinutes(int layersAdded, int minutesInOven) {
        return preparationTimeInMinutes(layersAdded) +(minutesInOven);
    }
}
