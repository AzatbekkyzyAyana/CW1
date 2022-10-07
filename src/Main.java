public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(386,30,WEAPON.SWORD);
        Magic magic = new Magic(234,465,650);

      //  Warrior warrior1 = new Warrior(56,56,WEAPON.SWORD);




        System.out.println(warrior.printInfo());
        System.out.println(magic.printInfo());
        System.out.println(warrior.printInfo("Ayana"));



    }
}