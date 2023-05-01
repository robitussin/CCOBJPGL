package Planets;

import Explorers.Explorer;

public class Mars implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
