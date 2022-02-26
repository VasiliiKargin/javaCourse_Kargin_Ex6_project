import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menus.MyMenu();
        String result = "";
        int resultInt = 0;
        String values = "";
        boolean flag1;
        boolean flag2;
        Scanner scr = new Scanner(System.in);
        int numMenu = Scr.crsNum();
        while (numMenu != 3) {
            if (numMenu == 1) {
                System.out.println("Введи пример");
                values = Scr.scrInsertValue();
                result = calculations.insertVars(values);
                System.out.println(result);
                resultInt = calculations.insertVarsInt(values);
            }
            if (numMenu == 2) {
                flag1 = Param.checkresults(values);
                if (flag1 == false) {
                    System.out.println("Недоступно! Небыло ранее вычислений.\n  Выберите снова.");
                } else {
                    flag2 = Param.checkVal(values);
                    if (flag2 == false) {
                        System.out.println("Недоступно! Небыло ранее вычислений.\n  Выберите снова.");
                    } else {

                        System.out.println("Выберите действие с ранее полученным значением.");
                        Menus.MyMenu2();
                        int numMenu2 = Scr.crsNum();
                        String res = Integer.toString(resultInt);
                        String action = "";
                        while (numMenu2 != 0) {
                            switch (numMenu2) {
                                case 1:
                                    action = "+";
                                    break;
                                case 2:
                                    action = "-";
                                    break;
                                case 3:
                                    action = "*";
                                    break;
                                case 4:
                                    action = "/";
                                    break;
                                case 5:
                                    action = "!";
                                    break;
                                case 6:
                                    action = "^";
                                    break;
                                case 7:
                                    action = "?";
                                    break;
                            }
                            if (numMenu2 !=5){
                            System.out.println("Введи число");
                            String var3 = scr.nextLine();
                            values = res + " " + action + " " + var3;
                            break;}
                            else {
                                String var3 = "";
                                values = res + " " + action + " " + var3;
                                break;
                            }
                        }
                        result = calculations.insertVars(values);
                        System.out.println(result);
                        resultInt = calculations.insertVarsInt(values);
                    }
                }
            }
            Menus.MyMenu();
            numMenu = Scr.crsNum();
        }
        System.out.println("До свидания");
    }
}
