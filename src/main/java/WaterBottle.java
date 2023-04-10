public class WaterBottle {

    private int volume = 100;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public static int drink() {
        return this.volume -= 10;
    }

    public static int empty() {
        return 0;
    }

    public static int fill() {
        return this.volume = 100;
    }
}

//Create a water bottle class with a volume property.
//The volume should start at 100.
//Add a drink function that takes 10 from the volume each time it is called.
//Create an empty function that brings the volume down to 0.
//Create a fill function that fills the volume back to 100.
