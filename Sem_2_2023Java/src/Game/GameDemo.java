package Game;
/*
Name : Min Thant
ID : 6612012
Section : 544
 */

public class GameDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		GameCharacter gc1 = new GameCharacter(1, 1);
//		System.out.println("gc1 attack = "+gc1.attack()+", class is "+gc1.getClass());
        GameCharacter gc2 = new Wizard(1, 1, 1);
        System.out.println("gc2 attack = "+gc2.attack()+", class is "+gc2.getClass());
        GameCharacter gc3 = new Warrior(1, 1, true);
        System.out.println("gc3 attack = "+gc3.attack()+", class is "+gc3.getClass());
        GameCharacter gc4 = new Assassin(1, 1, true);
        System.out.println("gc4 attack = " + gc4.attack() + " class is " + gc4.getClass());

//		getWeaponDetail(gc1);
        getWeaponDetail(gc2);
        getWeaponDetail(gc3);
        getWeaponDetail(gc4);
    }
    public static void getWeaponDetail (GameCharacter gc) {
        if(gc instanceof Wizard)
            System.out.println("The waeapon detail: wand level is "+((Wizard) gc).getWandLevel());
        else if(gc instanceof Warrior)
            System.out.println("The waeapon detail: "+((Warrior) gc).hasSword());
        else if (gc instanceof Assassin)
            System.out.println("The weapon detail: " + ((Assassin) gc).hasDagger());
        else
            System.out.println("unknown character's class");
    }
}
abstract class GameCharacter {
    protected int hp; //Hit Points or Health Points measure of how healthy the character is in a game
    protected int level;

    public GameCharacter(int hp, int level) {
        this.hp = hp;
        this.level = level;
    }

    /*the decreased hp when attacking*/
    public abstract int attack();
}

class Wizard extends GameCharacter {
    protected int wandLevel;
    public Wizard(int hp, int level, int wandLevel) {
        super(hp, level);
        this.wandLevel = wandLevel;
    }

    public int attack() {
        if(level < 10) {
            return (wandLevel > 2) ? 2 : 1;
        }
        else
            return (wandLevel > 10) ? 4 : 3;
    }

    public int getWandLevel() {
        return wandLevel;
    }
}

class Warrior extends GameCharacter {
    protected boolean hasSword;
    public Warrior(int hp, int level, boolean hasSword) {
        super(hp, level);
        this.hasSword = hasSword;
    }

    public int attack() {
        if(level < 10) {
            return hasSword ? 6 : 5;
        }
        else
            return hasSword ? 8 : 7;
    }

    public String hasSword() {
        return hasSword ? "has a sword." : "doesn't have any sword.";
    }
}

class Assassin extends GameCharacter {
    protected boolean hasDagger;
    public Assassin(int hp, int level, boolean hasDagger) {
        super(hp, level);
        this.hasDagger = hasDagger;
    }

    public int attack() {
        if (level < 10) {
            return hasDagger ? 5 : 4;
        } else
            return hasDagger ? 7 : 6;
    }

    public String hasDagger() { return hasDagger ? "has a dagger." : "doesn't have any dagger."; }
}