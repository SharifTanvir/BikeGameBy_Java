import sun.audio.AudioPlayer;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.*;

public class SoundAndAbout extends JFrame implements ActionListener {

    private JFrame frame;
    private JButton on;
    private JButton off;
    private JButton ok;
    private ImageIcon abt;
    private JLabel forabt;
    public Music sound;

    public SoundAndAbout(String msg,Music mic){

        sound=mic;
        frame = new JFrame();
        frame.setTitle(msg);
        frame.setLayout(null);
        frame.setBounds(220,270,350,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        on = new JButton("Music ON");
        frame.add(on);
        on.setBackground(Color.WHITE);
        on.setForeground(Color.RED);
        on.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        on.setBounds(50,30,150,35);
        on.addActionListener(this);
        frame.setVisible(true);

        off = new JButton("Music OFF");
        frame.add(off);
        off.setBackground(Color.WHITE);
        off.setForeground(Color.RED);
        off.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        off.setBounds(50,80,150,35);
        off.addActionListener(this);
        frame.setVisible(true);

        ok = new JButton("OK");
        frame.add(ok);
        ok.setBackground(Color.WHITE);
        ok.setForeground(Color.RED);
        ok.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        ok.setBounds(260,120,70,35);
        ok.addActionListener(this);

        abt = new ImageIcon(getClass().getResource("sound.jpg"));
        forabt=new JLabel(abt);
        frame.add(forabt);
        forabt.setBounds(-130,-70,600,300);
        frame.setVisible(true);

        frame.setVisible(true);

    }

    public SoundAndAbout(){
        frame = new JFrame();
        frame.setTitle("ABOUT");
        frame.setLayout(null);
        frame.setBounds(180,270,600,300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);



        ok = new JButton("OK");
        frame.add(ok);
        ok.setBackground(Color.GRAY);
        ok.setForeground(Color.WHITE);
        ok.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        ok.setBounds(510,220,70,35);
        ok.addActionListener(this);
        frame.setVisible(true);

        abt = new ImageIcon(getClass().getResource("about.jpg"));
        forabt=new JLabel(abt);
        frame.add(forabt);
        forabt.setBounds(-20,-30,600,300);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==ok) {
            frame.setVisible(false);
        }
        if(e.getSource()==on){
            sound.startMusic();

        }
        if(e.getSource()==off){
            sound.stopMusic();
        }

    }
    public static void main(String[] args) {
        new SoundAndAbout();
    }
}
