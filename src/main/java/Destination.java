public class Destination {
    private String name;
    private int demand;

    public Destination (String names, int demand)
    {
        name=names;
        this.demand=demand;
    }

    public String getName() {
        return name;
    }

    public int getDemand() {
        return demand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }


    @Override
    public java.lang.String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                '}';
    }
}
