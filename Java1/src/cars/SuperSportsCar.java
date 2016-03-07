package cars;

/**
 * 
 *
 * @since 2016-03-07, 23:48:18
 * @author Kacper Roszczyna
 */
public class SuperSportsCar extends SportsCar implements Turbo{

    @Override
    public void boost() {
        speed += 40;
        System.out.println("SuperSportsCar speed: "+ speed);
    }
    
    @Override
    public void accelerate(){
        speed +=20;
        System.out.println("SuperSportsCar speed: "+speed);
    }

}