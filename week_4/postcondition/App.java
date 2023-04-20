public class App {

    static boolean iWontDrink = false;
    static boolean iAmDrunk = false;

    public static void main(String[] args) throws Exception {
      
        App myApp = new App();

        myApp.goToParty();

        // Postcondition
        assert iAmDrunk == false: "You wont drink ever again!";
    }


    void goToParty(){
        
        iAmDrunk = true;
    }
}
