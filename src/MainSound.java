
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EZIO
 */
public class MainSound {
    
    
    static AudioPlayer MGP = AudioPlayer.player;
    static AudioStream BGM=null;
    
    
    public static void music() 
    {       
        
        
        AudioData MD;

        try
        {
             
            InputStream test = new FileInputStream("C:\\SSound\\Menu.wav");
            BGM = new AudioStream(test);
            
            

        }
        catch(FileNotFoundException e){
            System.out.print(e.toString());
        }
        catch(IOException error)
        {
            System.out.print(error.toString());
        }
        
        MGP.start(BGM);
        
    }
    

     public static void stop(){
     
         
        MGP.stop(BGM);
     
     }
     
     public static void main(String args[]) {
         
         music();
         
         
     }
    
    
    
}
