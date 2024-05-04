public class Customer {
    private int points;
    public final double pointsMonetaryValue = 0.01;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void redeem_points(int pointsToBeRedeemed) {
        try {
            if (pointsToBeRedeemed >= points) {
                this.points -= pointsToBeRedeemed;
                double MonetaryValue = points * pointsMonetaryValue;
                System.out.println("points redeemed with value " + MonetaryValue);
                System.out.println("Points left = " + points);
            }
            else {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("INSUFFICIENT POINTS CAN'T COMPLETE ACTION");
        }

    }
}
