public class measuresRectangle {
    private double number1=0;
    private double number2=0;
    private double resultA =0;
    private double resultP =0;
    // Getter
    public double getMeasuresRectangleA() {
        return resultA;
    }

    // Setter
    public void setMeasuresRectangleA(double newNumber1, double newNumber2) {
        this.number1 = newNumber1;
        this.number2 = newNumber2;
        this.resultA = newNumber1*newNumber2;
    }
    public double getMeasuresRectangleP() {
        return resultP;
    }

    // Setter
    public void setMeasuresRectangleP(double newNumber1, double newNumber2) {
        this.number1 = newNumber1;
        this.number2 = newNumber2;
        this.resultP = 2*newNumber1 + 2*newNumber2;
    }
}
