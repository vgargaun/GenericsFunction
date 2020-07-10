package Com;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class FunMain {
    public static Logger logger = Logger.getLogger(FunMain.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

        Figure square = new Figure<Integer>(1, 3);
        Figure triangle = new Figure<Integer>(2,3,5);
        Figure triangle1 = new Figure<Double>(3.0, 5.0);




        try {


            logger.info("Aria triangle: " + triangle.triangleAria());

        }
        catch (IllegalArgumentException e){
            logger.info("Aria triangle: Type is not supported by this method");
        }
        try {


            logger.info("Perimeter triangle: " + triangle.TrianglePerimeter());

        }
        catch (IllegalArgumentException e){
            logger.info("Perimeter triangle: Type is not supported by this method");
        }try {


            logger.info("Side triangle: " + triangle1.triangleSide(80));

        }
        catch (IllegalArgumentException e){
            logger.info("Side triangle: Type is not supported by this method");
        }try {


            logger.info("Aria square: " + square.SquareAria());

        }
        catch (IllegalArgumentException e){
            logger.info("Aria square: Type is not supported by this method");
        }try {


            logger.info("Perimeter square: " + square.SquarePerimeter());

        }
        catch (IllegalArgumentException e){
            logger.info("Perimeter square: Type is not supported by this method");
        }









    }
}
