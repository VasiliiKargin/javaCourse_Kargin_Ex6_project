import com.sun.org.apache.xpath.internal.objects.XString;

import java.security.SecureRandom;
import java.util.Scanner;

public class calculations {
    public static String insertVars() {
        Scanner scr = new Scanner(System.in);
        String txt = "";
        txt = scr.nextLine();
        String resultVars = "0";
        int calcVars = 0;
        String[] vals = txt.split(" ");
        int var1 = Integer.parseInt(vals[0].trim());
        String action = vals[1];
        int var2;
        //int var2 = Integer.parseInt(vals[2].trim());
        switch (action) {
            case "+":
                var2= Integer.parseInt(vals[2].trim());
                calcVars += var1 + var2;
                resultVars = "\"+\" - " + txt + " = " + Integer.toString(calcVars);
                break;
            case "-":
                var2= Integer.parseInt(vals[2].trim());
                calcVars -= var1 - var2;
                resultVars = "\"-\" - " + txt + " = " + Integer.toString(calcVars);
                break;
            case "*":
                var2= Integer.parseInt(vals[2].trim());
                calcVars = var1 * var2;
                resultVars = "\"*\" - " + txt + " = " + Integer.toString(calcVars);
                break;
            case "/":
                var2= Integer.parseInt(vals[2].trim());
                calcVars = var1 / var2;
                resultVars = "\"/\" - " + txt + " = " + Integer.toString(calcVars);
                break;
            case "!":
                calcVars = getFactorial(var1);
                resultVars = "\"!\" - " + var1 + action + " = "+ factorial(var1) + " = "+ Integer.toString(calcVars);
                break;
            case "^":
                var2= Integer.parseInt(vals[2].trim());
                calcVars = degree(var1,var2);
                resultVars = "\"^\" - " + txt + " = " + Integer.toString(calcVars);
                break;
            case "?":
                var2= Integer.parseInt(vals[2].trim());
                String calcVarscomparison ="";
                calcVarscomparison = comparison(var1,var2);
                resultVars = "\"?\" - " + txt + " = " + calcVarscomparison;
                break;
            default:
                System.out.println("вСЕ НЕТО");
                break;
        }
        return resultVars;
    }
    public static int getFactorial (int var1) {
        if (var1 <=1){
            return 1;
        }
        else {
            return var1 * getFactorial(var1 - 1);
        }
    }
    public static String factorial (int var1){
        if (var1 <=1){
            return Integer.toString(1);
        }
        else {
            return Integer.toString(var1) + " * " +factorial(var1 -1);
        }
    }
    public  static int degree (int var1, int var2){
        if (var2 == 1) {
            return var1;
        }
            else
            {
               return var1 * degree (var1, var2 - 1);
            }
    }
    public static String comparison(int var1, int var2){
        if (var1 == var2) {
            return var1 + " = " + var2;
        }
        if (var1 > var2) {
            return var1 + " > " + var2;
        }
        else {
            return  var1 + " < " + var2;
        }
    }
}
