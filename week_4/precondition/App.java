public class App {

    static boolean iWontDrink = false;

    public static void main(String[] args) throws Exception {
      
        // Precondition
        assert iWontDrink == false: "You are grounded for the rest of your life!";

        App myApp = new App();

        myApp.goToParty();
    }


    void goToParty(){
        
        iWontDrink = true;
    }
}
