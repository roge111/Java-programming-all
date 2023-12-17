package test.lab.common.Read.PARR.Limit;

public class Maximum implements Check {
    private double limit;

    public Maximum(double limit) {
        this.limit = limit;
    }

    @Override
    public boolean check(double value) {
        return value <= limit;
    }

    @Override
    public String message() {
        return "Значение должно быть меньше либо равным значению " + String.valueOf(limit);
    }
}
