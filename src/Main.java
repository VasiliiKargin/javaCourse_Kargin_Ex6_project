import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menus.MyMenu();
        String result = "";
        Scanner scr = new Scanner(System.in);
        int numMenu= Scr.crsNum();
        while (numMenu != 3) {
            if (numMenu == 1) {
                System.out.println("Введи пример");
                result = calculations.insertVars();
                System.out.println(result);
            }
            if (numMenu == 2) {
                System.out.println("Ошибка");
                break;
            }
            Menus.MyMenu();
            numMenu= Scr.crsNum();
        }
        System.out.println("До свидания");
    }
}
