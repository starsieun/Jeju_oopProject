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

    public TouchCountEvent(UserMenuViewer userMenuViewer){
        this.userMenuViewer = userMenuViewer;
        this.calculation = new Calculation();
    }

    @Override
    public void actionPerformed(ActionEvent e ) {
        switch (e.getActionCommand()){
            case "plus_1":
                calculation.plus(0);
                break;

            case "minus_1":
                calculation.minus(0);
                break;
            case "plus_2":
                calculation.plus(1);
                break;

            case "minus_2":
                calculation.minus(1);
                break;
            case "plus_3":
                calculation.plus(2);
                break;

            case "minus_3":
                calculation.minus(2);
                break;
            case "plus_4":
                calculation.plus(3);
                break;

            case "minus_4":
                calculation.minus(3);
                break;
            case "plus_5":
                calculation.plus(4);
                break;

            case "minus_5":
                calculation.minus(4);
                break;
            case "plus_6":
                calculation.plus(5);
                break;

            case "minus_6":
                calculation.minus(5);
                break;
        }
        refresh();
    }



    public void menuOnePrintCount(int i, JTextField totalNum){
            int num = calculation.getCount(i);
            totalNum.setText(num + "");
    }



    public int menuCalculation(int i, JTextField price_1){
        int menu_sum;
        menu_sum = calculation.getMenuTotalInformation(i);
        price_1.setText(menu_sum + "");

        return menu_sum;

    }



    public void refresh(){
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

