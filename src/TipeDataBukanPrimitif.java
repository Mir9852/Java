public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        
        Integer iniInteger = 100;
        Long iniLong = 1000000000L;

        Byte iniByte = null;

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        int iniInt = 100;
        Integer iniObjek = iniInt;

        System.out.println(iniObjek);

        short iniShort = iniObjek.shortValue();
        System.out.println(iniShort);
        byte iniByte2 = iniObjek.byteValue();
        System.out.println(iniByte2);
        long iniLong2 = iniObjek.longValue();
        System.out.println(iniLong2);
        float iniFloat = iniObjek.floatValue();
        System.out.println(iniFloat);

        long amount = 1000000000L;
        System.out.println(amount);
    }
    
}
