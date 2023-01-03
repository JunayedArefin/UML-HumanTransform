package humantransform;

public class Market extends Human {
    public String id;
    public String cupon;
    public String address;

    public Market(String id, String cupon, String address, String Name, String Gender, int Age, double Hight) {
        super(Name, Gender, Age, Hight);
        this.id = id;
        this.cupon = cupon;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getCupon() {
        return cupon;
    }

    public String getAddress() {
        return address;
    }

 
}
