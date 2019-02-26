package builder;

public class SportCar {
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

    public SportCar(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;

    }

    static class Builder {
        private String name;
        private String color;
        private String maxSpeed;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(String maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SportCar built() {
            return new SportCar(this);
        }
    }
}
