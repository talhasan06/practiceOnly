package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {
    JFrame f;
    JTextField tf1,tf2;
    public Counter(){
        f=new JFrame("Counter");
        f.setLayout(new FlowLayout());
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JLabel("Counter"));
        tf1=new JTextField(10);
        f.add(tf1);
        tf1.setText("123");
        tf2=new JTextField(10);
        f.add(tf2);
        tf2.setText("456");
        JButton b=new JButton("Swap");
        f.add(b);
        b.addActionListener(new SwapAction());
        f.setVisible(true);
    }
    public class SwapAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String temp=tf1.getText();
            tf1.setText(tf2.getText());
            tf2.setText(temp);
        }

    }

    public static void main(String[] args) {
        new Counter();
    }
}

