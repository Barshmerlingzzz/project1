public class Room {
    private Bed bed;
    private Closet closet;

    public Room(Bed bed, Closet closet) {
        this.bed = bed;
        this.closet = closet;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Closet getCloset() {
        return closet;
    }

    public void setCloset(Closet closet) {
        this.closet = closet;
    }

    public Room(Bed bed, Shirt[] shirtsArr) {
        this.bed = bed;

    }
}
