public class Enemy extends LivingThing {

    public Enemy(String name, int maximumHP, int attack){
        super(name,maximumHP,attack);
    }
    @Override
    public void attack(LivingThing e){
        if(!isDead()){
            int damage = (int)(Math.random() * getAttack());
            if (damage ==0){
                System.out.printf("%sの攻撃！、、、だが、%sは攻撃を回避した。\n",getName(),e.getName());
            }else {
                int judge = (int) (Math.random() * 10);
                if (judge <= 2) {
                    System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！\n", getName(), e.getName(), damage * 2);
                    damage = damage*2;
                } else {
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた。\n", getName(), e.getName(), damage);
                }
                e.wounded(damage);
            }

        }
    }
}
