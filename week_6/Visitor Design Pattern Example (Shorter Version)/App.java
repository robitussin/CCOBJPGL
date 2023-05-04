/* Visitor Design Pattern */
    
public class App {
    public static void main(String[] args) throws Exception {

        Planet mars = new Mars();

        Explorer astronaut = new HumanExplorer();

        mars.accept(astronaut);

        //astronaut.visit();

        // Double dispatch 
        //astronaut.visit(mars);
    }
}