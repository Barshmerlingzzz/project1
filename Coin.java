public enum Coin {
    DOLLAR((a)-> a*1),
    SHEKEL((a)-> a*0.3),
    EURO((a)->a*1.15),
    ST((a)-> a+1);

    private DoubleOneInt DoubleOneInt;

    Coin(DoubleOneInt doubleOneInt) {
    this.DoubleOneInt = doubleOneInt;
    }

    public double toDollar(double money) {

    }
}
