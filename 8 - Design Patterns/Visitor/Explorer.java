public interface Explorer {
    
    void visit();

    void visit(Mars mars);

    default void visit(Planet planet){
        System.out.print("Landed on a planet");
    };
}
