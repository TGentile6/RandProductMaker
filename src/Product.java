public class Product {
    String ID;
    String Name;
    String Desc;
    double Cost;

    public Product(String ID, String name, String desc, double cost) {
        this.ID = ID;
        Name = name;
        Desc = desc;
        Cost = cost;
    }

    public String toCSVDataRecord(){
        return ID + "," + Name + "," + Desc + "," + Cost;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getDesc() {
        return Desc;
    }

    public double getCost() {
        return Cost;
    }


}
