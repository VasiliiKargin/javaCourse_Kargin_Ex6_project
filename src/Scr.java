import java.util.Scanner;

public class Scr {
    public static int crsNum() {
        Scanner scr = new Scanner(System.in);
        int numMenu = scr.nextInt();
        return numMenu;
    }
    public static String scrInsertValue(){
        Scanner scr = new Scanner(System.in);
        String txt = "";
        txt = scr.nextLine();
        return txt;
    }
}
