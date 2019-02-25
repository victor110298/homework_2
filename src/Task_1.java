public class Task_1 {
    public static void main(String[] args) {
        SportCar sportCar=new SportCar.Builder("Audi").setColor("black").setMaxSpeed("300").built();
        System.out.println(sportCar.getName());
        System.out.println(sportCar.getColor());
        System.out.println(sportCar.getMaxSpeed());

    }
}

class SportCar{
    private String name;
    private String color;
    private String maxSpeed;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }
    private SportCar(Builder builder){
        this.name=builder.name;
        this.color=builder.color;
        this.maxSpeed=builder.maxSpeed;

    }
    static class Builder{
        private String name;
        private String color;
        private String maxSpeed;

        public Builder(String name){
            this.name=name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(String maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }
        public SportCar built(){
            return new SportCar(this);
        }
    }
}
