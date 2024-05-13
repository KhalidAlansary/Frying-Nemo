package entities;

public class Customer extends Person {
    private int points = 0;
    public static final double POINTS_MONETARY_VALUE = 0.01;

    public Customer(String email, String firstName, String lastName) {
        super(email, firstName, lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        if (points < 0) {
            throw new IllegalArgumentException("Can't add negative points");
        }
        this.points += points;
    }

    public double redeemPoints(int pointsToBeRedeemed) {
        if (pointsToBeRedeemed > points) {
            throw new IllegalArgumentException("Can't redeem more points than you have");
        }
        this.points -= pointsToBeRedeemed;
        return pointsToBeRedeemed * POINTS_MONETARY_VALUE;
    }
}
