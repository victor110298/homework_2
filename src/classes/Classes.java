package classes;

public class Classes {
    public static void main(String[] args) {
        Vehicle.Door vehicle = new Vehicle().new Door();
        vehicle.color();
        Bus.Wheel bus = new Bus.Wheel();
        bus.count();
        Picture picture = new Picture();
        picture.paint();
        People.anonym.showName();


    }
}
//Nested Inner class

class Vehicle {
    class Door {
        public void color() {
            System.out.println("This vehicle has green color");
        }
    }
}


//Static Nested classe

class Bus {
    static class Wheel {
        public static void count() {
            System.out.println("Bus has 4 wheels");
        }

    }
}

//Method Local Inner class

class Picture {
    public void paint() {
        System.out.println("Painting");
        class Color {
            public void chooseColor() {
                System.out.println("Red color");
            }
        }
        Color color = new Color();
        color.chooseColor();
    }
}

// Anonymous Inner class

class People {
    static Anonym anonym = new Anonym() {
        @Override
        public void showName() {
            System.out.println("Ihor");
        }
    };
}

interface Anonym {
    void showName();
}


