package Planets;

import Explorers.Explorer;

public class Mercury implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}