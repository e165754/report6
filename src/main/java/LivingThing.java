/**
 * Created by okuhamamasakiyo on 2016/11/27.
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    public int getAttack(){return attack;}

    boolean getDead(){
        return dead;
    }
    public void setDead(boolean dead){
        this.dead = dead;
    }
    int getHitPoint(){
        return hitPoint;
    }
    public void setHitPoint(int HitPoint){
        this.hitPoint = HitPoint;
    }
    public boolean isDead(){
        return dead;
    }
    public String getName(){
        return name;
    }
    public void attack(LivingThing e){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
        e.wounded(damage);
    }
    public void wounded(int damage ){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
}
