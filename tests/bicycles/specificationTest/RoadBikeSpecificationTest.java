package bicycles.specificationTest;


import bicycles.BicycleType;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;


//import static org.junit.jupiter.api.AssertEquals.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeSpecificationTest {
    @Test
    public void RoadBikeAccelerationSpeedSpecification(){
        BicycleSpecification roadBikeAccelerationSpeedSpecification = new BicycleSpecification(11, -4, BicycleType.ROADBIKE);
        assertEquals(roadBikeAccelerationSpeedSpecification.getAccelerationSpeed(),11);
    }

    @Test
    public void RoadBikeBrakeSpeedSpecification(){
        BicycleSpecification roadBikeBrakeSpeedSpecification = new BicycleSpecification(11, -4, BicycleType.ROADBIKE);
        assertEquals(roadBikeBrakeSpeedSpecification.getBrakeSpeed(),-4);
    }
}
