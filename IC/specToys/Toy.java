package IC.specToys;

public class Toy {

    int id;
    String name;
    int quan;
    int weight;

    public String info() {
        return "Характеристика игрушки: " + 
        " имя = " + this.getName() + 
        " количество = " + this.getQuan() + 
        " вес = "+ this.getWeight() + 
        " id = " + this.getId();
    }

    public Toy() {
    }

    public Toy( String name, int quan, int weight, int id) {
        this.name = name;
        this.quan = quan;
        this.weight = weight;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
