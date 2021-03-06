package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
//--
    private int max;

   private List <Bicycle> bikeList;

    public FunRide(int maxNum){
        this.max = maxNum;
        bikeList = new ArrayList<>();
    }

    public String accept(Bicycle bicycleType){
         //EMPTY LIST SO THAT ANY BIKETYPE CAN ENTER ON IT
        if (bikeList.size() < max && !bikeList.contains(bicycleType)) {
            bikeList.add(bicycleType);
            return "Accepted!";
// BIKETYPE ADDED TO THE LIST NOW I NEEED TO CHECK HOW MANY IN THE LIST
        }
            return "FUll!";
    }

    public int getCountForType(BicycleType getType){
        int counter = 0;
//      I must use a enhanced loop looping through the bikelist
        for(Bicycle bike : bikeList ){
            if(bike.getBicycleType() == getType){
                counter++;
            }
        }
        return counter;
    }

//----ACCEPTS BICYCLES AND RETURN THE NUMBER OF THEM ALL

    public int getEnteredCount(){
         return bikeList.size();
    }


}
