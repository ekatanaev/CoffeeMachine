import java.util.Scanner;

public class CoffeeMachine {
    public static void print(WaterTank waterTank, CoffeeTank coffeeTank, MilkTank milkTank){
        System.out.println(coffeeTank.getCoffee() +" " + waterTank.getWater() + " " + milkTank.getMilkLevel());
    }
    public static void main(String[] args) {
        int coffee = Integer.parseInt(args[0]);
        int water = Integer.parseInt(args[1]);
        int milk = Integer.parseInt(args[2]);
        Scanner scanner = new Scanner(System.in);
        MilkTank milkTank = new MilkTank(milk);
        WaterTank waterTank = new WaterTank(water);
        CoffeeTank coffeeTank = new CoffeeTank(coffee);
        while (true){
            String command = scanner.next();
            switch (command){
                case "milk":
                    int addMilk = scanner.nextInt();
                    milkTank.add(addMilk);
                    print(waterTank, coffeeTank, milkTank);
                    break;
                case "coffee":
                    int addCoffee = scanner.nextInt();
                    coffeeTank.add(addCoffee);
                    print(waterTank, coffeeTank, milkTank);
                    break;
                case "water":
                    int addWater = scanner.nextInt();
                    waterTank.add(addWater);
                    print(waterTank, coffeeTank, milkTank);
                    break;
                case "ristretto":
                    int volumeRistretto = scanner.nextInt();
                    float tempCoffeeRistretto = 0.5f * volumeRistretto;
                    float tempWaterRistretto = 0.5f * volumeRistretto;
                    waterTank.decrease((int)tempWaterRistretto);
                    coffeeTank.decrease((int)tempCoffeeRistretto);
                    print(waterTank, coffeeTank, milkTank);
                    break;
                case "espresso":
                    int volumeEspresso = scanner.nextInt();
                    float tempCoffeeEspresso = ((30 / 100f) * volumeEspresso);
                    float tempWaterEspresso = ((70 / 100f) * volumeEspresso);
                    waterTank.decrease((int) tempWaterEspresso);
                    coffeeTank.decrease((int) tempCoffeeEspresso);
                    print(waterTank, coffeeTank, milkTank);
                    break;
                case "latte":
                    int volumeLatte = scanner.nextInt();
                    float tempCoffeeLatte = ((10 / 100f) * volumeLatte);
                    float tempWaterLatte = ((30 / 100f) * volumeLatte);
                    float tempMilkLatte = ((60 / 100f) * volumeLatte);
                    waterTank.decrease((int) tempWaterLatte);
                    coffeeTank.decrease((int) tempCoffeeLatte);
                    milkTank.decrease((int) tempMilkLatte);
                    print(waterTank, coffeeTank, milkTank);
                    break;
                case "cappuccino":
                    int volumeCappuccino = scanner.nextInt();
                    float tempCoffeeCappuccino = ((15 / 100f) * volumeCappuccino);
                    float tempWaterCappuccino = ((40 / 100f) * volumeCappuccino);
                    float tempMilkCappuccino = ((45 / 100f) * volumeCappuccino);
                    coffeeTank.decrease((int) tempCoffeeCappuccino);
                    waterTank.decrease((int) tempWaterCappuccino);
                    milkTank.decrease((int) tempMilkCappuccino);
                    print(waterTank, coffeeTank, milkTank);
                    break;
                case "lungo":
                    int volumeLungo = scanner.nextInt();
                    float tempCoffeeLungo = ((15 / 100f) * volumeLungo);
                    float tempWaterLungo = ((85 / 100f) * volumeLungo);
                    coffeeTank.decrease((int) tempCoffeeLungo);
                    waterTank.decrease((int) tempWaterLungo);
                    print(waterTank, coffeeTank, milkTank);
                    break;
                case "turn":
                    String turnOff = scanner.next();
                    if (turnOff.equals("off")){
                        System.out.println("See you soon!");
                        return;
                    }
            }
        }
    }
}
