import java.awt.*;

public class Course6Exercise5 {
    public static void main(String[] args) {
        Bottle Aqua = new Bottle();
        System.out.println("%f, %f, %f, %s, %f".formatted(Aqua.moreLiquid(),Aqua.getAvailableLiquid(1000),Aqua.getEmptyCapacity(500), Aqua.openedBottle(false)/*,Aqua.drinkLiquid(300)*/));
        //System.out.println("%s, %s, %s".formatted(Aqua.moreLiquid(),Aqua.getAvailableLiquid(),Aqua.getEmptyCapacity(), Aqua.closedBottle()));

    }
}
