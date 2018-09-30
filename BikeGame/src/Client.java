import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class Client  extends JFrame implements ActionListener,KeyListener {
    private String ipAddress;

    private  JFrame f;
    private ImageIcon road;
    private JLabel background;
    private ImageIcon bike;
    private JLabel bikepic;
    private ImageIcon bike1;
    private JLabel bikepic1;
    private ImageIcon coin;
    private JLabel coinpic;
    private JLabel coinpic1;
    private JLabel coinpic2;
    private JLabel coinpic3;
    private JLabel coinpic4;
    private JLabel coinpic5;
    private JLabel coinpic6;
    private JLabel coinpic7;

    private JLabel score1;
    private JLabel score2;
    private int point1 = 450;
    private int point2= 450;

    private ImageIcon green;
    private JLabel bgreen;
    private ImageIcon green2;
    private JLabel bgreen2;
    private ImageIcon water;
    private JLabel bwater;
    private ImageIcon water2;
    private JLabel bwater2;

    Timer t;

    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    int cspeed = 10;
    int greeny1=0,greeny2=-680,watery1=0,watery2=-680;

    int x=310,y=450,x1=220,y1=450,x2=260,y2=0,x3=260,y3=-80,x4=200,y4=170,x5=200,y5=90,x6=340,y6=-140,x7=340,y7=-200;
    int x8=260,y8=-260,x9=260,y9=-320;


    public Client(String ipAddress){

        this.ipAddress=ipAddress;

        f = new JFrame("Speed Unleashed Client");
        f.setLayout(null);
        f.setSize(800,700);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);

        score1 =new JLabel();
        f.add(score1);
        score1.setForeground(Color.RED);
        score1.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));
        score1.setBounds(10,20,200,30);

        score2 =new JLabel();
        f.add(score2);
        score2.setForeground(Color.BLACK);
        score2.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));
        score2.setBounds(650,20,200,30);

        bike = new ImageIcon(getClass().getResource("Motorbike 2.png"));
        bikepic = new JLabel(bike);
        f.add(bikepic);
        f.setVisible(true);

        bike1 = new ImageIcon(getClass().getResource("Motorbike 6.png"));
        bikepic1 = new JLabel(bike1);
        f.add(bikepic1);
        f.setVisible(true);

        coin = new ImageIcon(getClass().getResource("coin.png"));
        coinpic = new JLabel(coin);
        f.add(coinpic);
        f.setVisible(true);

        //coin = new ImageIcon(getClass().getResource("coin.png"));
        coinpic1 = new JLabel(coin);
        f.add(coinpic1);
        f.setVisible(true);

        //coin = new ImageIcon(getClass().getResource("coin.png"));
        coinpic2 = new JLabel(coin);
        f.add(coinpic2);
        f.setVisible(true);

        //coin = new ImageIcon(getClass().getResource("coin.png"));
        coinpic3 = new JLabel(coin);
        f.add(coinpic3);
        f.setVisible(true);

        //coin = new ImageIcon(getClass().getResource("coin.png"));
        coinpic4 = new JLabel(coin);
        f.add(coinpic4);
        f.setVisible(true);

        //coin = new ImageIcon(getClass().getResource("coin.png"));
        coinpic5 = new JLabel(coin);
        f.add(coinpic5);
        f.setVisible(true);

        //coin = new ImageIcon(getClass().getResource("coin.png"));
        coinpic6 = new JLabel(coin);
        f.add(coinpic6);
        f.setVisible(true);


        coinpic7 = new JLabel(coin);
        f.add(coinpic7);
        f.setVisible(true);


        green = new ImageIcon(getClass().getResource("green.jpg"));
        bgreen=new JLabel(green);
        f.add(bgreen);
        f.setVisible(true);

        green2 = new ImageIcon(getClass().getResource("green.jpg"));
        bgreen2=new JLabel(green2);
        f.add(bgreen2);
        f.setVisible(true);

        water = new ImageIcon(getClass().getResource("water.jpg"));
        bwater=new JLabel(water);
        f.add(bwater);
        f.setVisible(true);

        water2 = new ImageIcon(getClass().getResource("water.jpg"));
        bwater2=new JLabel(water2);
        f.add(bwater2);
        f.setVisible(true);

        road = new ImageIcon(getClass().getResource("broad.jpg"));
        background=new JLabel(road);
        f.add(background);
        background.setBounds(0,0,800,700);
        f.setVisible(true);
        f.addKeyListener(this);
        t = new Timer(50,this);
        t.start();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        bikepic.setBounds(x,y,250,200);
        bikepic1.setBounds(x1,y1,250,200);
        coinpic.setBounds(x2,y2,250,200);
        coinpic1.setBounds(x3,y3,250,200);
        coinpic2.setBounds(x4,y4,250,200);
        coinpic3.setBounds(x5,y5,250,200);
        coinpic4.setBounds(x6,y6,250,200);
        coinpic5.setBounds(x7,y7,250,200);
        coinpic6.setBounds(x8,y8,250,200);
        coinpic7.setBounds(x9,y9,250,200);


        bgreen.setBounds(310,greeny1,800,700);
        bgreen2.setBounds(310,greeny2,800,700);

        bwater.setBounds(-310,watery1,800,700);
        bwater2.setBounds(-310,watery2,800,700);



        if(y2>600)
        {
            y2=-150;
            coinpic.setVisible(true);
        }
        if(y3>600)
        {
            y3=-150;
            coinpic1.setVisible(true);
        }
        if(y4>600)
        {
            y4=-150;
            coinpic2.setVisible(true);
        }
        if(y5>600)
        {
            y5=-150;
            coinpic3.setVisible(true);
        }
        if(y6>600)
        {
            y6=-150;
            coinpic4.setVisible(true);
        }
        if(y7>600)
        {
            y7=-150;
            coinpic5.setVisible(true);
        }
        if(y8>600)
        {
            y8=-150;
            coinpic6.setVisible(true);
        }
        if(y9>600)
        {
            y9=-150;
            coinpic7.setVisible(true);
        }

        if(greeny1>600)
        {
            greeny1=-680;
        }
        if(greeny2>600)
        {
            greeny2=-680;
        }
        if(watery1>600)
        {
            watery1=-680;
        }
        if(watery2>600)
        {
            watery2=-680;
        }

        watery1+=15;
        watery2+=15;
        greeny1+=15;
        greeny2+=15;
        y2+=cspeed;
        y3+=cspeed;
        y4+=cspeed;
        y5+=cspeed;
        y6+=cspeed;
        y7+=cspeed;
        y8+=cspeed;
        y9+=cspeed;
        if(x1>=250 && x1<=270 && y2==y1-60)
        {
            point2+=5;
            coinpic.setVisible(false);
        }
        if(x1>=250 && x1<=270 && y3==y1-60)
        {
            point2+=5;
            coinpic1.setVisible(false);
        }
        if(x1>=180 && x1<=210 && y4==y1-60)
        {
            point2+=5;
            coinpic2.setVisible(false);
        }
        if(x1>=180 && x1<=210 && y5==y1-60)
        {
            point2+=5;
            coinpic3.setVisible(false);
        }
        if(x1>=330 && x1<=350 && y6==y1-60)
        {
            point2+=5;
            coinpic4.setVisible(false);
        }
        if(x1>=330 && x1<=350 && y7==y1-60)
        {
            point2+=5;
            coinpic5.setVisible(false);
        }
        if(x1>=250 && x1<=270 && y8==y1-60)
        {
            point2+=5;
            coinpic6.setVisible(false);
        }
        if(x1>=250 && x1<=270 && y9==y1-60)
        {
            point2+=5;
            coinpic7.setVisible(false);
        }



        if(x>=250 && x<=270 && y2==y-60)
        {
            point1+=5;
            coinpic.setVisible(false);
        }
        if(x>=250 && x<=270 && y3==y-60)
        {
            point1+=5;
            coinpic1.setVisible(false);
        }
        if(x>=180 && x<=210 && y4==y-60)
        {
            point1+=5;
            coinpic2.setVisible(false);
        }
        if(x>=180 && x<=210 && y5==y-60)
        {
            point1+=5;
            coinpic3.setVisible(false);
        }
        if(x>=330 && x<=350 && y6==y-60)
        {
            point1+=5;
            coinpic4.setVisible(false);
        }
        if(x>=330 && x<=350 && y7==y-60)
        {
            point1+=5;
            coinpic5.setVisible(false);
        }
        if(x>=250 && x<=270 && y8==y-60)
        {
            point1+=5;
            coinpic6.setVisible(false);
        }
        if(x>=250 && x<=270 && y9==y-60)
        {
            point1+=5;
            coinpic7.setVisible(false);
        }

        score1.setText("OPONNENT : "+point1);
        score2.setText("YOU : "+point2);

        if(point1>=500){
            t.stop();
            f.setVisible(false);
            GameOver over=new GameOver();
            over.clientLose();

        }
        if(point2>=500){
            t.stop();
            f.setVisible(false);
            GameOver over=new GameOver();
            over.clientWin();
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int m = e.getKeyCode();
        if(m == KeyEvent.VK_LEFT && x1!=180)
        {
            x1-=10;
            if((x1-x)==40  && x!=180)
            {
                x-=10;

            }
        }
        if(m == KeyEvent.VK_RIGHT && x1!=330 && (x-x1)!=40)
        {
            x1+=10;
            if((x1-x)==-40 && x!=380)
            {
                x+=10;
            }
        }
        if(m == KeyEvent.VK_UP  && y1!=450)
        {
            y1-=10;
        }
        if(m == KeyEvent.VK_DOWN && y1!=500)
        {
            y1+=10;
        }

        out.println(x1);
        out.println(y1);
        out.println(x);
        out.println(y);


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    public void connectPlayer() throws IOException {
        socket = new Socket(ipAddress,8080);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        System.out.println("Player Connected");
        //gameStatus.setText("Connected.Wait for player move!");

        OpponentPlayerMoveHandler client = new OpponentPlayerMoveHandler("server", socket);
        client.start();
    }

    class OpponentPlayerMoveHandler extends Thread {

        private String name;
        private Socket socket;

        public OpponentPlayerMoveHandler(String name, Socket socket) {
            super(name);
            this.name = name;
            this.socket = socket;
        }

        public void run() {
            try {
                while(true) {
                    x = Integer.parseInt(in.readLine());
                    y = Integer.parseInt(in.readLine());
                    x1 = Integer.parseInt(in.readLine());
                    y1 = Integer.parseInt(in.readLine());
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    public void offClient(){
        t.stop();
        f.setVisible(false);
    }


    public static void main(String[] args) throws IOException {

        Client client = new Client("172.17.4.14");

        client.connectPlayer();

    }

}
