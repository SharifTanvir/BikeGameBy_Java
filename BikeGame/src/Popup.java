import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class Popup extends JFrame implements ActionListener {

    private JFrame popup;
    private JButton ok;
    private JPasswordField tf;
    private JLabel com;
    private JLabel com2;
    private Client client;

    public Popup() {


        popup = new JFrame();
        popup.setTitle("IP Address");
        popup.setLayout(null);
        popup.setBounds(220, 270, 300, 150);
        popup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        com=new JLabel();
        com.setText("Enter your server IP : ");
        popup.add(com);
        com.setForeground(Color.BLACK);
        com.setBounds(30,10,150,30);

        com2=new JLabel();
        popup.add(com2);
        com2.setForeground(Color.BLACK);
        com2.setBounds(30,70,150,30);


        tf= new JPasswordField("");
        tf.setBounds(30,35,150,30);
        popup.add(tf);

        ok = new JButton("OK");
        popup.add(ok);
        ok.setBackground(Color.DARK_GRAY);
        ok.setForeground(Color.RED);
        ok.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        ok.setBounds(200,30, 70, 35);
        ok.addActionListener(this);
        popup.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== ok){
           String s= tf.getText();

            if(s.equals("")) {

                com2.setText(" Warning....!!! ");

            }
            else {
                popup.setVisible(false);
                try {
                    client = new Client(s);
                    client.connectPlayer();
                } catch (IOException e1) {
                    e1.printStackTrace();
                    client.offClient();
                    Popup p = new Popup();
                }
            }
        }

    }
}
