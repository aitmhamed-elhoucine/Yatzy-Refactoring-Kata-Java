package entities;

public enum Side {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6);

    private final int value;

    Side(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
