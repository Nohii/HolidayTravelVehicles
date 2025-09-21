package src;
public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.serialNumber = "PR214";
        v.model = "GT3RS";
        v.year = 2025;
        v.manufacturer = "Porsche";
        v.baseCost = 130000;

        System.out.println("Serial Number: " + v.serialNumber);
        System.out.println("Model: " + v.model);
        System.out.println("Year: " + v.year);
        System.out.println("Manufacturer: " + v.manufacturer);
        System.out.println("Base Cost: $" + v.baseCost);
    }
}
