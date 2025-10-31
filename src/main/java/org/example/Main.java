package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int sayi){
        sayi = Math.abs(sayi);

        int duz = sayi;
        int ters = 0;

        while(sayi > 0){
            int sonRakam = sayi % 10;
            ters = ters * 10 + sonRakam;
            sayi /= 10;
        }
        return (duz == ters);
    }
    public static boolean isPerfectNumber(int sayi){
        if(sayi < 0){
            return false;
        }else{
            int toplam = 0;

            for(int i = 1; i <= sayi/2; i++){
                if(sayi % i == 0){
                    toplam += i;
                }
            }
            return (toplam == sayi);
        }
    }
    public static String numberToWords(int number) {
        if (number < 0) {
            return ("Invalid Value");
        }

        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String s = String.valueOf(number);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            sb.append(words[d]);
            if (i < s.length() - 1) sb.append(" ");
        }

        return sb.toString();
    }

}
