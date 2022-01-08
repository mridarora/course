import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

class CarPlan extends Plan {
    static final String inputTag = "CAR_PLAN";
    RangeCriterion mileageCriterion = new RangeCriterion();

    CarPlan(HashMap<String, ArrayList<Tag>> tags) {
        super(tags);

        // If the car mileage is not null
        if (tags.get("CAR.MILEAGE") != null) {
            for (Tag tag : tags.get("CAR.MILEAGE")) {
                mileageCriterion.addCriterion(tag);
            }
        }
    }

    @Override
    // Checking whether the car is eligible to be insured.
    boolean isEligible(Insurable insurable, Date date) {
        if (!(insurable instanceof Car))
            return false;
        Car car = (Car) insurable;
        return mileageCriterion.isInRange(car.getMileage());
    }

    @Override
    Insurable getInsuredItem(Customer customer, Database database) {
        return database.getCar(customer.getName());
    }
}
