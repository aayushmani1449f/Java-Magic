package Practice;

class Car { // Class
    String color;

    void drive() {
        System.out.println(color + " car is driving");
    }
}

class Main { // Main executable class
    public static void main(String[] args) {
        Car c1 = new Car(); // Object created by the class Car
        c1.color = "Red";
        c1.drive();
    }
}