public class App {
    public static void main(String[] args) {

        Mother myMother = new Mother();

        System.out.println(myMother.surname);

        Daughter eldestDaughter = new Daughter();

        System.out.println(eldestDaughter.surname);

        eldestDaughter.showSurname();
    }
}