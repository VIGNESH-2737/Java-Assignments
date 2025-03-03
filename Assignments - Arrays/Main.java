public class Main {
    public static void main(String[] args) {
        int[] birds = {2, 5, 0, 7, 4, 1};
        BirdWatcher watcher = new BirdWatcher(birds);

        System.out.println(watcher.getToday()); // 1
        watcher.incrementTodaysCount();
        System.out.println(watcher.getToday()); // 2
        System.out.println(watcher.hasDayWithoutBirds()); // true
        System.out.println(watcher.getCountForFirstDays(4)); // 14
        System.out.println(watcher.getBusyDays()); // 2
    }
}
