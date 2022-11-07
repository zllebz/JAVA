public class chapter2 {
    public static void main(String[] args) {
        Monster [] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for(int x = 0; x < 3; x++) {
            ma[x].frighten(x);
        }
    }
}
class Monster {
    boolean frighten(int x) {
        System.out.println("arrrgh");
        return false;
    }
}
class Vampire extends Monster {
    boolean scare(int x) {
        System.out.println("a bite? ");
        return true;
    }
}
class Dragon extends Monster {
    boolean frighten(int degree) {
        System.out.println("breath fire");
        return true;
    }
}
