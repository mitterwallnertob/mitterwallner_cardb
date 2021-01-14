package model;

/**
 * @author Tobias Mitterwallner
 * @version 1
 * @date 14.01.2020
 * @class Vehicle
 */

public class Vehicle {


    private String color, owner, manufacturer, model, licensePlate;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


    @Override
    public String toString() {
        return "Color: " + color +'\n'+
                "Owner: " + owner +'\n'+
                "Manufacturer: " + manufacturer +'\n'+
                "Model: " + model +'\n'+
                "License Plate: " + licensePlate +'\n';
    }
}

