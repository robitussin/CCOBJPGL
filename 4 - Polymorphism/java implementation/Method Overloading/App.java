class Math{

    public void add(int a, int b){
        System.out.println("Sum: " + (a + b));
    }

    public void add(int a, int b, int c){
        System.out.println("Sum: " + (a + b + c));
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        
        Math math = new Math();
        math.add(5, 10); // Calls the first method
        math.add(5, 10, 15); // Calls the second method
    }
}
