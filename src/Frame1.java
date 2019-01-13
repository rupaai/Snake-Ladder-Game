import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import sun.audio.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EZIO
 */
public class Frame1 extends javax.swing.JFrame {

    
    
    int a,s,n,z;
    int start;
    int i2=0,n2,flag2=0,b2=0;
    int i;
    int flag = 0;
    int b = 0;
    int count1=0;
    int q=0;
    static int duration1=0;
    int joker=0,dog=0,car=0,boat=0,slide=0,frog=0,fish=0,ball=0,bunny=0,cat=0,seesaw=0,flower=0,bird=0,sack=0,tree=0,bfly=0,goat=0,circus=0,curt=0,bucket=0,apple=0,dive=0;

    
    private Timer timer;
    private static Timer timer2;
    private Timer timer3;
    
    public Frame1() {

        initComponents();
        setTitle("Snake-Ladder");
        guti.setOpaque(false);
        guti.setContentAreaFilled(false);
        guti.setBorderPainted(true);
        guti2.setOpaque(false);
        guti2.setContentAreaFilled(false);
        guti2.setBorderPainted(true);
        jLabel3.setOpaque(false);
        b = guti.getY();
        b2=guti2.getY();
        guti2.disable();
        guti.disable();
        jLabel8.setOpaque(false);
        jLabel8.setVisible(true);
        jLabel9.setVisible(false);
        backbtn.setOpaque(false);
        backbtn.setContentAreaFilled(false);
        backbtn.setBorderPainted(true);
        DiceNum.setEditable(false);
        durations();
        timer2.start();
        turn.setOpaque(false);
        turn.setContentAreaFilled(false);
        turn.setBorderPainted(true);
        boardChange();
        turnP();
        timer3.start();
        
    }
    
    
    //Movement of player's pawn
    
