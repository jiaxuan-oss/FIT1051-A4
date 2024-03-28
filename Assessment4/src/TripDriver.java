import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class TripDriver {

    // code here
    public static void main(String[] args){
        //instantiate a vehicle class instance
        Vehicle v1 = new Vehicle();
        int num5 = 53;
        boolean flag = true;
        double n = 169;
        double x = n;

        double y = 1;
        double e = 0.000001; // e decides the accuracy level
        while(x - y > e) {
            x = (x + y) / 2;
            y = n / x;
        }
        System.out.println(x);



        for (int prime = 2; prime< num5; prime ++){
            if(num5 % prime == 0)
                flag = false;
        }
        System.out.println(flag);

        //set v1 vehicle type to suv
        v1.setVehicleType(Vehicle.VehicleType.SUV);

        //set v1 regoNumber
        v1.setRegoNumber("1SX6JD");

        //set v1 mileage
        v1.setMileage(400.0);

        //instantiate a trip class instance
        Trip t1 = new Trip("Victoria Tour",v1);

        //add destinations into destination list
        t1.addDestinationByIndex("Geelong",0);
        t1.addDestinationByIndex("Venus Bay",1);
        t1.addDestinationByIndex("Mornington Peninsula", 2);

        //print trip class information to the screen
        System.out.println(t1);

        //remove destination
        t1.removeDestinationByIndex(1);

        //print the revised Trip class information to the screen
        System.out.println(t1);
        ArrayList <Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String [] arr2 = {"wada","dwad"};
        String [] arr3 = {"wa","dwa"};

        System.out.println(Arrays.toString(arr3));
        String str = String.format("dwawda %s \n%d","hi",9);
        System.out.println(str);


    }
}
