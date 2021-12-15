package com.aidai;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public String info(){
        return super.info() + "Type Weapon" + weapon.getTypeWeapon() + "Title Weapon" + weapon.getTitleWeapon();
    }
}


package com.aidai;

public class GameEntity {
    private int HeroHealth;
    private int HeroDamage;
    private int BossHealth;
    private int BossDamage;
    private int SkeletonHealth;
    private int SkeletonDamage;

    public int getHeroHealth() {
        return HeroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        HeroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        HeroDamage = heroDamage;
    }

    public int getBossHealth() {
        return BossHealth;
    }

    public void setBossHealth(int bossHealth) {
        BossHealth = bossHealth;
    }

    public int getBossDamage() {
        return BossDamage;
    }

    public void setBossDamage(int bossDamage) {
        BossDamage = bossDamage;
    }

    public int getSkeletonHealth() {
        return SkeletonHealth;
    }

    public void setSkeletonHealth(int skeletonHealth) {
        SkeletonHealth = skeletonHealth;
    }

    public int getSkeletonDamage() {
        return SkeletonDamage;
    }

    public void setSkeletonDamage(int skeletonDamage) {
        SkeletonDamage = skeletonDamage;
    }
    public String info (){
        return "Boss health = " + BossHealth + "Boss damage " + BossDamage;
    }
}

package com.aidai;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(400);
        boss.setBossDamage(75);

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setSkeletonHealth(100);
        skeleton1.setBossDamage(20);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setSkeletonHealth(110);
        skeleton2.setBossDamage(25);

        boss.weapon.setTitleWeapon("Fiery arms");
        boss.weapon.setTypeWeapon("Katana");

        skeleton1.setArrows(50);

        skeleton2.setArrows(75);

        System.out.println(boss.info());

        System.out.println(skeleton1.infoSk());

        System.out.println(skeleton2.infoSk());
    }
}

package com.aidai;

public class Skeleton extends Boss{
    private int arrows;

    public int getArrows(){
        return arrows;
    }
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public String infoSk(){
        return "Skeleton Health = " + getSkeletonHealth() + "Skeleton Damage = " + getSkeletonDamage() + "arrows" + arrows;
    }
}

package com.aidai;

public class Weapon {
    private String typeWeapon;
    private String titleWeapon;

    public Weapon(){

    }

    public String getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        this.typeWeapon = typeWeapon;
    }

    public String getTitleWeapon() {
        return titleWeapon;
    }

    public void setTitleWeapon(String titleWeapon) {
        this.titleWeapon = titleWeapon;
    }

    public Weapon(String typeWeapon, String titleWeapon){
        this.typeWeapon = typeWeapon;
        this.titleWeapon = titleWeapon;
    }