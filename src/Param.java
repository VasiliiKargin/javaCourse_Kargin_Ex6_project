public class Param {
    public static boolean checkresults(String values) {
        if (values == "") {
            return false;
        }
        else {
            return true;
        }
    }
    public static boolean checkVal(String values){
        String[] vals = values.split(" ");
        String action = vals[1];
        switch (action){
            case "?":
        return false;
            default:
                return true;
        }
    }
}
