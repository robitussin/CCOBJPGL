package Explorers;

import Planets.*;

public class LandscapeExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Adjusting camera to Mercury atmosphere... taking picture of Mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Adjusting camera to Mars atmosphere ... taking picture of Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Adjusting camera to Saturn atmosphere ... taking picture of Saturn");
    }
}