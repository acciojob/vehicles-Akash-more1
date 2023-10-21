package com.driver;

public class Boat extends Car implements WaterVehicle {


    public Boat(String name,  int gears, boolean isManual, int seats) {
        super(name, 0, 2, gears, isManual, "Boat", seats);
    }

    @Override
    public String getVehicleName() {
        return this.getName();
    }

    @Override
    public int getVehicleCapacity() {
        return this.getSeats();
    }
}
