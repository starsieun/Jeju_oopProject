package kr.ac.jejunu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by SeJong on 2017-06-14.
 */
public class TouchCountEvent implements ActionListener {

    UserMenuViewer userMenuViewer;
    Calculation calculation;

    int menu1_price;
    int totalSum;

    int[] menu_price;

    //int count = 0;

    public TouchCountEvent(UserMenuViewer userMenuViewer){
        this.userMenuViewer = userMenuViewer;
       menu_price = new int[]{
               2500,
               4500,
               4500,
               4500,
               4500,
               4500
        };



    }

    @Override
    public void actionPerformed(ActionEvent e ) {



        switch (e.getActionCommand()){
            case "plus_1":
                userMenuViewer.count[0] ++;
                break;

            case "minus_1":
                minus(0);
                break;
            case "plus_2":
                userMenuViewer.count[1] ++;
                break;

            case "minus_2":
                minus(1);
                break;
            case "plus_3":
                userMenuViewer.count[2] ++;
                break;

            case "minus_3":
                minus(2);
                break;
            case "plus_4":
                userMenuViewer.count[3] ++;
                break;

            case "minus_4":
                minus(3);
                break;
            case "plus_5":
                userMenuViewer.count[4] ++;
                break;

            case "minus_5":
                minus(4);
                break;
            case "plus_6":
                userMenuViewer.count[5] ++;
                break;

            case "minus_6":
                minus(5);
                break;


        }
        menuTotalCalculation();
           /*if (e.getSource() == userMenuViewer.plus_1){
               userMenuViewer.count ++;
                menuOnePrintCount();
                menuCalculation();
               menuTotalCalculation(menu1_sum);

            } else if (e.getSource() == userMenuViewer.minus_1){
           userMenuViewer.count --;
            menuOnePrintCount();
               menuCalculation();
        } else {
                userMenuViewer.count = 0;
               menuOnePrintCount();
               menuCalculation();
            }*/
        }

    private void minus(int i) {
        if(userMenuViewer.count[i] > 0)
            userMenuViewer.count[i]--;
    }

    public void menuOnePrintCount(int i, JTextField totalNum){
            int num = userMenuViewer.count[i];
            totalNum.setText(num + "");
        }

    public int menuCalculation(int i, JTextField price_1){

        int menu_sum;
        /*switch (n){
            case menu1_sum:
                menu1_sum = menu1_price * userMenuViewer.count;
                userMenuViewer.price_1.setText(menu1_sum + "");
            case menu2_sum:
                menu2_sum = menu2_price * userMenuViewer.count;
                userMenuViewer.price_2.setText(menu2_sum + "");
        }*/

        menu_sum = menu_price[i] * userMenuViewer.count[i];
        price_1.setText(menu_sum + "");

        return menu_sum;

    }

    public void menuTotalCalculation(){

        int totalSum = 0;

        totalSum += menuCalculation(0, userMenuViewer.price_1);
        menuOnePrintCount(0, userMenuViewer.totalNum_1);
        totalSum += menuCalculation(1, userMenuViewer.price_2);
        menuOnePrintCount(1, userMenuViewer.totalNum_2);
        totalSum += menuCalculation(2, userMenuViewer.price_3);
        menuOnePrintCount(2, userMenuViewer.totalNum_3);
        totalSum += menuCalculation(3, userMenuViewer.price_4);
        menuOnePrintCount(3, userMenuViewer.totalNum_4);
        totalSum += menuCalculation(4, userMenuViewer.price_5);
        menuOnePrintCount(4, userMenuViewer.totalNum_5);
        totalSum += menuCalculation(5, userMenuViewer.price_6);
        menuOnePrintCount(5, userMenuViewer.totalNum_6);


        userMenuViewer.totalPrice.setText(totalSum + "");
    }

}

