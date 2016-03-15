package cars;

/**
 * 
 *
 * @since 2016-03-15, 22:19:25
 * @author Kacper Roszczyna
 */
public class Car extends AbstractCar{

    protected String type;
    
    @Override
    public void accelerate() {
        System.out.println("Accelerating a car");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}