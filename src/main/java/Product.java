import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Product {

//   private String description;
//   private double price;
//   private int    unit;

  // property binding for javafx
  private StringProperty description;
  private DoubleProperty price;
  private IntegerProperty  unit;

  public Product() {
  }

  public Product(String description, double price, int unit) {
    setDescription(description);
    setPrice(price);
    setUnit(unit);
  }

  public String getDescription() { return descriptionProperty().get(); }
  public double getPrice() { return priceProperty().get(); }
  public int getUnit() { return unitProperty().get(); }

  public void setDescription(String description) { descriptionProperty().set(description); }
  public void setPrice(double price) { priceProperty().set(price); }
  public void setUnit(int unit) { priceProperty().set(unit); }

  @Override
  public String toString() {
    return String.format("สั่งสินค้า '%s' จำนวน %d ชิ้น ราคาชิ้นละ %.2f บาท", description, unit, price);
  }

  public StringProperty descriptionProperty() {
      if (description == null) {
          description = new SimpleStringProperty(this, "description");
      }
      return description;
  }
  public DoubleProperty priceProperty() {
      if (price == null) {
          price = new SimpleDoubleProperty(this, "price");
      }
      return price;
  }
  public IntegerProperty unitProperty() {
      if (unit == null) {
          unit = new SimpleIntegerProperty(this, "unit");
      }
      return unit;
  }


}