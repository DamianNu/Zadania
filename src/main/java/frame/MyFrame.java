package frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        super( "World" );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800);
        setLocation(50,50);
        setLayout(new GridLayout(2, 6));

//        JButton jButton1 = new JButton("Walka");
//        JButton jButton2 = new JButton("Walka2");
//        JButton jButton3 = new JButton("Walka3");
//        jButton1.setBounds(50,50,100, 40);
//        jButton2.setBounds(50,50,100, 40);
//        jButton3.setBounds(50,50,100, 40);

//        add(jButton1);
//        add(jButton2);
//        add(jButton3);
//
//        jButton1.setBounds(50,50,100, 100);
        for(int i=0; i<10; i++)
            add(new JButton(""+(i+1)));


        setVisible(true);
    }

}