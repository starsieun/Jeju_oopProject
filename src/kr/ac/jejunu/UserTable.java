package kr.ac.jejunu;

import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 * Created by SeJong on 2017-06-14.
 */
public class UserTable {

    JFrame frame;

    JPanel panel;

    JButton table_num1,table_num2,table_num3,table_num4,table_num5,table_num6;

    UserTable(){


        frame = new JFrame("테이블");

        panel = new JPanel();

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
        table_num2.setBounds(190,30,150,50);
        frame.add(table_num2);
        table_num3.setBounds(350,30,150,50);
        frame.add(table_num3);
        table_num4.setBounds(510,30,150,50);
        frame.add(table_num4);
        table_num5.setBounds(670,30,150,50);
        frame.add(table_num5);
        table_num6.setBounds(830,30,150,50);
        frame.add(table_num6);

        panel.setBounds(10,10,990,400);
        panel.setBorder(new TitledBorder(null, "메뉴"));
        frame.add(panel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}