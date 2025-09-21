public class ForEach {
    public static void main(String[] args) {
        
        String[] names = {
            "Muhamad", "Amir", "Mira",
            "Rena", "Safitri", "Ahmad"
        };

        for(var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        } // For Biasa

        System.out.println("======== For Each ========");
        for(var name : names) {
            System.out.println(name);
        } // For Each
        
    }
}
