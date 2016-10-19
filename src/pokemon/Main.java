/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 * c16311 加藤圭一郎
 * @author keiichirou
 */
public class Main {
    public static void printStatus(Pokemon pokemon){
        System.out.println("ポケモン名:"+pokemon.getName());
        System.out.println("ニックネーム:"+pokemon.getNickname());
        for(int c=0;c<pokemon.getType_Count();c++){
            if(pokemon.getType(c)==null)
                break;
            System.out.println("タイプ:"+pokemon.getType(c));
        }
        for(int c=0;c<pokemon.getTrick_Count();c++){
            if(pokemon.getTrick(c)==null)
                break;
            System.out.println("わざ"+(c+1)+":"+pokemon.getTrick(c));
        }
        System.out.print("レベル:");System.out.println(pokemon.getLevel());
        System.out.print("攻撃力:");System.out.println(pokemon.getAtack());
        System.out.print("守備力:");System.out.println(pokemon.getDefence());
        System.out.print("素早さ:");System.out.println(pokemon.getSpeed());
        System.out.println();
    }
    public static void main(String[] args){
         MyPokemon p1 = new MyPokemon("スピア","むし","キタバタケ");
         //printStatus(p1);
          Pokemon p2 = new Pokemon("フリーザー","冷蔵庫",
                  "こおり","ひこう","冷凍ビーム","絶対零度");
         //printStatus(p2);
         System.out.println("マスター名:"+p1.getMasterName());
         
         p1.Trick_Learn("どくばり");
         p1.Trick_Learn("いとをはく");
         p1.Trick_Learn("HAA");
         p2.trickReplace(0, "ブリューナク");
         printStatus(p1);
         printStatus(p2);
         
         if(p1.fight(p2))
             System.out.println(p1.getName()+"の勝利");
        else
             System.out.println(p2.getName()+"の勝利");
         
    }
}
