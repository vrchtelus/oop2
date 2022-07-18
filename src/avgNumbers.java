public class avgNumbers {
    private double number1=0;
    private double number2=0;
    private double number3=0;
    private double result =0;


    // Getter
    public double getAvgNumber() {
        return result;
    }

    // Setter
    public void setAvgNumber(double newNumber1, double newNumber2, double newNumber3) {
        this.number1 = newNumber1;
        this.number2 = newNumber2;
        this.number3 = newNumber3;
        this.result = (newNumber1+newNumber2+newNumber3)/3;
    }
}
