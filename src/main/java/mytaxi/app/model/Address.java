package mytaxi.app.model;

public class Address {

    private String city;
    private String street;
    private String house;
    private double lat;
    private double lon;

    public Address() {
    }

    public Address(String city, String street, String house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public Address(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public Address(String city, String street, String house, double lat, double lon) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.lat = lat;
        this.lon = lon;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
