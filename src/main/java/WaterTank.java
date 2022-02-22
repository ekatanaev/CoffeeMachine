public class WaterTank {
    private int level;

    public WaterTank(int waterLevel) {
        this.level = waterLevel;
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
    public int getWater() {
        return this.level;
    }


}

