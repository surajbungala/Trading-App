public class PassbyValue {
    public static void c(int n){
        System.out.println("Inside c" + " "+ n);
        n++;
        //System.out.println("Increment" + n);
    } 
    public static void b(int n){
        c(n);
        System.out.println("Inside b" +" "+ n);
        n++;
    }
    public static void a(int n) {
        b(n);
        System.out.println("Inside A" + " " + n);
        n++;
        
    }
    public static void main(String[] args) {
        int n = 10;
        a(n);
        System.out.println("Main" + n);
    }
}