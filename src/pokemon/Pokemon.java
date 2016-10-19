/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.Random;

/**
 *　c16311 加藤圭一郎
 * @author keiichirou
 */
public class Pokemon {
    protected String name;        //ポケモンネーム
    protected String nickname;    //ニックネーム
    protected String type[]=new String[2];//タイプ
    protected String trick[] = new String[4];    //技
    protected int level;          //レベル
    protected int heart_point;    //HP
    protected int atack;          //攻撃力
    protected int defence;        //防御力
    protected int spped;          //スピード
    
    //private int trick_count;
    private final int TRICK_NUM_MAX=2;
    private final int FORMAT_HP=15;
    private final int FORMAT_STATUS=10;
    
    
    public Pokemon(String name,String type1){
         set(name,name,type1,null,"たいあたり","はたく",1,FORMAT_HP,FORMAT_STATUS,FORMAT_STATUS,FORMAT_STATUS);
    }
    public Pokemon(String name,String nickname,String type1){
         set(name,nickname,type1,null,"たいあたり","はたく",1,FORMAT_HP,FORMAT_STATUS,FORMAT_STATUS,FORMAT_STATUS);
    }
    public Pokemon(String name,String nickname,String type1,String type2){
         set(name,nickname,type1,type2,"たいあたり","はたく",1,FORMAT_HP,FORMAT_STATUS,FORMAT_STATUS,FORMAT_STATUS);
    }
    public Pokemon(String name,String nickname,String type1,String type2,String trick1){
         set(name,nickname,type1,type2,trick1,"はたく",1,FORMAT_HP,FORMAT_STATUS,FORMAT_STATUS,FORMAT_STATUS);
    }
    public Pokemon(String name,String nickname,
            String type1,String type2,String trick1,String trick2){
         set(name,nickname,type1,type2,trick1,trick2,1,FORMAT_HP,FORMAT_STATUS,FORMAT_STATUS,FORMAT_STATUS);
    }
    public void set(String name,String nickname,String type1,String type2,
            String trick1,String trick2,int level,int heart_point,int atack,int defence,int spped){
         Random rand = new Random();
        this.name=name;
        this.nickname=nickname;
        this.type[0]=type1;
        this.type[1]=type2;
        this.trick[0]=trick1;
        this.trick[1]=trick2;
        this.level=level;
        this.heart_point=rand.nextInt(heart_point)+1;
        this.atack = rand.nextInt(atack)+1;
        this.defence = rand.nextInt(defence)+1;
        this.spped = rand.nextInt(spped)+1;
        
    }
    
    public String getName(){return name;}
    public String getNickname(){return nickname;}
    public String getType(int num){return type[num];}
    public String getTrick(int num){return trick[num];}
    public int getLevel(){return level;}
    public int getAtack(){return atack;}
    public int getDefence(){return defence;}
    public int getSpeed(){return spped;}
    
    public int getType_Count(){return type.length;}
    public int getTrick_Count(){
         int c=0;
        while(trick[c]!=null){
            if(TRICK_NUM_MAX==c+1)
                return TRICK_NUM_MAX;
            c++;
        }
        return c;
    }
    public boolean Trick_Learn(String str){
        //if(getTrick_Count()<=TRICK_NUM_MAX)
        
        if(getTrick_Count()==TRICK_NUM_MAX)
            return false;
        this.trick[getTrick_Count()]=str;
        
        return true;
    }
    public void trickReplace(int num,String tricks){
        String tmp = tricks;
        trick[num]=tricks;
    }
    public boolean fight(Pokemon ee){
        while(heart_point>0 && ee.heart_point>0){
            if(getSpeed()<ee.getSpeed()){
                if(ee.getAtack()-getDefence()>0)
                    heart_point-=ee.getAtack()-getDefence();
                else
                    heart_point-=1;
                
                if(getAtack()-ee.getDefence()>0)
                    ee.heart_point -= getAtack()-ee.getDefence();
                else
                    ee.heart_point-=1;
            }else{
                
               if(getAtack()-ee.getDefence()>0)
                    ee.heart_point -= getAtack()-ee.getDefence();
                else
                    ee.heart_point-=1;
                if(ee.getAtack()-getDefence()>0)
                    heart_point-=ee.getAtack()-getDefence();
                else
                    heart_point-=1;
            }
            
        }
        if(heart_point>0)
            return true;
        else
            return false;
    }
    
}
