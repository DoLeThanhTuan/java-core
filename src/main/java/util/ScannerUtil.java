package util;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner sc = new Scanner(System.in);
    public static int inputInt(){
        while (true){
            String s = sc.nextLine();
            try{
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.err.println("Bạn hãy nhập vào 1 số nguyên");
                System.err.println("Hãy nhập lại: ");
            }
        }
    }
    public static int inputPositiveInt(){
        while(true){
            String input = sc.nextLine();
            try{
                int positiveNumber = Integer.parseInt(input);
                if(positiveNumber <= 0){
                    System.err.println("Hãy nhập số nguyên dương");
                    System.err.println("Hãy nhập lại");
                }else
                    return positiveNumber;
            }catch (NumberFormatException e){
                System.err.println("Hãy nhập số nguyên dương");
                System.err.println("Hãy nhập lại");
            }

        }
    }
    public static float inputFloat(){
        while(true){
            String input = sc.nextLine();
            try{
                float floatNumber = Float.parseFloat(input);
                return floatNumber;
            }catch (NumberFormatException | NullPointerException e){
                System.err.println("Hãy số có kiểu float");
                System.err.println("Hãy nhập lại");
            }

        }
    }
    public static double inputDouble(){
        while(true){
            String input = sc.nextLine();
            try{
                double doubleNumber = Double.parseDouble(input);
                return doubleNumber;
            }catch (NumberFormatException | NullPointerException e){
                System.err.println("Hãy nhập số nguyên dương");
                System.err.println("Hãy nhập lại");
            }

        }
    }
    public static String inputString(){
        return sc.nextLine();
    }
    public static String inputEmail(){
        while(true){
            String input = sc.nextLine();
            if(!input.contains("@")){
                System.err.println("Hãy nhập đúng định dạng email");
                System.err.println("Hãy nhập lại");
            }else
                return input;
        }
    }
    public static String inputPassword(){
        while(true){
            String input = sc.nextLine();
            if(input.length() >= 6 && input.length() <=12){
                for(int i = 0;i<input.length();i++){
                    if(Character.isUpperCase(input.charAt(i)))
                        return input;
                }
                System.err.println("Hãy nhập đúng định dạng email");
                System.err.println("Hãy nhập lại");
            }else {
                System.err.println("Hãy nhập đúng định dạng email");
                System.err.println("Hãy nhập lại");
            }
        }
    }
    public static String inputFullname(){
        while (true){
            boolean rs = true;
            String input = sc.nextLine();
            for (int i = 0;i<input.length();i++){
                if(!Character.isAlphabetic(input.charAt(i))
                && !Character.isWhitespace(input.charAt(i))){
                    System.err.println("Hãy nhập đúng họ tên");
                    System.err.println("Hãy nhập lại: ");
                    rs = false;
                    break;
                }
                else
                    continue;
            }
            if(rs)
                return input;
        }
    }
}
