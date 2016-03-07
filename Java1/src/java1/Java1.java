package java1;

import cars.SuperSportsCar;

/**
 * 
 *
 * @since 2016-03-07, 23:37:43
 * @author Kacper Roszczyna
 */
public class Java1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SuperSportsCar ssc = new SuperSportsCar();
        ssc.accelerate();
        ssc.boost();
        ssc.drift();
        ssc.stop();
    }

}