    private void GutiMove() {
        
            flag++;
            
            System.out.println(flag);

            if ((flag > 0 && flag <= 12) || (flag > 25 && flag <= 38) || (flag > 51 && flag <= 64) || (flag > 77 && flag <= 90) || (flag > 103 && flag <= 116)) {
                
                
                
                
                if (flag == 26 || flag == 52 || flag == 78 || flag == 104){
                    
                    guti.move(guti.getX(),b);
                    
                }
                
                else{
                        guti.move(guti.getX() + 85, b);
                    }
                
                
                if (flag == 12 || flag == 38 || flag == 64 || flag == 90 || flag == 116) {
                    
                    if((i==n-1) && (circus==90 || circus==64 || car==12)){
                        
                        if(flag==circus || flag==car)
                        b=guti.getY(); 
                        else
                        b = guti.getY() - 65;
                        
                    }
                    else
                    b = guti.getY() - 65;
                }
                
                
                if(i==n-1){
                
                    if(flag==joker){
                         b=guti.getY()-65*2;
                         guti.move(guti.getX()+85,b);
                         music(2);
                         if(joker==2)
			    flag=29;
			 else if(joker==100)
			    flag=125;
			 else if(joker==19)
			    flag=44;
                         }
                    else if(flag==dog){
                         b=guti.getY()-65;
                         guti.move(guti.getX()-85,b);
                         music(5);
                         if(dog==5)
			    flag=21;
			 else if(dog==37)
			    flag=41;
			 else if(dog==115)
			    flag=119;
                         }
                    else if(flag==boat){
                         b=guti.getY()-65;
                         guti.move(guti.getX()+85*2,b);
                         music(10);
                         if(boat==10)
			    flag=13;
			 else if(boat==78)
			    flag=101;
			 else if(boat==71)
			    flag=86;
                    }
                    else if(flag==fish){
                        b=guti.getY()-65;
                         guti.move(guti.getX(),b);
                         music(37);
                         if(fish==37)
			    flag=40;
			 else if(fish==67)
			    flag=88;
			 else if(fish==22)
			    flag=29;
                    }
                    else if(flag==seesaw){
                         b=guti.getY()-65*2;
                         guti.move(guti.getX()-85,b);
                         music(55);
                         if(seesaw==55)
			    flag=80;
		 	 else if(seesaw==61)
			    flag=86;
			 else if(seesaw==62)
			    flag=87;
                    }
                    else if(flag==flower){
                         b=guti.getY()-65*3;
                         guti.move(guti.getX(),b);
                         music(60);
                         if(flower==60)
			    flag=95;
			 else if(flower==4)
			    flag=47;
                   }
                    else if(flag==tree){
                         b=guti.getY()-65*2;
                         guti.move(guti.getX()-85,b);
                         music(85);
                         if(tree==85)
			    flag=110;
			 else if(tree==92)
			    flag=119;
			 else if(tree==24){
                         flag=51;
                         b=guti.getY()-65;
                         }
			    
                    }
                    else if(flag==bfly){
                         b=guti.getY()-65*2;
                         guti.move(guti.getX()+85*2,b);
                         music(87);
                         if(bfly==87)
			    flag=115;
			 else if(bfly==97)
			    flag=121;
			 else if(bfly==99)
			    flag=124;
                    }
                    else if(flag==circus){
                         b=guti.getY()-65*3;
                         guti.move(guti.getX(),b);
                         music(90);
                         if(circus==90)
			    flag=117;
			 else if(circus==64)
			    flag=91;
			 else if(circus==13){
                         flag=64;
                         b=guti.getY()-65;
                         }
			    
                    }
                    
                    else if(flag==car){
                    	guti.move(guti.getX()-85*2,b);
                    	music(8);
                    	if(car==8)
			    flag=6;
			else if(car==12)
			    flag=10;
			else if(car==61)
			    flag=59;
                    }
                    
                    else if(flag==slide){
                    	b=guti.getY()+2*65;    
                    	guti.move(guti.getX()+85,b);
                    	music(26);
                    	if(slide==26)
			    flag=1;
			else if(slide==84)
			    flag=59;
			else if(slide==34)
			    flag=9;
                    }
                 
                    else if(flag==frog){
                    	guti.move(guti.getX()-85,guti.getY());
                    	music(32);
                    	if(frog==32)
			    flag=31;
			else if(frog==2)
			    flag=1;
			else if(frog==110)
			    flag=109;
                    }
                    else if(flag==cat){
                    	b=guti.getY()+65;
                    	guti.move(guti.getX()+85,b);
                    	music(53);
                    	if(cat==53)
			    flag=49;
			else if(cat==128)
			    flag=106;
			else if(cat==15)
			    flag=11;
                    }
                    else if(flag==sack){
                    	b=guti.getY()+65;
                    	guti.move(guti.getX()+85,b);
                    	music(44);
                    	if(sack==82)
			    flag=72;
			else if(sack==34)
			    flag=16;
			else if(sack==77)
			    flag=53;
                    }
                    else if(flag==goat){
                    	b=guti.getY()+65*2;
                    	guti.move(guti.getX()+85,b);
                    	music(89);
                    	if(goat==89){
                        flag=64;
                        b=guti.getY()-65;
                        }
			else if(goat==76)
                    	    flag=49;
			else if(goat==92)
                    	    flag=65;
                    }
                    else if(flag==curt){
                    	b=guti.getY()+65;
                    	guti.move(guti.getX()-85,b);
                    	music(109);
                    	if(curt==109)
			    flag=99;
			else if(curt==44)
			    flag=32;
			else if(curt==55)
			    flag=49;
                    }
                    else if(flag==ball){
                    	b=guti.getY()+65*2;
                    	guti.move(guti.getX(),b);
                    	music(42);
                    	if(ball==42)
			    flag=16;
			else if(ball==89)
			    flag=63;
			else if(ball==100)
			    flag=74;
                    }
                    else if(flag==bunny){
                    	guti.move(guti.getX()+85,guti.getY());
                    	music(44);
                    	if(bunny==44)
			    flag=43;
			else if(bunny==6)
			    flag=7;
			else if(bunny==94)
			    flag=93;
                    }
                    else if(flag==bird){
                    	b=guti.getY()+65*2;
                    	guti.move(guti.getX()-85*2,b);
                    	music(71);
                    	if(bird==71)
			    flag=47;
			else if(bird==99)
			    flag=75;
			else if(bird==121)
			    flag=97;
                    }
                    else if(flag==bucket){
                    	b=guti.getY()+65*2;
                    	guti.move(guti.getX()-85,b);
                    	music(102);
                    	if(bucket==102){
                        flag=77;
                        b=guti.getY()-65;
                        }
			else if(bucket==120)
			    flag=95;
			else if(bucket==127)
			    flag=102;
                    }
                    else if(flag==apple){
                    	b=guti.getY()+65;
                    	guti.move(guti.getX()+85*2,b);
                    	music(122);
                    	if(apple==122)
			    flag=113;
			else if(apple==26)
			    flag=23;
			else if(apple==73)
			    flag=58;
                    }
                    else if(flag==dive){
                    	b=guti.getY()+65;
                    	guti.move(guti.getX()+85,b);
                    	music(127);
                    	if(dive==127)
			    flag=107;
			else if(dive==73)
			    flag=57;
			else if(dive==41)
			    flag=37;
                    }
                    
                    
                }
                
                 
                 
                            
            }
            
            
            
            else if ((flag > 12 && flag <= 25) || (flag > 38 && flag <= 51) || (flag > 64 && flag <= 77) || (flag > 90 && flag <= 103) || (flag > 116 && flag <= 129)) {
                
               
                
                
                
                if (flag == 13 || flag == 39 || flag == 65 || flag == 91 || flag == 117){
                    guti.move(guti.getX(),b);   
                }
                
                else{
                guti.move(guti.getX() - 85, b);
                }
                
                if (flag == 25 || flag == 51 || flag == 77 || flag == 103 || flag == 129) {
                    
                    if((i==n-1) && (sack==77)){
                        if(flag==sack)
                            b=guti.getY();
                        else
                            b = guti.getY() - 65;
                    }
                    else
                    b = guti.getY() - 65;
                }
                
                
                if(i==n-1){
                    
                   if(flag==joker){
                         b=guti.getY()-65*2;
                         guti.move(guti.getX()+85,b);
                         music(2);
                         if(joker==2)
			    flag=29;
			 else if(joker==100)
			    flag=125;
			 else if(joker==19)
			    flag=44;
                         }
                    else if(flag==dog){
                         b=guti.getY()-65;
                         guti.move(guti.getX()-85,b);
                         music(5);
                         if(dog==5)
			    flag=21;
			 else if(dog==37)
			    flag=41;
			 else if(dog==115)
			    flag=119;
                         }
                    else if(flag==boat){
                         b=guti.getY()-65;
                         guti.move(guti.getX()+85*2,b);
                         music(10);
                         if(boat==10)
			    flag=13;
			 else if(boat==78)
			    flag=101;
			 else if(boat==71)
			    flag=86;
                    }
                    else if(flag==fish){
                        b=guti.getY()-65;
                         guti.move(guti.getX(),b);
                         music(37);
                         if(fish==37)
			    flag=40;
			 else if(fish==67)
			    flag=88;
			 else if(fish==22)
			    flag=29;
                    }
                    else if(flag==seesaw){
                         b=guti.getY()-65*2;
                         guti.move(guti.getX()-85,b);
                         music(55);
                         if(seesaw==55)
			    flag=80;
		 	 else if(seesaw==61)
			    flag=86;
			 else if(seesaw==62)
			    flag=87;
                    }
                    else if(flag==flower){
                         b=guti.getY()-65*3;
                         guti.move(guti.getX(),b);
                         music(60);
                         if(flower==60)
			    flag=95;
			 else if(flower==4)
			    flag=47;
                   }
                    else if(flag==tree){
                         b=guti.getY()-65*2;
                         guti.move(guti.getX()-85,b);
                         music(85);
                         if(tree==85)
			    flag=110;
			 else if(tree==92)
			    flag=119;
			 else if(tree==24){
                          flag=51;
                          b=guti.getY()-65;
                         }
			   
                    }
                    else if(flag==bfly){
                         b=guti.getY()-65*2;
                         guti.move(guti.getX()+85*2,b);
                         music(87);
                         if(bfly==87)
			    flag=115;
			 else if(bfly==97)
			    flag=121;
			 else if(bfly==99)
			    flag=124;
                    }
                    else if(flag==circus){
                         b=guti.getY()-65*3;
                         guti.move(guti.getX(),b);
                         music(90);
                         if(circus==90)
			    flag=117;
			 else if(circus==64)
			    flag=91;
			 else if(circus==13){
                         flag=64;
                         b=guti.getY()-65;
                         }
			    
                    }
                    
                    else if(flag==car){
                    	guti.move(guti.getX()-85*2,b);
                    	music(8);
                    	if(car==8)
			    flag=6;
			else if(car==12)
			    flag=10;
			else if(car==61)
			    flag=59;
                    }
                    
                    else if(flag==slide){
                    	b=guti.getY()+2*65;    
                    	guti.move(guti.getX()+85,b);
                    	music(26);
                    	if(slide==26)
			    flag=1;
			else if(slide==84)
			    flag=59;
			else if(slide==34)
			    flag=9;
                    }
                 
                    else if(flag==frog){
                    	guti.move(guti.getX()-85,guti.getY());
                    	music(32);
                    	if(frog==32)
			    flag=31;
			else if(frog==2)
			    flag=1;
			else if(frog==110)
			    flag=109;
                    }
                    else if(flag==cat){
                    	b=guti.getY()+65;
                    	guti.move(guti.getX()+85,b);
                    	music(53);
                    	if(cat==53)
			    flag=49;
			else if(cat==128)
			    flag=106;
			else if(cat==15)
			    flag=11;
                    }
                    else if(flag==sack){
                    	b=guti.getY()+65;
                    	guti.move(guti.getX()+85,b);
                    	music(44);
                    	if(sack==82)
			    flag=72;
			else if(sack==34)
			    flag=16;
			else if(sack==77)
			    flag=53;
                    }
                    else if(flag==goat){
                    	b=guti.getY()+65*2;
                    	guti.move(guti.getX()+85,b);
                    	music(89);
                    	if(goat==89){
                         flag=64;
                         b=guti.getY()-65;
                        }
			else if(goat==76)
                    	    flag=49;
			else if(goat==92)
                    	    flag=65;
                    }
                    else if(flag==curt){
                    	b=guti.getY()+65;
                    	guti.move(guti.getX()-85,b);
                    	music(109);
                    	if(curt==109)
			    flag=99;
			else if(curt==44)
			    flag=32;
			else if(curt==55)
			    flag=49;
                    }
                    else if(flag==ball){
                    	b=guti.getY()+65*2;
                    	guti.move(guti.getX(),b);
                    	music(42);
                    	if(ball==42)
			    flag=16;
			else if(ball==89)
			    flag=63;
			else if(ball==100)
			    flag=74;
                    }
                    else if(flag==bunny){
                    	guti.move(guti.getX()+85,guti.getY());
                    	music(44);
                    	if(bunny==44)
			    flag=43;
			else if(bunny==6)
			    flag=7;
			else if(bunny==94)
			    flag=93;
                    }
                    else if(flag==bird){
                    	b=guti.getY()+65*2;
                    	guti.move(guti.getX()-85*2,b);
                    	music(71);
                    	if(bird==71)
			    flag=47;
			else if(bird==99)
			    flag=75;
			else if(bird==121)
			    flag=97;
                    }
                    else if(flag==bucket){
                    	b=guti.getY()+65*2;
                    	guti.move(guti.getX()-85,b);
                    	music(102);
                    	if(bucket==102){
                        flag=77;
                        b=guti.getY()-65;
                        }			    
			else if(bucket==120)
			    flag=95;
			else if(bucket==127)
			    flag=102;
                    }
                    else if(flag==apple){
                    	b=guti.getY()+65;
                    	guti.move(guti.getX()+85*2,b);
                    	music(122);
                    	if(apple==122)
			    flag=113;
			else if(apple==26)
			    flag=23;
			else if(apple==73)
			    flag=58;
                    }
                    else if(flag==dive){
                    	b=guti.getY()+65;
                    	guti.move(guti.getX()+85,b);
                    	music(127);
                    	if(dive==127)
			    flag=107;
			else if(dive==73)
			    flag=57;
			else if(dive==41)
			    flag=37;
                    }
                    
                   
              
                }
                
                
                
                
            }
            
            //flag=129;
            if(flag==129){
                
                timer2.stop();
                timer.stop();
                timer3.stop();
                
                
                this.setVisible(false);
                new congratulations().setVisible(true);
                
                
             
                Score sr = new Score(Play.p1name,"PC",Play.p1name,duration1);
        
              
                StudentDaoImpl sdi = new StudentDaoImpl();
                
                sdi.insert(sr);
                
                List<Score> scrList = new ArrayList<Score>();
                
                scrList = sdi.selectAll();
                
                for (Score sr1: scrList) {
                    
                    System.out.println(sr1.getTimeStamp() + " " + sr1.getWinner());
                    
                }
            
            }
            

    }
    
    
    //Movement of enemy's pawn
    
    
    private void GutiMove2() {
        
        
            flag2++;
            
            System.out.println(flag2);

            if ((flag2 > 0 && flag2 <= 12) || (flag2 > 25 && flag2 <= 38) || (flag2 > 51 && flag2 <= 64) || (flag2 > 77 && flag2 <= 90) || (flag2 > 103 && flag2 <= 116)) {
                
                
                
                
                if (flag2 == 26 || flag2 == 52 || flag2 == 78 || flag2 == 104){
                    
                    guti2.move(guti2.getX(),b2);
                    
                }
                
                else{
                        guti2.move(guti2.getX() + 85, b2);
                    }
                
                
                if (flag2 == 12 || flag2 == 38 || flag2 == 64|| flag2 == 90 || flag2 == 116) {
                    
                    
                    if((i2==n2-1) && (circus==90 || circus==64 || car==12)){
                        
                        if(flag2==circus || flag2==car)
                        b2=guti2.getY();
                        else
                        b2 = guti2.getY() - 65;
                    }
                    else
                    b2 = guti2.getY() - 65;
                }
                
                if(i2==n2-1){
                
                    if(flag2==joker){
                         b2=guti2.getY()-65*2;
                         guti2.move(guti2.getX()+85,b2);
                         music(2);
                         if(joker==2)
			    flag2=29;
			 else if(joker==100)
			    flag2=125;
			 else if(joker==19)
			    flag2=44;
                         }
                    else if(flag2==dog){
                         b2=guti2.getY()-65;
                         guti2.move(guti2.getX()-85,b2);
                         music(5);
                         if(dog==5)
			    flag2=21;
			 else if(dog==37)
			    flag2=41;
			 else if(dog==115)
			    flag2=119;
                         }
                    else if(flag2==boat){
                         b2=guti2.getY()-65;
                         guti2.move(guti2.getX()+85*2,b2);
                         music(10);
                         if(boat==10)
			    flag2=13;
			 else if(boat==78)
			    flag2=101;
			 else if(boat==71)
			    flag2=86;
                    }
                    else if(flag2==fish){
                        b2=guti2.getY()-65;
                         guti2.move(guti2.getX(),b2);
                         music(37);
                         if(fish==37)
			    flag2=40;
			 else if(fish==67)
			    flag2=88;
			 else if(fish==22)
			    flag2=29;
                    }
                    else if(flag2==seesaw){
                         b2=guti2.getY()-65*2;
                         guti2.move(guti2.getX()-85,b2);
                         music(55);
                         if(seesaw==55)
			    flag2=80;
		 	 else if(seesaw==61)
			    flag2=86;
			 else if(seesaw==62)
			    flag2=87;
                    }
                    else if(flag2==flower){
                         b2=guti2.getY()-65*3;
                         guti2.move(guti2.getX(),b2);
                         music(60);
                         if(flower==60)
			    flag2=95;
			 else if(flower==4)
			    flag2=47;
                   }
                    else if(flag2==tree){
                         b2=guti2.getY()-65*2;
                         guti2.move(guti2.getX()-85,b2);
                         music(85);
                         if(tree==85)
			    flag2=110;
			 else if(tree==92)
			    flag2=119;
			 else if(tree==24){
                         flag2=51;
                         b2=guti2.getY()-65;
                         }
                    }
                    else if(flag2==bfly){
                         b2=guti2.getY()-65*2;
                         guti2.move(guti2.getX()+85*2,b2);
                         music(87);
                         if(bfly==87)
			    flag2=115;
			 else if(bfly==97)
			    flag2=121;
			 else if(bfly==99)
			    flag2=124;
                    }
                    else if(flag2==circus){
                         b2=guti2.getY()-65*3;
                         guti2.move(guti2.getX(),b2);
                         music(90);
                         if(circus==90)
			    flag2=117;
			 else if(circus==64)
			    flag2=91;
			 else if(circus==13){
                         flag2=64;
                         b2=guti2.getY()-65;
                         }
			    
                    }
                    
                    else if(flag2==car){
                    	guti2.move(guti2.getX()-85*2,b2);
                    	music(8);
                    	if(car==8)
			    flag2=6;
			else if(car==12)
			    flag2=10;
			else if(car==61)
			    flag2=59;
                    }
                    
                    else if(flag2==slide){
                    	b2=guti2.getY()+2*65;    
                    	guti2.move(guti2.getX()+85,b2);
                    	music(26);
                    	if(slide==26)
			    flag2=1;
			else if(slide==84)
			    flag2=59;
			else if(slide==34)
			    flag2=9;
                    }
                 
                    else if(flag2==frog){
                    	guti2.move(guti2.getX()-85,guti2.getY());
                    	music(32);
                    	if(frog==32)
			    flag2=31;
			else if(frog==2)
			    flag2=1;
			else if(frog==110)
			    flag2=109;
                    }
                    else if(flag2==cat){
                    	b2=guti2.getY()+65;
                    	guti2.move(guti2.getX()+85,b2);
                    	music(53);
                    	if(cat==53)
			    flag2=49;
			else if(cat==128)
			    flag2=106;
			else if(cat==15)
			    flag2=11;
                    }
                    else if(flag2==sack){
                    	b2=guti2.getY()+65;
                    	guti2.move(guti2.getX()+85,b2);
                    	music(44);
                    	if(sack==82)
			    flag2=72;
			else if(sack==34)
			    flag2=16;
			else if(sack==77)
			    flag2=53;
                    }
                    else if(flag2==goat){
                    	b2=guti2.getY()+65*2;
                    	guti2.move(guti2.getX()+85,b2);
                    	music(89);
                    	if(goat==89){
                        flag2=64;
                        b2=guti2.getY()-65;
                        }                   	    
			else if(goat==76)
                    	    flag2=49;
			else if(goat==92)
                    	    flag2=65;
                    }
                    else if(flag2==curt){
                    	b2=guti2.getY()+65;
                    	guti2.move(guti2.getX()-85,b2);
                    	music(109);
                    	if(curt==109)
			    flag2=99;
			else if(curt==44)
			    flag2=32;
			else if(curt==55)
			    flag2=49;
                    }
                    else if(flag2==ball){
                    	b2=guti2.getY()+65*2;
                    	guti2.move(guti2.getX(),b2);
                    	music(42);
                    	if(ball==42)
			    flag2=16;
			else if(ball==89)
			    flag2=63;
			else if(ball==100)
			    flag2=74;
                    }
                    else if(flag2==bunny){
                    	guti2.move(guti2.getX()+85,guti2.getY());
                    	music(44);
                    	if(bunny==44)
			    flag2=43;
			else if(bunny==6)
			    flag2=7;
			else if(bunny==94)
			    flag2=93;
                    }
                    else if(flag2==bird){
                    	b2=guti2.getY()+65*2;
                    	guti2.move(guti2.getX()-85*2,b2);
                    	music(71);
                    	if(bird==71)
			    flag2=47;
			else if(bird==99)
			    flag2=75;
			else if(bird==121)
			    flag2=97;
                    }
                    else if(flag2==bucket){
                    	b2=guti2.getY()+65*2;
                    	guti2.move(guti2.getX()-85,b2);
                    	music(102);
                    	if(bucket==102){
                        flag2=77;
                        b2=guti2.getY()-65;
                        }			    
			else if(bucket==120)
			    flag2=95;
			else if(bucket==127)
			    flag2=102;
                    }
                    else if(flag2==apple){
                    	b2=guti2.getY()+65;
                    	guti2.move(guti2.getX()+85*2,b2);
                    	music(122);
                    	if(apple==122)
			    flag2=113;
			else if(apple==26)
			    flag2=23;
			else if(apple==73)
			    flag2=58;
                    }
                    else if(flag2==dive){
                    	b2=guti2.getY()+65;
                    	guti2.move(guti2.getX()+85,b2);
                    	music(127);
                    	if(dive==127)
			    flag2=107;
			else if(dive==73)
			    flag2=57;
			else if(dive==41)
			    flag2=37;
                    }
                 
                }
                 
                 
                            
            }
            
            
            
            else if ((flag2 > 12 && flag2 <= 25) || (flag2 > 38 && flag2 <= 51) || (flag2 > 64 && flag2 <= 77) || (flag2 > 90 && flag2 <= 103) || (flag2 > 116 && flag2 <= 129)) {
                
               
                
                if (flag2 == 13 || flag2 == 39 || flag2 == 65 || flag2 == 91 || flag2 == 117){
                    guti2.move(guti2.getX(),b2);   
                }
                
                else{
                guti2.move(guti2.getX() - 85, b2);
                }
                
                if (flag2 == 25 || flag2 == 51 || flag2 == 77 || flag2 == 103 || flag2 == 129) {
                    
                    if((i2==n2-1) && (sack==77)){
                    if(flag2==sack)    
                    b2=guti2.getY();
                    else
                    b2 = guti2.getY() - 65;
                    }
                    else
                    b2 = guti2.getY() - 65;
                }
                
                if(i2==n2-1){
                    
                    if(flag2==joker){
                         b2=guti2.getY()-65*2;
                         guti2.move(guti2.getX()+85,b2);
                         music(2);
                         if(joker==2)
			    flag2=29;
			 else if(joker==100)
			    flag2=125;
			 else if(joker==19)
			    flag2=44;
                         }
                    else if(flag2==dog){
                         b2=guti2.getY()-65;
                         guti2.move(guti2.getX()-85,b2);
                         music(5);
                         if(dog==5)
			    flag2=21;
			 else if(dog==37)
			    flag2=41;
			 else if(dog==115)
			    flag2=119;
                         }
                    else if(flag2==boat){
                         b2=guti2.getY()-65;
                         guti2.move(guti2.getX()+85*2,b2);
                         music(10);
                         if(boat==10)
			    flag2=13;
			 else if(boat==78)
			    flag2=101;
			 else if(boat==71)
			    flag2=86;
                    }
                    else if(flag2==fish){
                        b2=guti2.getY()-65;
                         guti2.move(guti2.getX(),b2);
                         music(37);
                         if(fish==37)
			    flag2=40;
			 else if(fish==67)
			    flag2=88;
			 else if(fish==22)
			    flag2=29;
                    }
                    else if(flag2==seesaw){
                         b2=guti2.getY()-65*2;
                         guti2.move(guti2.getX()-85,b2);
                         music(55);
                         if(seesaw==55)
			    flag2=80;
		 	 else if(seesaw==61)
			    flag2=86;
			 else if(seesaw==62)
			    flag2=87;
                    }
                    else if(flag2==flower){
                         b2=guti2.getY()-65*3;
                         guti2.move(guti2.getX(),b2);
                         music(60);
                         if(flower==60)
			    flag2=95;
			 else if(flower==4)
			    flag2=47;
                   }
                    else if(flag2==tree){
                         b2=guti2.getY()-65*2;
                         guti2.move(guti2.getX()-85,b2);
                         music(85);
                         if(tree==85)
			    flag2=110;
			 else if(tree==92)
			    flag2=119;
			 else if(tree==24){
                         flag2=51;
                         b2=guti2.getY()-65;
                         }			    
                    }
                    else if(flag2==bfly){
                         b2=guti2.getY()-65*2;
                         guti2.move(guti2.getX()+85*2,b2);
                         music(87);
                         if(bfly==87)
			    flag2=115;
			 else if(bfly==97)
			    flag2=121;
			 else if(bfly==99)
			    flag2=124;
                    }
                    else if(flag2==circus){
                         b2=guti2.getY()-65*3;
                         guti2.move(guti2.getX(),b2);
                         music(90);
                         if(circus==90)
			    flag2=117;
			 else if(circus==64)
			    flag2=91;
			 else if(circus==13){
                         flag2=64;
                         b2=guti2.getY()-65;
                         }
			    
                    }
                    
                    else if(flag2==car){
                    	guti2.move(guti2.getX()-85*2,b2);
                    	music(8);
                    	if(car==8)
			    flag2=6;
			else if(car==12)
			    flag2=10;
			else if(car==61)
			    flag2=59;
                    }
                    
                    else if(flag2==slide){
                    	b2=guti2.getY()+2*65;    
                    	guti2.move(guti2.getX()+85,b2);
                    	music(26);
                    	if(slide==26)
			    flag2=1;
			else if(slide==84)
			    flag2=59;
			else if(slide==34)
			    flag2=9;
                    }
                 
                    else if(flag2==frog){
                    	guti2.move(guti2.getX()-85,guti2.getY());
                    	music(32);
                    	if(frog==32)
			    flag2=31;
			else if(frog==2)
			    flag2=1;
			else if(frog==110)
			    flag2=109;
                    }
                    else if(flag2==cat){
                    	b2=guti2.getY()+65;
                    	guti2.move(guti2.getX()+85,b2);
                    	music(53);
                    	if(cat==53)
			    flag2=49;
			else if(cat==128)
			    flag2=106;
			else if(cat==15)
			    flag2=11;
                    }
                    else if(flag2==sack){
                    	b2=guti2.getY()+65;
                    	guti2.move(guti2.getX()+85,b2);
                    	music(44);
                    	if(sack==82)
			    flag2=72;
			else if(sack==34)
			    flag2=16;
			else if(sack==77)
			    flag2=53;
                    }
                    else if(flag2==goat){
                    	b2=guti2.getY()+65*2;
                    	guti2.move(guti2.getX()+85,b2);
                    	music(89);
                    	if(goat==89){
                         flag2=64;
                         b2=guti2.getY()-65;
                        }                   	   
			else if(goat==76)
                    	    flag2=49;
			else if(goat==92)
                    	    flag2=65;
                    }
                    else if(flag2==curt){
                    	b2=guti2.getY()+65;
                    	guti2.move(guti2.getX()-85,b2);
                    	music(109);
                    	if(curt==109)
			    flag2=99;
			else if(curt==44)
			    flag2=32;
			else if(curt==55)
			    flag2=49;
                    }
                    else if(flag2==ball){
                    	b2=guti2.getY()+65*2;
                    	guti2.move(guti2.getX(),b2);
                    	music(42);
                    	if(ball==42)
			    flag2=16;
			else if(ball==89)
			    flag2=63;
			else if(ball==100)
			    flag2=74;
                    }
                    else if(flag2==bunny){
                    	guti2.move(guti2.getX()+85,guti2.getY());
                    	music(44);
                    	if(bunny==44)
			    flag2=43;
			else if(bunny==6)
			    flag2=7;
			else if(bunny==94)
			    flag2=93;
                    }
                    else if(flag2==bird){
                    	b2=guti2.getY()+65*2;
                    	guti2.move(guti2.getX()-85*2,b2);
                    	music(71);
                    	if(bird==71)
			    flag2=47;
			else if(bird==99)
			    flag2=75;
			else if(bird==121)
			    flag2=97;
                    }
                    else if(flag2==bucket){
                    	b2=guti2.getY()+65*2;
                    	guti2.move(guti2.getX()-85,b2);
                    	music(102);
                    	if(bucket==102){
                        flag2=77;
                        b2=guti2.getY()-65;
                        }			    
			else if(bucket==120)
			    flag2=95;
			else if(bucket==127)
			    flag2=102;
                    }
                    else if(flag2==apple){
                    	b2=guti2.getY()+65;
                    	guti2.move(guti2.getX()+85*2,b2);
                    	music(122);
                    	if(apple==122)
			    flag2=113;
			else if(apple==26)
			    flag2=23;
			else if(apple==73)
			    flag2=58;
                    }
                    else if(flag2==dive){
                    	b2=guti2.getY()+65;
                    	guti2.move(guti2.getX()+85,b2);
                    	music(127);
                    	if(dive==127)
			    flag2=107;
			else if(dive==73)
			    flag2=57;
			else if(dive==41)
			    flag2=37;
                    }
                    
              
                }
                
                
                
                
            }
           
            
            
            if(flag2==129){
                
                timer2.stop();
                timer.stop();
                timer3.stop();
                
                
                this.setVisible(false);
                new GameOver().setVisible(true);
                
                
             
                Score sr = new Score(Play.p1name,"PC","PC",duration1);
        
              
                StudentDaoImpl sdi = new StudentDaoImpl();
                
                sdi.insert(sr);
                List<Score> scrList = new ArrayList<Score>();
                
                scrList = sdi.selectAll();
                
                for (Score sr1: scrList) {
                    
                    System.out.println(sr1.getTimeStamp() + " " + sr1.getWinner());
                    
                }
            
            }
            

    }
    
    
    
