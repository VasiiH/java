package vasi;

public class Car {

    //class with 5 fieldreturn color;s
    public int doors;
    public int wheels;
    public String model;
    public String color;
    public String engine;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("r8")){  // validModel == "r8" will not support here
            this.model = model;
        }
        else
        this.model = "Unknown";
    }

    public String getModel() { // getModel is a method
        return model; // here the model is field
    }

    public void setColor(String color) {
        String validColor = color.toLowerCase();
        if (validColor.equals("white")){
            this.color = color;
        }else
        this.color = "Company Made";
    }

    public String getColor() {
        return color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }
}
