package GUI;

import java.util.TreeMap;
import java.util.TreeSet;

public class Vehicle {
    private String make, model;
    private int year, mileage;
    private static TreeMap<String, TreeSet<String>> makeAndModels = CSVUtility.getMakeAndModel();

    public Vehicle(String make, String model, int year, int mileage) {
        setMake(make);
        setModel(model);
        setYear(year);
        setMileage(mileage);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (makeAndModels.keySet().contains(make))
            this.make = make;
        else
            throw new IllegalArgumentException("make must be in the list:"+makeAndModels.keySet());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (makeAndModels.get(make).contains(model))
            this.model = model;
        else
            throw new IllegalArgumentException(String.format(
                    "valid models for %s are: %s", make, makeAndModels.get(make)
            ));
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage>=0)
            this.mileage = mileage;
        else
            throw new IllegalArgumentException("mileage must be >=0");
    }
}
