import java.util.Arrays;

class BirdWatcher {

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static void main(String[] args) {
        int[] lastWeekData = {0, 2, 5, 3, 7, 8, 4};
        BirdWatcher birdWatcher = new BirdWatcher(lastWeekData);
        System.out.println("Get last week " + Arrays.toString(birdWatcher.getLastWeek()));
        System.out.println("Get today " + birdWatcher.getToday());
        birdWatcher.incrementTodaysCount();
        System.out.println("Has day without birds " +  birdWatcher.hasDayWithoutBirds());
        System.out.println("Get count for first days " + birdWatcher.getCountForFirstDays(5));
        System.out.println("Get busy days " + birdWatcher.getBusyDays());
    }

    public int[] getLastWeek() {
        return birdsPerDay.clone();
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int birds: birdsPerDay){
            if(birds == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int totalDays = Math.min(numberOfDays, birdsPerDay.length);

        for(int i = 0; i < totalDays; i++){
            count += birdsPerDay[i];
        }

        return count;
    }

    public int getBusyDays() {
        int numberOfBusyDays = 0;
        for(int birdsCount: birdsPerDay) {
            if(birdsCount >= 5) {
                numberOfBusyDays++;
            }
        }
        return numberOfBusyDays;
    }
}