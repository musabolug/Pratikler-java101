package BoxMatch;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int height;
    double dodge ;

    Fighter(String name, int damage,int health,int weight, int height,double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.height = height;

    }

    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " Damaged.");

        if (foe.dodge()) {
            System.out.println(foe.name + " Dodged.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }
    public boolean dodge(){
            double randomNumber = Math.random() *100;
            return randomNumber <= this.dodge;
    }

}

