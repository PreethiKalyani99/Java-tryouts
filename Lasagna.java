class Lasagna {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println("Expected minutes in oven: " + lasagna.expectedMinutesInOven());
        System.out.println("Remaining minutes in oven: " + lasagna.remainingMinutesInOven(15));
        System.out.println("Preparation time in minutes: " + lasagna.preparationTimeInMinutes(6));
        System.out.println("Total time in minutes: " + lasagna.totalTimeInMinutes(3, 20));

    }

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int minutes) {
        return preparationTimeInMinutes(layers) + remainingMinutesInOven(minutes);
    }
}