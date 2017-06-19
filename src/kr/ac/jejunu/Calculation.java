package kr.ac.jejunu;

/**
 * Created by SeJong on 2017-06-17.
 */
public class Calculation {
            int[] count;
            int[] menu_price;

    public Calculation(){
                count = new int[6];
                for(int i =0; i < 6; i++) {
                    count[i] = 0;
                }

                menu_price = new int[]{
                        2500,
                        4500,
                        4500,
                        4500,
                        4500,
                        4500
                };
    }

    public void plus(int i) {
        count[i] ++;
    }

    public void minus(int i) {
        if(count[i] > 0)
            count[i]--;
    }

    public int getMenuTotalInformation(int i) {
        return menu_price[i] * count[i];
    }

    public int getCount(int i) {
        return count[i];
    }
}
