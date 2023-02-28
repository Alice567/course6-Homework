public class Bottle {
    double totalCapacity, availableLiquid;
    boolean open;

    public boolean moreLiquid(){
        if(availableLiquid>totalCapacity){
            return true;
        }
        else {
            return false;
        }
    }
    public double getAvailableLiquid(double availableLiquid){
        return this.availableLiquid = availableLiquid;
    }

    public double getEmptyCapacity(double totalCapacity){
        return this.totalCapacity-this.availableLiquid;
    }
    public String openedBottle(boolean open){
        if(this.open =true){
            return "Bottle already open";
        }
        else {
            this.open = true;
            return "Bottle is opened";
        }
    }
    public String closedBottle(boolean open){
        this.open = false;
        return "Bottle is closed";
    }
//    public double drinkLiquid(double liquidToBeDrinked){
//             if(this.open = false){
//            System.out.println("The bottle is closed");
//        }
//        if((availableLiquid - liquidToBeDrinked)<0){
//            System.out.println("There is not enough liquid");
//        }
//        else
//            System.out.println("Available liquid is now %s".formatted(availableLiquid-liquidToBeDrinked));
//        return Double.parseDouble("Available liquid %d".formatted(this.availableLiquid));
//    }

   }
