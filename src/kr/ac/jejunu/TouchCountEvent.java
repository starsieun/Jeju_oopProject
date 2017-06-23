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
        ExportInterfaceTotalMenuCalculation();
        ExportInterfaceViewer();
    }



    public void ExportInterfaceMenuPrintCount(int i, JTextField totalNum){
        int num = calculation.getCount(i);
        totalNum.setText(num + "");
    }



    public int ExportInterfaceSeveralMenuCalculation(int i, JTextField price){
        int menu_sum;
        menu_sum = calculation.getMenuTotalInformation(i);
        price.setText(menu_sum + "");

        return menu_sum;

    }



    public void ExportInterfaceTotalMenuCalculation(){
        int totalSum;
        totalSum = calculation.getMenuTotalPrice();
        userMenuViewer.totalPrice.setText(totalSum + "");
    }

    public void ExportInterfaceViewer(){
        ExportInterfaceSeveralMenuCalculation(0, userMenuViewer.price_1);
        ExportInterfaceMenuPrintCount(0, userMenuViewer.totalNum_1);
        ExportInterfaceSeveralMenuCalculation(1, userMenuViewer.price_2);
        ExportInterfaceMenuPrintCount(1, userMenuViewer.totalNum_2);
        ExportInterfaceSeveralMenuCalculation(2, userMenuViewer.price_3);
        ExportInterfaceMenuPrintCount(2, userMenuViewer.totalNum_3);
        ExportInterfaceSeveralMenuCalculation(3, userMenuViewer.price_4);
        ExportInterfaceMenuPrintCount(3, userMenuViewer.totalNum_4);
        ExportInterfaceSeveralMenuCalculation(4, userMenuViewer.price_5);
        ExportInterfaceMenuPrintCount(4, userMenuViewer.totalNum_5);
        ExportInterfaceSeveralMenuCalculation(5, userMenuViewer.price_6);
        ExportInterfaceMenuPrintCount(5, userMenuViewer.totalNum_6);
    }

}

