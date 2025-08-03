public class Bed {
    private double height;
    private int pillows;
    private String sheet_color;

    public Bed(int pillows, double height, String sheetColor){
        this.height = height;
        this.pillows = pillows;
        this.sheet_color = sheetColor;
    }

    public double getHeight() {
        return height;
    }

    public int getPillows() {
        return pillows;
    }

    public String getSheet_color() {
        return sheet_color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }

    public void setSheet_color(String sheet_color) {
        this.sheet_color = sheet_color;
    }

}
