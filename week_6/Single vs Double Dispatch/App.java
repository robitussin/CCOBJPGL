import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Planet mars = new Mars();

        Explorer astronaut = new HumanExplorer();

        List<Explorer> explorerlist = new ArrayList<Explorer>();
        explorerlist.add(astronaut);
        
        // Single Dispatch
        for (Explorer explorer : explorerlist) {
            explorer.visit();
        }

        // Double dispatch does not work in Java
        astronaut.visit(mars);

    }
}