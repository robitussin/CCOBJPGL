import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        // Single Dispatch
        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();

        // Single Dispatch
        Explorer lifeExplorer = new LifeExplorer();
        Explorer landscapeExplorer = new LandscapeExplorer();

        mars.accept(lifeExplorer);
        saturn.accept(lifeExplorer);
        mercury.accept(lifeExplorer);

        mars.accept(landscapeExplorer);
        saturn.accept(landscapeExplorer);
        mercury.accept(landscapeExplorer);
    }
}