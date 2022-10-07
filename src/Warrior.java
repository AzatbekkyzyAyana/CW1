public class Warrior extends Hero {
    private Integer damage;
    private WEAPON nurbol;

    public Warrior(Integer helth, Integer damage,WEAPON nurbol) {
        super(helth);
        this.damage = damage;
        this.nurbol = nurbol;
    }

    public Integer getDamage() {
        return damage;
    }

    public Warrior(Integer helth) {
        super(helth);

    }
    public String printInfo() {
        return " HP "+ getHelth() +" damage "+ getDamage();

    }
    public final String printInfo(String Nar) {
     return  " HP " + getHelth() + " damage" + getDamage() +" Sword "+ this.nurbol;
    }
}
