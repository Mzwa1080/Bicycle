package bicycles;

    public interface Bicycle{

        void accelerate();

         void brake();

         int currentSpeed();

         void stop();

//         void BicycleType(Bicycle bicycleType);
        BicycleType getBicycleType();

        int changeSpeed(int newSpeed);

//        void ride();

//        BicycleType getBicycleType(BicycleType bicycleType);

//        void bicycleType(Bicycle bicycleType);
    }



