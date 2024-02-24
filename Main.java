import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame f;
    public static void main(String[] arg){
        Bombs bomb = new Bombs("hard");
        GUI(bomb.gameSize());
    }
    public static void GUI(int axisCoordinates){
        JFrame f=new JFrame();
        for(int i = 1; i <= axisCoordinates * axisCoordinates; i++){
            JButton button = new JButton();
            f.add(button);
        }
        f.setLayout(new GridLayout(axisCoordinates,axisCoordinates));
        f.setSize(300,300);
        f.setVisible(true);
    }
}

