package com.example.carcompany.process;

import java.util.ArrayList;
import java.util.Arrays;

public class Vehicle {

    public static ArrayList<ArrayList<String>> vehicleList = new ArrayList<ArrayList<String>>();

    /**
     * @param plate
     * @param color
     * @param make
     * @param model
     * @param year
     * @param ownerName
     * @param ownerCredential
     * @param ownerLastname
     * */
    public void addToArray(String plate, String make,String model, String year,
                           String color, String ownerName, String ownerLastname,String ownerCredential){
        ArrayList<String> vector = new ArrayList<String>(Arrays.asList(plate, make, model, year, color, ownerName, ownerLastname, ownerCredential));

        vehicleList.add(vector);
    }

    /**
     * @param index this param will be use to get the correct array to display into Grid view
     *
     */
    public ArrayList<String> viewArrayList(int index){

        return vehicleList.get(index);

    }

    public ArrayList<ArrayList<String>> getAllMatrix(){

        return vehicleList;
    }


}
