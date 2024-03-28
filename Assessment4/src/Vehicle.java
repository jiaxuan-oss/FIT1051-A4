public class Vehicle {

    // instance variables
    private String regoNumber;
    private double mileage;
    private VehicleType vehicleType;
    public enum VehicleType {SEDAN, SUV, VAN , MINIBUS}

    // constructor
    public Vehicle(){
        //use setter as guardian code in constructor
        setRegoNumber("XXXXXX");
        setMileage(0);
        setVehicleType(VehicleType.SUV);
    }

    //getter
    public String getRegoNumber(){
        return regoNumber;
    }

    public double getMileage(){
        return mileage;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }

    //setter
    public boolean setRegoNumber(String newRegoNumber){//set vehicle rego number
        boolean flag = false;
        if (newRegoNumber.length() == 6){ //if rego number not equal to 6 then flag = false
            regoNumber = newRegoNumber; //set rego number if rego number is equal to 6
            flag = true;//flag set to true -> set successfully
        }
        else {
            flag = false; //flag set to false if is not 6 letters -> unsuccessfully
        }

        return flag;
    }

    public boolean setMileage(double newMileage){
        boolean flag = false;

        if (newMileage >= 0 && newMileage <= 900){//if mileage less than 900 then set mileage to newmileage
            mileage = newMileage; //set instance variable mileage to newMileage
            flag = true; //flag = true-> set successfully
        }
        else {
            flag = false; //flag = false
        }

        return flag;//return flag
    }

    public boolean setVehicleType(VehicleType newVehicleType){ //set vehicle
        boolean flag = false;

        if (newVehicleType != null) {//if input newVehicleType not equal to null then
            vehicleType = newVehicleType;//set vehicleType to newVehicleType
            flag = true; //set flag to true -> set successfully
        }
        else {
            flag = false;//set flag to false which newVehicleType is null -> set unsuccessfully
        }

        return flag;
    }

    //toString method
    public String toString(){
        //output object state
        String ret = "";
        ret += "Vehicle: " + getVehicleType() + "\n";
        ret += "Rego Number: " + getRegoNumber() + "\n";
        ret += "Mileage: " + getMileage() + "km\n";
        return ret;
    }
}
