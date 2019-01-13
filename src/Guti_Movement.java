/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EZIO
 */
public class Guti_Movement extends Frame1{
   
    
     int flag=0;
     int count1=0;
    int b=YGuti();
    
    public Guti_Movement(){
    
         //b=YGuti();
        
         
    }
    
    
    
    public void New(int n){
    
     for(int i=0;i<n;i++){
          
              flag++;
          
              System.out.println(flag);
          
              if(count1%2==0){
              
                  
               MoveGuti(XGuti()+85,b);
                  
               
              
              
              }
              else{
              
              
              MoveGuti(XGuti()-85,b);
              
              
              
              }
              if (flag == 12 || flag == 38 || flag == 64 || flag == 90 || flag == 116 || flag == 25 || flag == 51 || flag == 77 || flag == 103 || flag == 129) {
                    b = YGuti() - 65;
                    count1++;
                    MoveGuti(XGuti(),b);
                    flag++;
                    i++;
                    //continue;
                }
          
          
          }
    
    
    
    
    
    
    }
    
   
    
}
