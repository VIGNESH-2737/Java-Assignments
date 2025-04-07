import java.util.Scanner;

interface Playable {
    void play();
    void pause();
    void stop();
}

class MP3Player implements Playable {
    public void play() {
        System.out.println("Playing MP3 file...");
    }
    public void pause() {
        System.out.println("Pausing MP3 playback...");
    }
    public void stop() {
        System.out.println("Stopping MP3 player...");
    }
}

class CDPlayer implements Playable {
    public void play() {
        System.out.println("Playing CD...");
    }
    public void pause() {
        System.out.println("Pausing CD...");
    }
    public void stop() {
        System.out.println("Stopping CD player...");
    }
}

class StreamingPlayer implements Playable {
    public void play() {
        System.out.println("Streaming music online...");
    }
    public void pause() {
        System.out.println("Pausing streaming...");
    }
    public void stop() {
        System.out.println("Stopping stream...");
    }
}

abstract class MusicPlayerFactory {
    public abstract Playable createPlayer();
}

class MP3PlayerFactory extends MusicPlayerFactory {
    public Playable createPlayer() {
        return new MP3Player();
    }
}

class CDPlayerFactory extends MusicPlayerFactory {
    public Playable createPlayer() {
        return new CDPlayer();
    }
}

class StreamingPlayerFactory extends MusicPlayerFactory {
    public Playable createPlayer() {
        return new StreamingPlayer();
    }
}

public class MusicPlayerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicPlayerFactory factory = null;

        System.out.println("Choose Music Player:\n1. MP3 Player\n2. CD Player\n3. Streaming Player");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: factory = new MP3PlayerFactory(); break;
            case 2: factory = new CDPlayerFactory(); break;
            case 3: factory = new StreamingPlayerFactory(); break;
            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }

        Playable player = factory.createPlayer();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose Action:\n1. Play\n2. Pause\n3. Stop\n4. Exit");
            int action = sc.nextInt();
            switch (action) {
                case 1: player.play(); break;
                case 2: player.pause(); break;
                case 3: player.stop(); break;
                case 4: exit = true; break;
                default: System.out.println("Invalid action.");
            }
        }

        sc.close();
        System.out.println("Music Player exited.");
    }
}
