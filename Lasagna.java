class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println("Expected minutes in oven: " + lasagna.expectedMinutesInOven());
        System.out.println("Remaining minutes in oven: " + lasagna.remainingMinutesInOven(15));
        System.out.println("Preparation time in minutes: " + lasagna.preparationTimeInMinutes(6));
        System.out.println("Total time in minutes: " + lasagna.totalTimeInMinutes(1, 30));

    }

    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * PREPARATION_TIME_PER_LAYER;
    }

    public int totalTimeInMinutes(int layers, int minutes) {
        return preparationTimeInMinutes(layers) + minutes;
    }
}