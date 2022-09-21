package BoxMatch;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight = 0;
    int maxWeight = 0;

    public Ring(Fighter f1, Fighter f2,int weight) {
        this.f1 = f1;
        this.f2 = f2;
        switch (weight){
            case 1:
                this.minWeight += 48;
                this.maxWeight += 74;
            case 2:
                this.minWeight += 75;
                this.maxWeight += 80;
            case 3:
                this.minWeight += 81;
                this.maxWeight += 120;
        }


    }

    public void run() {

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== NEW ROUND ===========");
                f2.health = f1.hit(f2);
                if (isWin()){
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Weights doesn't match.");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Winner : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Winner : " + f1.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Health \t:" + f1.health);
        System.out.println(f2.name + " Health \t:" + f2.health);
    }
}



