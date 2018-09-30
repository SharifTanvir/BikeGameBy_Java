import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener{
    public static JFrame f;
    JButton b1,b2,b3,b4;
    ImageIcon image1;
    JLabel l1;
    public static Music mic;
    public MainWindow(){
        image1 = new ImageIcon(getClass().getResource("bg.jpg"));
        l1 = new JLabel(image1);
        f.add(l1);
        l1.setBounds(0,0,900,800);
        b1 =  new JButton("Start Game");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font(Font.SERIF,Font.BOLD,20));
        b1.setBounds(570,350,150,35);
        b1.addActionListener(this);
        f.add(b1);
        b2 =  new JButton("Settings");
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font(Font.SERIF,Font.BOLD,20));
        b2.setBounds(570,400,150,35);
        b2.addActionListener(this);
        f.add(b2);
        b3 =  new JButton("About");
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font(Font.SERIF,Font.BOLD,20));
        b3.setBounds(570,450,150,35);
        b3.addActionListener(this);
        f.add(b3);
        f.setVisible(true);
        b4 =  new JButton("Exit");
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.BLACK);
        b4.setFont(new Font(Font.SERIF,Font.BOLD,20));
        b4.setBounds(570,500,150,35);
        b4.addActionListener(this);
        f.add(b4);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){

            new SorP();
        }
        else if(e.getSource()== b2){
            SoundAndAbout popup= new SoundAndAbout("Music Settings",mic);

        }
        else if(e.getSource()==b3){
            SoundAndAbout popup= new SoundAndAbout();
        }
        else{
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        f = new JFrame("Window");
        f.setLayout(null);
        f.setSize(900,800);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        new MainWindow();
        mic = new Music();
    }
}
