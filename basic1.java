public class basic1 {


    public static String decimalToBinary(int decimal) {
        String binary ="";
        while (decimal > 0) {
            double remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2; // integer division
        }
        return binary;
    }



    public static void main(String[] args) {
        // int a = 0b1010101101;
        // int b = 014;
        // int c = 0x2Ac;

        // System.out.println("a is :" + a);
        // System.out.println("b is :" + b);
        // System.out.println("c is :" + c);

        int decimal = 684;
        String binary = decimalToBinary(decimal);
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);

        int x = 10;
        int y = 3;

        // double ans = x/y;

        System.out.println(x/y);

    }

}
