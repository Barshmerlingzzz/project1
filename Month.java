public enum Month {
    JENUARY(31),

    FEBUARY(28),

    MARCH(31),

    APRIL(30),

    MAY(31),

    JUNE(30),

    JYLY(31),

    AUGUST(31),

    SEPTEMBER(30),

    OCTOBER(31),

    NOVEMBER(30),

    DECEMBER(31);

    private String month;
    private int days;

    Month(int days) {
        this.days = days;
    }

    public String getMonth() {
        return month;
    }

    public int getDays() {
        return days;
    }

    int monthNum(String month) {
        return (ordinal() + 1);
    }

    public int numbsBefore(String month, int day) {
        int sum = 0;
        int ordi = monthNum(month);
        for (int i = 0; i <; i++) {

        }
    }
}