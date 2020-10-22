package GUI;

public class Vehicle {
    private String make, model;
    private int year, mileage;

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
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
