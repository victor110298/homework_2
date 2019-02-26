package builder;

public class Builder {

    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder("Audi").setColor("black").setMaxSpeed("300").built();
        System.out.println(sportCar.getName());
        System.out.println(sportCar.getColor());
        System.out.println(sportCar.getMaxSpeed());

    }
}