    //For playing Music
    
    public static void music(int x) 
    {       
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;

        //ContinuousAudioDataStream loop = null;

        try
        {
            
            String mus=null;
            
            if(x==2){
            mus="C:\\SSound\\2.wav";
            }
            else if(x==5){
            mus="C:\\SSound\\5.wav";
            }
            else if(x==8){
            mus="C:\\SSound\\8.wav";
            }
            else if(x==10){
            mus="C:\\SSound\\10.wav";
            }
            else if(x==26){
            mus="C:\\SSound\\26.wav";
            }
            else if(x==32){
            mus="C:\\SSound\\32.wav";
            }
            else if(x==37){
            mus="C:\\SSound\\37.wav";
            }
           
            else if(x==42){
            mus="C:\\SSound\\42.wav";
            }
            else if(x==44){
            mus="C:\\SSound\\44.wav";
            }
            else if(x==53){
            mus="C:\\SSound\\53.wav";
            }
            
             else if(x==55){
            mus="C:\\SSound\\55.wav";
            }
            else if(x==60){
            mus="C:\\SSound\\60.wav";
            }
            
            else if(x==71){
            mus="C:\\SSound\\71.wav";
            }
            
            else if(x==82){
            mus="C:\\SSound\\44.wav";
            }
            
            else if(x==85){
            mus="C:\\SSound\\85.wav";
            }
            
            else if(x==87){
            mus="C:\\SSound\\87.wav";
            }
            
            else if(x==89){
            mus="C:\\SSound\\89.wav";
            }
             
            else if(x==90){
            mus="C:\\SSound\\90.wav";
            }
            
            else if(x==102){
            mus="C:\\SSound\\102.wav";
            }
            
            else if(x==109){
            mus="C:\\SSound\\109.wav";
            }
            
            else if(x==122){
            mus="C:\\SSound\\122.wav";
            }
            
            else if(x==127){
            mus="C:\\SSound\\127.wav";
            }
            
            else if(x==200){
            mus="C:\\SSound\\Roll.wav";
            }
            
            else if(x==369){
            mus="C:\\SSound\\yourturn.wav";
            }
            
            else if(x==396){
            mus="C:\\SSound\\myturn.wav";
            }
            
            InputStream test = new FileInputStream(mus);
            BGM = new AudioStream(test);
            AudioPlayer.player.start(BGM);
            
            //MD = BGM.getData();
            //loop = new ContinuousAudioDataStream(MD);

        }
        catch(FileNotFoundException e){
            System.out.print(e.toString());
        }
        catch(IOException error)
        {
            System.out.print(error.toString());
        }
        //MGP.start(loop);
    }
    
    
    
    
    public void MoveGuti(int x,int y){
    
    guti.move(x, y);
    
    }
    
