
import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner inputscanner = new Scanner(System.in); 
        System.out.println("Enter username:");

        String userNameinput = inputscanner.nextLine(); 

        System.out.println("Enter password:");

        String passwordinput = inputscanner.nextLine(); 

        User user = new User(userNameinput, passwordinput);

        File accountsfile = new File("accounts.txt");

        if (accountsfile.createNewFile()) {
            System.out.println("File created: " + accountsfile.getName());
        } else {
            System.out.println("File already exists.");
        } 

        inputscanner.close();

        Scanner filescanner = new Scanner(accountsfile);
        while (filescanner.hasNextLine()) {

            String data = filescanner.nextLine();
   
            String username = data.split(",")[0];
            String password = data.split(",")[1];

            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                System.out.println("Login successful");
                break;
            } else {
                System.out.println("Login failed");
            }
        }

        filescanner.close();
    }
}
