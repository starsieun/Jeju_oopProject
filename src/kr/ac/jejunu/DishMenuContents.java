package kr.ac.jejunu;

/**
 * Created by SeJong on 2017-06-14.
 */
public class DishMenuContents {

    UserTable userTable;
    UserMenuViewer userMenuViewer;


    DishMenuContents(){

        userTable = new UserTable();
        userTable.UserTableViewerBox();
/*
        userMenuViewer = new UserMenuViewer();
        userMenuViewer.UserViewerSetBox();
*/



    }
    public static void main(String[] args){

        new DishMenuContents();

    }
}
