package pl.knab.cars;

/**
 * 
 *
 * @since 2016-03-07, 23:49:41
 * @author Kacper Roszczyna
 */
public class TerrainCar extends Car {

    @Override
    public void accelerate() {
        speed += 5;
        System.out.println("Terrain Car speed: "+speed);
    }

}