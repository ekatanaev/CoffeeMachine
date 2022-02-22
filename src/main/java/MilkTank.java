public class MilkTank {
    private int level;

    public MilkTank(int milkLevel) {
        this.level = milkLevel;
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
    public int getMilkLevel() {
        return this.level;
    }


}

