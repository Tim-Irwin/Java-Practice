public class Main {


   public static int calculatePunchDamage(int strength){
       return strength * 2;
   }

   public static int calculateSpecialAttackDamage(int strength, String attackType){
       int damage = strength;
       if(attackType.equals("Fire Punch")){
           damage = damage * 3;
       } else if(attackType.equals("Ice Blast")){
           damage = damage * 2;
       }
       return damage;
   }


    public static void main(String[] args) {
        int villainHealth = 100;
        int punchStrength = 20;
        String attackType = "Fire Punch";

        int damageByPunch = calculatePunchDamage(punchStrength);
        int damageBySpecialAttack = calculateSpecialAttackDamage(punchStrength, attackType);

        System.out.println("Damage by punch: " + damageByPunch + "\nDamage by special attack: "
            + damageBySpecialAttack);
    }
}