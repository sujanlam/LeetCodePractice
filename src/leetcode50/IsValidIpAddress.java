package leetcode50;

import java.util.regex.Pattern;

public class IsValidIpAddress {
    public static boolean isValidIPAddress(String ipAddress) {
        //String ipPattern ="^((25[0-5]2[0-4][01]?[0-9][0-9]?)\\.){3}" + "(25[0-5]2[0-4][01]?[0-9][0-9]?)$";
        String ipPattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";


        return Pattern.matches(ipPattern, ipAddress);
    }


    public static void main(String[] args) {
        String ipAddress = "192.168.1.49";
        //System.out.println(isValidIPAddress(ipAddress));
    }
}