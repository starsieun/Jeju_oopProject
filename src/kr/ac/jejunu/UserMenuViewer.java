package kr.ac.jejunu;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by SeJong on 2017-06-14.
 */
public class UserMenuViewer extends Frame {

    JPanel panel_1,panel_2;

    JFrame frame;

    JLabel label_1,label_2,label_3;
    JLabel menu_1,menu_2,menu_3,menu_4,menu_5,menu_6;
    JButton plus_1,plus_2,plus_3,plus_4,plus_5,plus_6;
    JButton minus_1,minus_2,minus_3,minus_4,minus_5,minus_6;

    JTextField totalNum_1,totalNum_2,totalNum_3,totalNum_4,totalNum_5,totalNum_6;
    JTextField price_1,price_2,price_3,price_4,price_5,price_6;

    JLabel totalPriceName_1,totalPriceName_2;
    JTextField totalPrice;

    TouchCountEvent countEvent;

    int[] count;



    public UserMenuViewer(){

        count = new int[6];

        for(int i =0; i < 6; i++) {
            count[i] = 0;
        }


        panel_1 = new JPanel();
        panel_2 = new JPanel();

        frame = new JFrame("다가미김밥");

        label_1 = new JLabel("음식명");
        label_2 = new JLabel("수량");
        label_3 = new JLabel("가격");

        menu_1 = new JLabel("다가미김밥");
        minus_1 = new JButton("-");
        totalNum_1 = new JTextField("" + count[0]);
        plus_1 = new JButton("+");
        plus_1.setActionCommand("plus_1");
        minus_1.setActionCommand("minus_1");
        price_1 = new JTextField("",100);

        menu_2 = new JLabel("참치로얄김밥");
        minus_2 = new JButton("-");
        totalNum_2 = new JTextField("",2);
        plus_2 = new JButton("+");
        plus_2.setActionCommand("plus_2");
        minus_2.setActionCommand("minus_2");
        price_2 = new JTextField("",100);

        menu_3 = new JLabel("매운멸치쌈");
        minus_3 = new JButton("-");
        totalNum_3 = new JTextField("",2);
        plus_3 = new JButton("+");
        plus_3.setActionCommand("plus_3");
        minus_3.setActionCommand("minus_3");
        price_3 = new JTextField("",100);

        menu_4 = new JLabel("소고기롤");
        minus_4 = new JButton("-");
        totalNum_4 = new JTextField("",2);
        plus_4 = new JButton("+");
        plus_4.setActionCommand("plus_4");
        minus_4.setActionCommand("minus_4");
        price_4 = new JTextField("",100);

        menu_5 = new JLabel("에그샌드위치");
        minus_5 = new JButton("-");
        totalNum_5 = new JTextField("",2);
        plus_5 = new JButton("+");
        plus_5.setActionCommand("plus_5");
        minus_5.setActionCommand("minus_5");
        price_5 = new JTextField("",100);

        menu_6 = new JLabel("탄산음료");
        minus_6 = new JButton("-");
        totalNum_6 = new JTextField("",2);
        plus_6 = new JButton("+");
        plus_6.setActionCommand("plus_6");
        minus_6.setActionCommand("minus_6");
        price_6 = new JTextField("",100);

        totalPriceName_1 = new JLabel("음식의 총 금액은");
        totalPrice = new JTextField("",100);
        totalPriceName_2 = new JLabel("입니다.");

        countEvent = new TouchCountEvent(this);
    }


    public void UserViewerSetBox(){

        frame.setLayout(null);
        frame.setSize(445,470);

        label_1.setBounds(30,30,100,30);
        frame.add(label_1,SwingConstants.CENTER);
        label_2.setBounds(140,30,160,30);
        frame.add(label_2,SwingConstants.CENTER);
        label_3.setBounds(320,30,100,30);
        frame.add(label_3,SwingConstants.CENTER);


        menu_1.setBounds(30,70,100,30);
        frame.add(menu_1,SwingConstants.CENTER);
        menu_2.setBounds(30,110,100,30);
        frame.add(menu_2,SwingConstants.CENTER);
        menu_3.setBounds(30,150,100,30);
        frame.add(menu_3,SwingConstants.CENTER);
        menu_4.setBounds(30,190,100,30);
        frame.add(menu_4,SwingConstants.CENTER);
        menu_5.setBounds(30,230,100,30);
        frame.add(menu_5,SwingConstants.CENTER);
        menu_6.setBounds(30,270,100,30);
        frame.add(menu_6,SwingConstants.CENTER);

        minus_1.setBounds(140,70,50,30);
        frame.add(minus_1);
        minus_2.setBounds(140,110,50,30);
        frame.add(minus_2);
        minus_3.setBounds(140,150,50,30);
        frame.add(minus_3);
        minus_4.setBounds(140,190,50,30);
        frame.add(minus_4);
        minus_5.setBounds(140,230,50,30);
        frame.add(minus_5);
        minus_6.setBounds(140,270,50,30);
        frame.add(minus_6);

        minus_1.addActionListener(countEvent);
        minus_2.addActionListener(countEvent);
        minus_3.addActionListener(countEvent);
        minus_4.addActionListener(countEvent);
        minus_5.addActionListener(countEvent);
        minus_6.addActionListener(countEvent);


        totalNum_1.setBounds(200, 70, 40, 30);
        frame.add(totalNum_1);
        totalNum_2.setBounds(200, 110, 40, 30);
        frame.add(totalNum_2);
        totalNum_3.setBounds(200, 150, 40, 30);
        frame.add(totalNum_3);
        totalNum_4.setBounds(200, 190, 40, 30);
        frame.add(totalNum_4);
        totalNum_5.setBounds(200, 230, 40, 30);
        frame.add(totalNum_5);
        totalNum_6.setBounds(200, 270, 40, 30);
        frame.add(totalNum_6);


        plus_1.setBounds(250,70,50,30);
        frame.add(plus_1);
        plus_2.setBounds(250,110,50,30);
        frame.add(plus_2);
        plus_3.setBounds(250,150,50,30);
        frame.add(plus_3);
        plus_4.setBounds(250,190,50,30);
        frame.add(plus_4);
        plus_5.setBounds(250,230,50,30);
        frame.add(plus_5);
        plus_6.setBounds(250,270,50,30);
        frame.add(plus_6);

        plus_1.addActionListener(countEvent);
        plus_2.addActionListener(countEvent);
        plus_3.addActionListener(countEvent);
        plus_4.addActionListener(countEvent);
        plus_5.addActionListener(countEvent);
        plus_6.addActionListener(countEvent);



        price_1.setBounds(320,70,80,30);
        frame.add(price_1);
        price_2.setBounds(320,110,80,30);
        frame.add(price_2);
        price_3.setBounds(320,150,80,30);
        frame.add(price_3);
        price_4.setBounds(320,190,80,30);
        frame.add(price_4);
        price_5.setBounds(320,230,80,30);
        frame.add(price_5);
        price_6.setBounds(320,270,80,30);
        frame.add(price_6);


        panel_1.setBounds(10,10,410,310);
        panel_1.setBorder(new TitledBorder(null, "메뉴"));
        frame.add(panel_1);

        totalPriceName_1.setBounds(30,350,100,30);
        frame.add(totalPriceName_1);
        totalPrice.setBounds(140,350,100,30);
        frame.add(totalPrice);
        totalPriceName_2.setBounds(250,350,100,30);
        frame.add(totalPriceName_2);

        panel_2.setBounds(10,330,410,70);
        panel_2.setBorder(new TitledBorder(null,"총금액"));
        frame.add(panel_2);




        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}

