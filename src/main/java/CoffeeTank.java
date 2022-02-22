public class CoffeeTank {
    private int level;

    public CoffeeTank(int coffeeLevel) {
        this.level = coffeeLevel;
    }

    public boolean decrease(int level){
        if ((this.level - level) <0 )
            return false;
        else {
            this.level -= level;
            return true;
        }
    }
    public void add(int addLevel){
        this.level += addLevel;
    }
    boolean isEmpty(){
        return this.level == 0;
    }
    public int getCoffee() {
        return this.level;
    }


}

