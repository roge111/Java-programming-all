package test.lab.common.Read.PARR.Limit;

public class Minimum implements Check {

    private double limit;

    public Minimum(double limit) {
        this.limit = limit;
    }

    @Override
    public boolean check(double value) {
        return value >= limit;
    }

    @Override
    public String message() {
        return "Значение должно быть больше либо равным значению " + String.valueOf(limit);
    }
}
