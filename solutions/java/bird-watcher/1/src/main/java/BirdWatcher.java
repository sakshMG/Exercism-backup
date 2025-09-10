
class BirdWatcher {
    private final int[] birdsPerDay;
     

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
      
    }

    public int[] getLastWeek() {
        int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        ++birdsPerDay[birdsPerDay.length - 1];
    }

    public boolean hasDayWithoutBirds() {

        for (int day: birdsPerDay) {
            if (day == 0) return true;
        }

        return false;
        
    }

    public int getCountForFirstDays(int numberOfDays) {
        int num = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            num += birdsPerDay[i];
        }

        return num;

        
    }

    public int getBusyDays() {

        int num = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            
            if (birdsPerDay[i] >= 5) num++;
        }

        return num;

        
    }
}
