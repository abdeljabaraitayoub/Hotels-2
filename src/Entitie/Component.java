package Entitie;
import Enum.ComponentType;
public abstract class  Component {
    protected int id;
    protected String name;
    protected double unitCost;
    protected int quantity;
    protected ComponentType type;
    protected Double vatRate;


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



    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public ComponentType getType() {
        return type;
    }

    public void setType(ComponentType type) {
        this.type = type;
    }



    public Double getvatRate() {
        return vatRate;
    }

    public void setvatRate(Double vatRate) {
        this.vatRate = vatRate;
    }


    public abstract double calculateTotalCost();

}
