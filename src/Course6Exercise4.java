// 4) Create an application that creates 3 Products. Use each method of the object
public class Course6Exercise4 {
    public static void main(String[] args) {
 Product firstProduct = new Product();
 Product secondProduct = new Product();
 Product thirdProduct = new Product();
 //verificare:
        System.out.println("%s, %s, %s, %s, %s, %s".formatted(firstProduct.getName("Lapte"),firstProduct.getPrice(5.4),firstProduct.getQuantity(0),firstProduct.getCategory("Lactate"),firstProduct.hasStock(0),firstProduct.isCategory("Lactate")));
        System.out.println("%s, %s, %s, %s, %s, %s".formatted(secondProduct.getName("Salam"),secondProduct.getPrice(20.4),secondProduct.getQuantity(10),secondProduct.getCategory("Mezeluri"),secondProduct.hasStock(10),secondProduct.isCategory("Lactate")));
        System.out.println("%s, %s, %s, %s, %s, %s".formatted(thirdProduct.getName("Mar"),thirdProduct.getPrice(2.4),thirdProduct.getQuantity(1),thirdProduct.getCategory("Fructe"),thirdProduct.hasStock(0),thirdProduct.isCategory("Lactate")));

    }
}
