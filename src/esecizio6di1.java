public class esecizio6di1 {
    public static boolean equals(int a, int b){
       boolean c = a == b;
       return c;
    };
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        
        boolean risultato = equals(a, b);
        System.out.println("i valori di a " + a + " e di" + " b " + b + " sono " + risultato);
    }
}
