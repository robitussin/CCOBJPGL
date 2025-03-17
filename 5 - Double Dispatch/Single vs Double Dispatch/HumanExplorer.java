public class HumanExplorer implements Explorer{
    
    public void visit(){
        System.out.println("Exploring a planet!");
    }

    public void visit(Mars mars){
        System.out.println("Exploring mars");
    }
}
