public abstract class Item {

    private String name;
    private double weight;
    private double value;
    private String itemType;


    public Item(String name, double weight, double value) {
        this.name = name;
        this.weight = weight;
        this.value = value;



    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }



    /*public String toString() {
        return "Name: \n"+ getName() + "Weight: \n" + this.weight + "Value: " + this.value;
    }*/

}
