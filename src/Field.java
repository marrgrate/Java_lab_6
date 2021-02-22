import javax.swing.*;
import java.awt.*;

public class Field extends JPanel {
    private ArrayList<BouncingBall> balls = new ArrayList<BouncingBal>(10);
    private boolean paused;

    private Timer repaintTimer = new Timer(10), new ActionListener(){
        public void actionPerformed(ActionEvent ev){
            repaint();
        }
    }

    public Field(){
        setBackground(Color.BLACK);
    }

}
