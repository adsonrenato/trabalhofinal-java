
package cinema;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Theads extends Thread implements Runnable{
    
    public ImageIcon img1 = new ImageIcon(getClass().getResource("1.jpg"));
    public ImageIcon img2 = new ImageIcon(getClass().getResource("2.jpg"));
    public ImageIcon img3 = new ImageIcon(getClass().getResource("3.jpg"));
    public ImageIcon img4 = new ImageIcon(getClass().getResource("4.jpg"));
    
    private static ArrayList imageList = new ArrayList(); 

    JLabel l;
    
    public Theads(JLabel l) {
        this.l = l;
        imageList.add(img1);
        imageList.add(img2);
        imageList.add(img3);
        imageList.add(img4);
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