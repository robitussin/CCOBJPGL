public class RobotExplorer implements Explorer{
    
    public void visit(){
        System.out.println("Exploring a planet using a robot!");
    }

    public void visit(Mars mars){
        System.out.println("Exploring mars using a robot");
    }
}
