public class Water {

    private double volume;

    public Water(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }


    public double drink() {
        return this.volume - 10.0;
    }

    public double emptyBottle() {
        return this.volume = 0;
    }

    public double fillBottle() {
        return this.volume = 100;
    }

}