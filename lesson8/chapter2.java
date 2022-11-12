class Character {
    String name;
    Character(String n) {
        name = n;
    }
    public void fly() {
        System.out.println("Call method fly() in Character");
        System.out.println(name+" fly.");
    }
}
interface Fighting {
    void fight();
}
interface Flying {
    void fly();
}
class Hero extends Character implements Fighting, Flying {

    public Hero(String n) {
        super(n);
    }
    public void fight() {
        System.out.println("Call method fight () in Hero");
        System.out.println(name+" fight.");
}
    public void fly() {
        System.out.println("Call method fly() in Hero");
        System.out.println(name+" fly.");
    }
}
class MultiInherit {
static void doFighting(Fighting f) {
    f.fight();
}
static void doFlying(Flying f) {
    f.fly();
}
static void doAct(Character a) {
    a.fly();
}
public static void main(String[] args) {
    Hero hero = new Hero("Superman");
    doFighting(hero);
    doFlying(hero);
    doAct(hero);
    }
}