    public int XGuti(){
    
    
    return guti.getX();
    
    }
    
    public int YGuti(){
    
    return guti.getY();
    
    
    }
    
    
    //Timer to move player's pawn
    
    private void moveit(){
        
                 
            timer = new Timer(600,new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent e){
                
                GutiMove();
                i++;
                if(i==n){
                    
                   timer.stop();
                
                   jTextField1.setText(String.valueOf(flag));
                   
                   turnE();
                   timer3.start();
                
                }
            }               
        });
            
         
    }
    
    //Timer to move the Roller
    
    private void moveit2(){
        
                jButton2.setEnabled(false);
                timer = new Timer(1000,new ActionListener(){  
                @Override
                public void actionPerformed(ActionEvent e){
                MoveShow();
                q++;
                if(q==z){
                timer.stop();
                DiceNum.setText(String.valueOf(n));
                i=0;
                
                if(flag+n>129){
                
                turnE();
                timer3.start();
                
                
                }
                else{
                
                    
                moveit();
                timer.start();
                
                }
                
                }
            }               
        });
    
    }
    
    
    //Timer to move the emeny's pawn
    
    private void moveitpc(){
        
        
        
                 
            timer = new Timer(600,new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent e){
                
                
                GutiMove2();
                i2++;
                if(i2==n2){
                jTextField2.setText(String.valueOf(flag2));    
                timer.stop();
                jLabel8.setVisible(true);
                jLabel9.setVisible(false);
                jButton2.setEnabled(true);
                turnP();
                timer3.start();
                }
            }               
        });
           
         
    }
    
    
    //Movement logic for Roller
    
    private void MoveShow(){
    
     Icon ic=null;
        
    if(q==0){    
     ic=new ImageIcon(getClass().getResource("/1.png"));
    }
    else if(q==1){  
     ic=new ImageIcon(getClass().getResource("/4.png"));
    }
     else if(q==2){  
     ic=new ImageIcon(getClass().getResource("/2.png"));  
    }
     else if(q==3){  
     ic=new ImageIcon(getClass().getResource("/5.png"));  
    }
     else if(q==4){  
     ic=new ImageIcon(getClass().getResource("/3.png"));  
    }
     else if(q==5){  
     ic=new ImageIcon(getClass().getResource("/6.png"));  
    }
    
    jLabel3.setIcon(ic);
    
    
    if(n==1){
    z=0+1;
    }
    else if(n==2){
    z=2+1;
    }
    else if(n==3){
    z=4+1;
    }
    else if(n==4){
    z=1+1;
    }
    else if(n==5){
    z=3+1;
    }
    else if(n==6){
    z=5+1;
    }
    
    
    }
    
    
    //Duration Counting
    
    private static void durations(){
     timer2 = new Timer(1000,new ActionListener(){  
                @Override
                public void actionPerformed(ActionEvent e){   
                    duration1++;
                    System.out.println(duration1);
            }               
        });
    }
    
    
    //For PLayer's turn animation
    
    private void turnP(){
    
     turn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yturn1.png")));
     turn.setLocation(0,turn.getY());
     turn.setVisible(true);
     music(369);
     timer3 = new Timer(40,new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent e){
                
                turn.move(turn.getX()+10,turn.getY());
                if(turn.getX()==1300){
                timer3.stop();
                turn.setVisible(false);
                }
     
            }               
        });
    }
    
    
    //For enemy's turn animation
    
    private void turnE(){
     turn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eturn2.png")));
     turn.setLocation(0,turn.getY());
     turn.setVisible(true);
     music(396);
     timer3 = new Timer(40,new ActionListener(){  
            @Override
            public void actionPerformed(ActionEvent e){
                turn.move(turn.getX()+10,turn.getY());
                if(turn.getX()==1300){
                timer3.stop();
                turn.setVisible(false);
                Random rand = new Random();
                   n2 = rand.nextInt(6) + 1;
                   DiceNum.setText(String.valueOf(n2));
                   System.out.println(n2+"\n");
                   i2=0;
                   music(200);
                   jLabel8.setVisible(false);
                   jLabel9.setVisible(true);
                   
                   if(flag2+n2>129){
                   
                       jButton2.setEnabled(true);
                        turnP();
                        timer3.start();
                   
                   }
                   else{
                   moveitpc();
                   timer.start();
                   
                   }
                   
                   
                }
            }               
        });
    }
    
    
    //For different boards
    
    private void boardChange(){
    
        int x;
        
        Random rand = new Random();
        x = rand.nextInt(3) + 1;
        
        //System.out.println("Board No-->"+x);
        
        if(x==1){
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/final.jpg")));    
        joker=2;dog=5;car=8;boat=10;slide=26;frog=32;fish=37;ball=42;bunny=44;cat=53;seesaw=55;flower=60;bird=71;sack=82;tree=85;bfly=87;goat=89;circus=90;curt=109;bucket=102;apple=122;dive=127;
        }
        else if(x==2){
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/final2.png")));    
        joker=100;dog=37;car=12;boat=78;slide=84;frog=2;fish=67;ball=89;bunny=6;cat=128;seesaw=61;flower=4;bird=99;sack=34;tree=92;bfly=97;goat=76;circus=64;curt=44;bucket=120;apple=26;dive=73;
        }
        else if(x==3){
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/final3.png")));    
        joker=19;dog=115;car=61;boat=71;slide=34;frog=110;fish=22;ball=100;bunny=94;cat=15;seesaw=62;flower=4;bird=121;sack=77;tree=24;bfly=99;goat=92;circus=13;curt=55;bucket=127;apple=73;dive=41;
        }
  
    
    }
    
    //For Choosing Avatar
    public void avatar(String av){
    
        if("joker".equals(av)){
            
            guti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/joker2.png")));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/joker3.png")));
            
        
        }
        else if("diablo".equals(av)){
            
            guti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diablo2.png")));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diablo3.png")));
        
        }
        else if("dead".equals(av)){
            
            guti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dead2.png")));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dead3.png")));
        
        }
        else if("mili".equals(av)){
        
            guti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mili2.png")));
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mili3.png")));
        
        }
    
    
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guti = new javax.swing.JButton();
        guti2 = new javax.swing.JButton();
        turn = new javax.swing.JButton();
        DiceNum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        guti.setBackground(new java.awt.Color(102, 255, 255));
        guti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g11.png"))); // NOI18N
        guti.setMaximumSize(new java.awt.Dimension(32, 32));
        guti.setMinimumSize(new java.awt.Dimension(32, 32));
        guti.setPreferredSize(new java.awt.Dimension(32, 32));
        guti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gutiMouseClicked(evt);
            }
        });
        guti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gutiActionPerformed(evt);
            }
        });
        guti.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                gutiPropertyChange(evt);
            }
        });
        getContentPane().add(guti);
        guti.setBounds(10, 616, 50, 50);

        guti2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g22.png"))); // NOI18N
        getContentPane().add(guti2);
        guti2.setBounds(10, 620, 60, 40);

        turn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yturn1.png"))); // NOI18N
        getContentPane().add(turn);
        turn.setBounds(0, 140, 1141, 390);

        DiceNum.setBackground(new java.awt.Color(255, 255, 153));
        DiceNum.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        DiceNum.setForeground(new java.awt.Color(51, 0, 102));
        DiceNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiceNumActionPerformed(evt);
            }
        });
        getContentPane().add(DiceNum);
        DiceNum.setBounds(1200, 270, 80, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/final.jpg"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 373));
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 373));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 693);

        jButton2.setFont(new java.awt.Font("Trajan Pro", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1180, 190, 110, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finger4.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1110, 350, 90, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finger4.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1110, 450, 100, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1469809190134.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(160, 160));
        jLabel3.setMinimumSize(new java.awt.Dimension(160, 160));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(160, 160));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1150, 10, 160, 150);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me.jpg"))); // NOI18N
        getContentPane().add(jButton3);
        jButton3.setBounds(1110, 350, 100, 60);

        jTextField1.setBackground(new java.awt.Color(255, 255, 153));
        jTextField1.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 0, 51));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(1290, 360, 70, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g1.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1220, 350, 60, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1110, 450, 100, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g2.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1220, 450, 60, 60);

        jTextField2.setBackground(new java.awt.Color(255, 255, 153));
        jTextField2.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(1290, 460, 70, 40);

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bk.png"))); // NOI18N
        backbtn.setText("jButton1");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn);
        backbtn.setBounds(1150, 570, 160, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wood.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1100, 0, 270, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gutiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gutiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gutiActionPerformed

    private void gutiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_gutiPropertyChange

    }//GEN-LAST:event_gutiPropertyChange

    private void gutiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gutiMouseClicked

    }//GEN-LAST:event_gutiMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
     
        
    }//GEN-LAST:event_jButton2MouseClicked

    //The Roll Button
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           
       Random rand = new Random();

       n = rand.nextInt(6) + 1;

       System.out.println(n+"\n");
        
       q=0;
       
       music(200);
       
       moveit2();
        
       timer.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DiceNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiceNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiceNumActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here: 
        this.setVisible(false);
        new MainMenu().setVisible(true);
        
    }//GEN-LAST:event_backbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DiceNum;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton guti;
    private javax.swing.JButton guti2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton turn;
    // End of variables declaration//GEN-END:variables

    private void guti1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
