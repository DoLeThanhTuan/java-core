package com.dolethanhtuan.util;

import java.util.Scanner;

public class ScannerUtil {
    private static final Scanner sc = new Scanner(System.in);

    private static String inputString(){
        return sc.nextLine().trim().replaceAll("\\s{2}", " ");
    }
    public static String inputFullname(){
        System.out.print("Nhập vào họ tên: ");
        return inputString();
    }
    public static String inputEmail(){
        System.out.print("Nhập vào email: ");
        return inputString();
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
}
