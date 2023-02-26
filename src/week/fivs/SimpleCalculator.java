package week.fivs;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return this.getFirstNumber() + this.getSecondNumber();
    }

    public double getSubtractionResult() {
        return this.getSecondNumber() - this.getFirstNumber();
    }

    public double getMultiplicationResult() {
        return this.getFirstNumber()*this.getSecondNumber();
    }

    public double getDivisionResult() {
        if (0 == this.getSecondNumber()) return 0;
        return this.getFirstNumber()/this.getSecondNumber();
    }
}
