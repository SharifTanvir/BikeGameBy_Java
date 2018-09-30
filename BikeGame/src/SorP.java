import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SorP extends JFrame implements ActionListener {
    private JFrame sorp;
    private JButton server;
    private JButton client;
    private JLabel com;

    public SorP() {


        sorp = new JFrame();
        sorp.setTitle("Server Address");
        sorp.setLayout(null);
        sorp.setBounds(220, 270, 300, 150);
        sorp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        com=new JLabel();
        com.setText("Chose your mode : ");
        sorp.add(com);
        com.setForeground(Color.BLACK);
        com.setBounds(90,0,150,30);

        server = new JButton("HOST");
        sorp.add(server);
        server.setBackground(Color.DARK_GRAY);
        server.setForeground(Color.RED);
        server.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        server.setBounds(30,40,100,35);

        server.addActionListener(this);

        client = new JButton("JOIN");
        sorp.add(client);
        client.setBackground(Color.DARK_GRAY);
        client.setForeground(Color.RED);
        client.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        client.setBounds(150,40,100,35);
        client.addActionListener(this);
        sorp.setVisible(true);


    }


        @Override
    public void actionPerformed(ActionEvent e) {

            if(e.getSource()==server){
                try {
                    sorp.setVisible(false);
                    Server server = new Server();
                    server. connectPlayer();


                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if(e.getSource()==client){
                sorp.setVisible(false);
                new Popup();

            }

    }
}
