package tyre;

public class Tyre {
    private String make;
    private String model;
    private String size;

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getSize() {
        return this.size;
    }

    public String toString() {
        return "Tyres [make=" + this.make + ", model=" + this.model + ", size=" + this.size + "]";
    }

    // setters for SDI(setter dependency injection)

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(String size) {
        this.size = size;
    }
}