
package cinema;

import java.awt.List;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class theads1 extends Thread implements Runnable{
    
    public ImageIcon cat16 = new ImageIcon(getClass().getResource("1.jpg"));
    public ImageIcon cat17 = new ImageIcon(getClass().getResource("2.jpg"));
    
    private static ArrayList imageList = new ArrayList(); 

    JLabel l;
    
    public theads1(JLabel l) {
        this.l = l;
        imageList.add(cat16);
        imageList.add(cat17);
    }
    
    public void run() {
      
        int count = 0;
        while (true) {
            try {
                count = (count+1) % imageList.size();
		Thread.sleep(2000); ///pode ser sleep(numero) 1seg = 1000ms
                l.setIcon((ImageIcon)imageList.get(count));
	    } catch (InterruptedException e) {}
	}
    }    
}