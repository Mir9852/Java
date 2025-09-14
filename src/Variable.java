public class Variable {    
    public static void main(String[] args) {
        
        String nama;
        nama = "Muhammad Amir";

        int umur = 27;
        String alamat = "Indonesia";

        System.out.println(nama);
        System.out.println(umur);
        System.out.println(alamat);

        nama = "Amir";
        System.out.println(nama);

        System.out.println("Hello " + nama + ", umur saya " + umur + " tahun, saya tinggal di " + alamat);

        var firstNameVariable = "Muhamad";
        var lastNameVariable = "Amir";

        System.out.println(firstNameVariable + " " + lastNameVariable);

        final String ApplicationName = "Belajar Java";

        System.out.println(ApplicationName);
    }
}