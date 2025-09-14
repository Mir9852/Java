public class TipeDataNumber {
    public static void main(String[] args) {
        
        byte iniByte = 100;
        short iniShort = 10000;
        int iniInt = 100000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

       
        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt); 
        System.out.println(iniLong);
        System.out.println(iniLong2);

        float iniFloat = 10.10F;
        double iniDouble = 10.10;

        System.out.println(iniFloat);
        System.out.println(iniDouble);

        int decimalInt=30;
        int hexDecimal =0xAAAA;
        int binaryDecimal = 0b101010;

        System.out.println(decimalInt);
        System.out.println(hexDecimal);
        System.out.println(binaryDecimal);

        long amount = 1_000_000_000;

        System.out.println(amount);
        
        
    }
}