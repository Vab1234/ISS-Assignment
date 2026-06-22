/*
 - Interfaces in java are just like abstarct classes but the only diff is that in Interfaces each and every method needs to be abstract that is it needs to have another subclass provinding its implementation
 - Objects of interface cannot be instantiated and they can only be used as reference variables. 
 - An interface can have only static and final variables. 
 - It cannot have instance variables. 
 - The methods in an interface are by default abstract and public but since java 9 private methoda are also allowed. 
 - A class can implement multiple interfaces, but it can only inherit from one class. This is how Java achieves multiple inheritance through interfaces.
*/

package Java;

// The Interface
interface Playable {
    int MAX_VOLUME = 100; // Constant(public, static and final by default)

    void play();  // Abstract methods
    void pause(); // Abstract methods

    default void stop() { // Default
        pause();
        rewindToStart();
        System.out.println("Device stopped.");
    }

    private void rewindToStart() { // Private
        System.out.println("Rewinding back to 0:00...");
    }

    static void printInstructionManual() { // Static
        System.out.println("Press play to start. Max volume is " + MAX_VOLUME);
    }
}

class MP3Player implements Playable {
    @Override
    public void play() {
        System.out.println("Playing music.");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music.");
    }
}

public class P9 {
    public static void main(String[] args) {
        Playable.printInstructionManual();
        
        Playable myDevice = new MP3Player();
        myDevice.play();
        myDevice.pause();

        // 4. Test the default method (which triggers the private method)
        myDevice.stop();
    }
}
