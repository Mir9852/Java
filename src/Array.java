public class Array {
    public static void main(String[] args) {
        String[] arraStrings;
        arraStrings  =new String[3];
        arraStrings[0] = "Muhamad";
        arraStrings[1] = "Amir";
        arraStrings[2] = "Mir";


        String[] stringArray = new String[3];
        stringArray[0] = "Apel";
        stringArray[1] = "Jeruk";
        stringArray[2] = "Pisang";

        System.out.println(arraStrings[0]);
        System.out.println(arraStrings[1]);
        System.out.println(arraStrings[2]);

        arraStrings[0] = "Endi";
        System.out.println(arraStrings[0]);

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] namaStrings = {
                "Muhamad",
                "Amir",
                "Mir"
        };

        namaStrings[0]=null;
        
        System.out.println(namaStrings[0]);

        int[] arrayInt = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(arrayInt[5]);

        long[] arrayLong = {
                10L, 20L, 30L};
        System.out.println(arrayLong[1]);

        arrayLong[0] = 15L;
        System.out.println(arrayLong[0]);

        arrayLong[0]=0;
        System.out.println(arrayLong.length);

        String[][] members = {
                {"Muhamad", "Amir"},
                {"Mir", "Endi"},
                {"Budi", "Caca"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
