package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int seatsAmount;
    private boolean isWinter;

    public class Key {
        private final boolean remoteStartEngine;
        private final boolean keylessEntry;

        public Key (boolean remoteStartEngine, boolean keylessEntry) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStartEngine=" + remoteStartEngine +
                    ", keylessEntry=" + keylessEntry +
                    '}';
        }
    }
    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String regNumber, int seatsAmount, boolean isWinter) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else this.brand = brand;

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else this.model = model;

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;

        if (color == null || color.isEmpty()) {
            this.color = "white";
        } else this.color = color;

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else this.productionYear = productionYear;

        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else this.productionCountry = productionCountry;

        if (transmission == null || transmission.isEmpty()){
            this.transmission = "default";
        } else this.transmission = transmission;

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else this.bodyType = bodyType;

        if (regNumber == null || regNumber.isEmpty()) {
            this.regNumber = "default";
        } else this.regNumber = regNumber;

        if (seatsAmount <= 0) {
            this.seatsAmount = 4;
        } else this.seatsAmount = seatsAmount;

        this.isWinter = isWinter;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public boolean isWinter() {
        return isWinter;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "white";
        } else this.color = color;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "default";
        } else this.transmission = transmission;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isEmpty()) {
            this.regNumber = "default";
        } else this.regNumber = regNumber;
    }

    public void setWinter(boolean winter) {
        isWinter = winter;
    }

    public void changeTires(int month) {
        if (month >= 1 && month <= 3 || month >= 11 && month <= 12) {
            setWinter(true);
        }
        if (month >= 4 && month <= 10) {
            setWinter(false);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", seatsAmount=" + seatsAmount +
                ", isWinter=" + isWinter +
                '}';
    }
}