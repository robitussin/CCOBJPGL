public class App {
    public static void main(String[] args) throws Exception {

        Cat mypersiancat = new Cat();

        Fish bangus = new Fish();

        // Association
        mypersiancat.eat(bangus);

        // Aggregation
        // There is no dependency between two different classes
        // each class have independent existence and they are not tied to each other.
        Wolf myWolf = new Wolf();
        myWolf.name = "terence";

        WolfPack wolfPack = new WolfPack();
        wolfPack.packName = "wolfgang";

        // terence is part of wolfpack
        wolfPack.addWolf(myWolf);

        // Composition
        Water myWater = new Water();

        // cactus needs water
        // dependency
        Plant cactus = new Plant(myWater);

    }
}
