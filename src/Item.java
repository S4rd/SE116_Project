public abstract class Item {

    private String name;
    private int weight;
    private double value;


    public Item(String name, int weight, double value) {
        this.name = name;
        this.weight = weight;
        this.value = value;

    }

    public void specialAction(){


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }



    /*public String toString() {
        return "Name: \n"+ getName() + "Weight: \n" + this.weight + "Value: " + this.value;
    }*/

}
