package cars;

/**
 * 
 *
 * @since 2016-03-07, 23:39:09
 * @author Kacper Roszczyna
 */
public abstract class AbstractCar {
    protected int speed;
    
    public abstract void accelerate();
    
    public int getSpeed(){
        return speed;
    }
    
    public void stop(){
        speed = 0;
    }
}