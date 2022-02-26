import java.util.Scanner;

public class calculations {
    public static String InsertVars() {
        Scanner scr = new Scanner(System.in);
        String txt = "";
        txt = scr.nextLine();
        String resultVars = "0";
        int sumVars = 0;
        String[] vals = txt.split(" ");
        int var1 = Integer.parseInt(vals[0].trim());
        String action = vals[1];
        int var2 = Integer.parseInt(vals[2].trim());
        switch (action) {
            case "+":
                sumVars += var1 + var2;
                resultVars = Jj(txt, sumVars);
            default:
                System.out.println("вСЕ НЕТО");
        }
        return resultVars;
    }
    private static String Jj(String txt, int sumVars) {
        String ll = "\"+\" - " + txt + " = " + Integer.toString(sumVars);
        return ll;

    }
}
