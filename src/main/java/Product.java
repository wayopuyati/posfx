import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Product {

//   private String description;
//   private double price;
//   private int    unit;

  // property binding for javafx
  private SimpleStringProperty description;
  private SimpleDoubleProperty price;
  private SimpleIntegerProperty  unit;

  public Product() {
  }

  public Product(String description, double price, int unit) {
    this.description = new SimpleStringProperty(description);
    this.price = new SimpleDoubleProperty(price);
    this.unit = new SimpleIntegerProperty(unit);
  }

  public String getDescription() { return description.get(); }
  public double getPrice() { return price.get(); }
  public int getUnit() { return unit.get(); }

  public void setDescription(String description) { this.description.set(description); }
  public void setPrice(double price) { this.price.set(price); }
  public void setUnit(int unit) { this.unit.set(unit); }

  @Override
  public String toString() {
    return String.format("สั่งสินค้า '%s' จำนวน %d ชิ้น ราคาชิ้นละ %.2f บาท", description, unit, price);
  }

}