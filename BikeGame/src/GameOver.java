import java.awt.*;
import javax.swing.*;

public class GameOver {
    private static JFrame over;
    private ImageIcon gOver;
    private JLabel ForgOver;
    private JLabel player1;
    private JLabel player2;

    public GameOver() {

        over = new JFrame("MY GAME");
        over.setLayout(null);
        over.setSize(700, 600);
        over.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        over.setVisible(true);

        player1 =new JLabel();
        over.add(player1);
        //player1.setBackground(Color.BLUE);
        player1.setForeground(Color.RED);
        player1.setFont(new Font(Font.SANS_SERIF, Font.BOLD,30));
        player1.setBounds(230, 400, 350,40);
        over.setVisible(true);
        player2 =new JLabel();
        over.add(player2);
        //player2.setBackground(Color.DARK_GRAY);
        player2.setForeground(Color.RED);
        player2.setFont(new Font(Font.SANS_SERIF, Font.BOLD,30));
        player2.setBounds(230,450, 350,40);
        over.setVisible(true);
        gOver = new ImageIcon(getClass().getResource("gameover.jpg"));
        ForgOver = new JLabel(gOver);
        over.add(ForgOver);
        ForgOver.setBounds(0, 0, 700, 600);
        over.setVisible(true);
    }

    public void serverWin(){
        player1.setText("  YOU WIN");
        player2.setText("OPPONENT LOSE");

    }

    public void serverLose(){
        player1.setText("    YOU LOSE");
        player2.setText("OPPONENT WIN");

    }

    public void clientWin(){
        player1.setText("     YOU WIN");
        player2.setText("OPPONENT LOSE");

    }

    public void clientLose(){
        player1.setText("    YOU LOSE");
        player2.setText("OPPONENT WIN");

    }
}
