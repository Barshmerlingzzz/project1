public class Bed {
    private double height;
    private int pillows;
    private String sheetColor;
    private double price;
    private static final double PRICE = 100.0;
    private static final int PILLOWS= 1;

    public Bed(int pillows, double height, String sheetColor){
        this.height = height;
        this.pillows = pillows;
        this.sheetColor = sheetColor;
        this.price = price();
    }
    public Bed( double height, String sheetColor){
        this(PILLOWS,height,sheetColor);
    }

    private double price() {
        return 0;
    }

    public double getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPillows() {
        return pillows;
    }

    public String getSheetColor() {
        return sheetColor;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }

    public void setSheetColor(String sheetColor) {
        this.sheetColor = sheetColor;
    }


}
