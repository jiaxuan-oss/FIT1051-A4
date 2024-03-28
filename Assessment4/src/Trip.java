import java.util.ArrayList;
import java.util.Date;

public class Trip {

    // instance variables
    private String tripName;
    private Vehicle aVehicle;
    private Date currentDate;
    private ArrayList<String> destinationList;

    // constructor
    public Trip(String initTripName, Vehicle initAVehicle) {
        //initialise instance variable
        //set TripName as input by going through guardian code (setters)
        setTripName(initTripName);
        addVehicle(initAVehicle);
        destinationList = new ArrayList<>(20);
        currentDate = new Date();
    }

    // getter
    public String getTripName(){
        return tripName;
    }

    public Vehicle getAVehicle() {
        return aVehicle;
    }

    public Date getCurrentDate(){
        return currentDate;
    }

    // setter
    public boolean setTripName(String newTripName){
        //declare and initialised
        boolean flag = false;
        if (newTripName.length() >= 1 && newTripName.length() <= 20){ //if trip length between 1 to 20 then
            tripName = newTripName;// set instance variable as input
            flag  = true; //set flag to true-> value set successfully
        }
        else {
            flag = false; //set flag false-> value set unsuccessfully
        }
        return flag; //return flag
    }

    // other methods
    public boolean addVehicle(Vehicle newVehicle){
        boolean flag = false;

        if (newVehicle != null) { //if newVehicle instance is not null then
            aVehicle = newVehicle; // assign newVehicle to aVehicle
            flag = true; //set flag to true-> value set successfully
        }

        else {
            flag = false; //set flag to false->value set unsuccessfully
        }

        return flag; //return flag
    }

    public boolean addDestinationByIndex(String destinationLocation, int indexPosition){ //add destination to list by index
        boolean flag = false;

        if (destinationLocation != null){ //if destinationLocation is not null then add list
            if (indexPosition >=0 && indexPosition < 20){ //check the index is not more than 20 and less than 0
                destinationList.add(indexPosition, destinationLocation); //adding it to the list
                flag = true; //set flag to true-> destination location added successfully
            }
        }

        else {
            flag = false; //if null or index more than 20 or less than 0 then false
        }

        return flag;
    }

    public boolean removeDestinationByIndex(int destinationLocationIndex){//remove destination in list by index
        boolean flag = false;

        if (destinationLocationIndex >= 0 && destinationLocationIndex < destinationList.size()){ // check whether index within arraylist
            if (destinationList.get(destinationLocationIndex) != null) { //check if the destinationLocation exists within the arraylist
                destinationList.remove(destinationLocationIndex); //if yes then remove
                flag = true; //set flag to true-> successfully removed
            }
        }

        else {
            flag = false; // set flag to false -> unsuccessful
        }

        return flag;
    }

    //other method
    public String toString(){
        //output object state and vehicle's tostring
        String ret = "";
        ret += "Trip Name: " + getTripName() + "\n";
        ret += "Start Date: " + getCurrentDate() + "\n";
        ret += "Destinations: " + destinationList + "\n";
        ret += aVehicle.toString();

        return ret;
    }
}
