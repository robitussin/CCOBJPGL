public class App {
    public static void main(String[] args) {

        Mango philippineMango = new Mango();

        philippineMango.color = "Bright Yellow";
        philippineMango.taste = "Very Sweet";

        philippineMango.showColorandTaste();

        Strawberry whiteGoblin = new Strawberry();

        whiteGoblin.color = "white";
        whiteGoblin.taste = "Sweet and Sour";

        whiteGoblin.showColorandTaste();

        Banana lacatan = new Banana();

        lacatan.color = "Yellow";
        lacatan.taste = "Sweet";

        lacatan.showColorandTaste();
    }
}