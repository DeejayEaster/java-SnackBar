package snackBar;

public class Snack {
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vinMachineId;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
