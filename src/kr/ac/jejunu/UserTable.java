package kr.ac.jejunu;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UserTable implements ActionListener {


    UserMenuViewer userMenuViewer_1;
    UserMenuViewer userMenuViewer_2;
    UserMenuViewer userMenuViewer_3;
    UserMenuViewer userMenuViewer_4;
    UserMenuViewer userMenuViewer_5;
    UserMenuViewer userMenuViewer_6;


    JFrame frame;

    JPanel panel;

    JButton table_num1,table_num2,table_num3,table_num4,table_num5,table_num6;

    UserTable(){


        frame = new JFrame("테이블");

        panel = new JPanel();

        userMenuViewer_1 = new UserMenuViewer();
        table_num1 = new JButton("1번테이블");
        table_num2 = new JButton("2번테이블");
        table_num3 = new JButton("3번테이블");
        table_num4 = new JButton("4번테이블");
        table_num5 = new JButton("5번테이블");
        table_num6 = new JButton("6번테이블");
    }

    public void UserTableViewerBox(){

        frame.setLayout(null);
        frame.setSize(1030,470);

        table_num1.setBounds(30,30,150,50);
        frame.add(table_num1);
        table_num1.setActionCommand("table_num1");
        table_num1.addActionListener(this);

        table_num2.setBounds(190,30,150,50);
        frame.add(table_num2);
        table_num2.setActionCommand("table_num2");
        table_num2.addActionListener(this);

        table_num3.setBounds(350,30,150,50);
        frame.add(table_num3);
        table_num3.setActionCommand("table_num3");
        table_num3.addActionListener(this);

        table_num4.setBounds(510,30,150,50);
        frame.add(table_num4);
        table_num4.setActionCommand("table_num4");
        table_num4.addActionListener(this);

        table_num5.setBounds(670,30,150,50);
        frame.add(table_num5);
        table_num5.setActionCommand("table_num5");
        table_num5.addActionListener(this);

        table_num6.setBounds(830,30,150,50);
        frame.add(table_num6);
        table_num6.setActionCommand("table_num6");
        table_num6.addActionListener(this);

        panel.setBounds(10,10,990,400);
        panel.setBorder(new TitledBorder(null, "메뉴"));
        frame.add(panel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        switch (e.getActionCommand()){
            case "table_num1":
                userMenuViewer_1.tableNumber.setText("1");
                userMenuViewer_1.UserVisible();
            case "table_num2":
                userMenuViewer_2.tableNumber.setText("2");
                userMenuViewer_2.UserVisible();
            case "table_num3":
                userMenuViewer_3.tableNumber.setText("3");
                userMenuViewer_3.UserVisible();
            case "table_num4":
                userMenuViewer_4.tableNumber.setText("4");
                userMenuViewer_4.UserVisible();
            case "table_num5":
                userMenuViewer_5.tableNumber.setText("5");
                userMenuViewer_5.UserVisible();
            case "table_num6":
                userMenuViewer_6.tableNumber.setText("6");
                userMenuViewer_6.UserVisible();


        }
     }

}
