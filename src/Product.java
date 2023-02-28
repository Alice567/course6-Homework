// 3) create an object that represents a Product
public class Product {
    String name, category;
    double price;
    int quantity;

    public String getName(String name){
       return this.name = name;
    }
    public String getCategory(String category) {
        return this.category = category;
    }
    public int getQuantity(int quantity) {
        return this.quantity = quantity;
    }
    public double getPrice(double price) {
        return this.price = price;
    }
    public boolean hasStock(int quantity) {
        if (quantity != 0) {
            return true;
        } else {
            return false;
        }
    }
         public boolean isCategory(String category){
            if(category==this.category){
                return true;
            }
            else {
                return false;
            }
        }
    }



