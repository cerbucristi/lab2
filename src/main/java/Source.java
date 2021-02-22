public class Source {
    private String name;
    private int supply;
    public enum SourceType{
        WAREHOUSE, FACTORY;
    }
    SourceType type;

    public Source(String name, int supply, SourceType type) {
        this.name=name;
        this.supply=supply;
        this.type=type;
    }

    public SourceType getType(){
        return type;
    }

    public void setType(SourceType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getSupply() {
        return supply;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSupply(int supply) {
        this.supply = supply;
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                '}';
    }
}
