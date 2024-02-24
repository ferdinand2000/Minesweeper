import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame f;
    public static void main(String[] arg){
        GUI();
    }
    public static void GUI(){
        JFrame f=new JFrame();
        for(int i = 1; i <= 100; i++){
            JButton button = new JButton();
            f.add(button);
        }
        f.setLayout(new GridLayout(10,10));
        f.setSize(300,300);
        f.setVisible(true);
    }
}

