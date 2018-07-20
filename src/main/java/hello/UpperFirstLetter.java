package hello;

public class UpperFirstLetter {
    private static String result;

        // Convert the first letter to Upper Case
    public static String MakeUpper(String value){
        result = value.substring(0,1).toUpperCase() + value.substring(1);
        return result;
    }
}