package OOP3;

public class App {
    public static void main(String[] args) {
        User[] users = new User[10];

        for(int i = 0; i < users.length; i++) {
            User actual = new User();
            actual.setFirstName("User" + i);
            actual.setLastName("C" + i);
            users[i] = actual;
        }

        System.out.print(users[3].getFirstName());
        System.out.print(users[3].getLastName());
    }
}
