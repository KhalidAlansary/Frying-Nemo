public class Customer extends Person {
    private int points=0;
    public final double pointsMonetaryValue = 0.01;

    public Customer(String email, String firstName, String lastName) {
        super(email, firstName, lastName);
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        if(points>=0){
            this.points += points;
        }
        else{
            throw new IllegalArgumentException("Can't add negative points");
        }


    }

    public void redeemPoints(int pointsToBeRedeemed) {
        if (pointsToBeRedeemed <= points) {
            this.points -= pointsToBeRedeemed;
            double MonetaryValue = points * pointsMonetaryValue;
            System.out.println("points redeemed with value " + MonetaryValue);
            System.out.println("Points left = " + points);
        }
        else {
            System.out.println("INSUFFICIENT POINTS CAN'T COMPLETE ACTION ");
        }

    }
}
