/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.Random;

/**
 *　c16311 加藤圭一郎
 * @author c16311
 */
public class MyPokemon extends Pokemon {
    
    private String mastername;
    private final int TRICK_NUM_MAX=4;
    private final int FORMAT_HP=50;
    private final int FORMAT_STATUS=30;
    
    public MyPokemon(String name,String type1,String mastername){
        super(name,type1);
        set(name,name,type1,null,"いかく","とっしん",20,FORMAT_HP,FORMAT_STATUS,FORMAT_STATUS,FORMAT_STATUS);
        this.mastername = mastername;
    }
    public MyPokemon(String name,String nickname,String type1,String mastername){
        super(name,nickname,type1);
        set(name,nickname,type1,null,"いかく","とっしん",20,FORMAT_HP,FORMAT_STATUS,FORMAT_STATUS,FORMAT_STATUS);
        this.mastername = mastername;
    }
    public MyPokemon(String name,String nickname,String type1,String type2,String mastername){
        super(name,nickname,type1,type2);
        set(name,nickname,type1,type2,"いかく","とっしん",20,FORMAT_HP,FORMAT_STATUS,FORMAT_STATUS,FORMAT_STATUS);
        this.mastername = mastername;
    }
    public MyPokemon(String name,String nickname,String type1,String type2,String trick1,String mastername){
        super(name,nickname,type1,type2,trick1);
        set(name,nickname,type1,type2,trick1,"とっしん",20,FORMAT_HP,FORMAT_STATUS,FORMAT_STATUS,FORMAT_STATUS);
        this.mastername = mastername;
    }
    public MyPokemon(String name,String nickname,
            String type1,String type2,String trick1,String trick2,String mastername){
        super(name,nickname,type1,type2,trick1,trick2);
        set(name,nickname,type1,type2,trick1,trick2,20,FORMAT_HP,FORMAT_STATUS,FORMAT_STATUS,FORMAT_STATUS);
        this.mastername = mastername;
    }
    
    @Override
    public void set(String name,String nickname,String type1,String type2,
            String trick1,String trick2,int level,int heart_point,int atack,int defence,int spped){
         Random rand = new Random();
         //super.name = name;
        this.name=name;
        this.nickname=nickname;
        this.type[0]=type1;
        this.type[1]=type2;
        this.trick[0]=trick1;
        this.trick[1]=trick2;
        this.level=level;
        this.heart_point=rand.nextInt(heart_point)+level*3;
        this.atack = rand.nextInt(atack)+level*2;
        this.defence = rand.nextInt(defence)+level*2;
        this.spped = rand.nextInt(spped)+level*2;
        
    }
    public String getMasterName(){
        return this.mastername;
    }
        
    
}
