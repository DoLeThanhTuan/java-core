package com.dolethanhtuan.util;

import java.util.Scanner;

public class ScannerUtil {
    private static final Scanner sc = new Scanner(System.in);

    private static String inputString(){
        return sc.nextLine().trim().replaceAll("\\s{2}", " ");
    }
    public static String inputFullname(){
        while (true){
            System.out.println("Nhập vào họ tên: ");
            String input = inputString();
            int length = input.length();
            boolean flag = true;
            for (int i =0;i<length;i++){
                char c = input.charAt(i);
                if(Character.isWhitespace(c)){
                    continue;
                }
                if(!Character.isAlphabetic(c)){
                    System.err.println("Yêu cầu nhập đúng họ tên");
                    System.err.print("Bạn hãy nhập lại: ");
                    flag = false;
                    break;
                }
            }
            if(flag)
                return input;
        }
    }
    public static String inputEmail(){
        while (true){
            System.out.print("Nhập vào email: ");
            String input = inputString();
            if(input.contains("@")){
                return input;
            }
            else{
                System.err.println("Yêu cầu nhập đúng email");
                System.err.print("Bạn hãy nhập lại: ");
            }
        }
    }

    public static int inputInt(){
        while (true){
            try{
                String input = inputString();
                return Integer.parseInt(input);
            }catch (NumberFormatException e){
                System.err.println("Yêu cầu nhập vào số nguyên");
                System.err.print("Bạn hãy nhập lại: ");
            }
        }
    }

    public static String inputPassword() {
        while (true){
            System.out.print("Nhập vào password: ");
            String input = inputString();
            int lenght = input.length();
            if(lenght < 6 || lenght > 12){
                System.err.println("Yêu cầu nhập password từ 6 tơ 12 kí tự");
                System.err.println("Bạn hãy nhập lại: ");
            }
            else if(hasAnyUppercase(input)){
                return input;
            }
            else {
                System.err.println("Yêu cầu nhập password có ít nhất 1 kí tự viết hoa");
                System.err.println("Bạn hãy nhập lại: ");
            }
        }

    }

    private static boolean hasAnyUppercase(String input) {
        for(int i = 0 ;i<input.length();i++){
            if(Character.isUpperCase(input.charAt(i)))
                return true;
        }
        return false;
    }
}
