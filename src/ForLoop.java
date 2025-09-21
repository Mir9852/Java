public class ForLoop {

    public static void main(String[] args) {
        
        //for(;;){
        //    System.out.println("Perulangan tanpa henti");
       // }

       // var counter = 1;

       // for(; counter <= 10 ;) { // (perulangan tanpa Init Statement dan Post Statement)
       //     System.out.println("Perulangan " + counter);

       //     counter++;
       // }
    
        for(var counter = 1; counter <= 10;) { // perulangan dengan Init Statement
            System.out.println("Perulangan " + counter);
            counter++; 
        }

        for(var counter = 1; counter <= 10; counter++) { // perulangan dengan Post Statement
            System.out.println("Perulangan " + counter);
        }
    }
}