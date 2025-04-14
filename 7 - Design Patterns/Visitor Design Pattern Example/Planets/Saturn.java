package Planets;

import Explorers.Explorer;

public class Saturn implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}