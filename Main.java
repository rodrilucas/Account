import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente!");
        String clientName = sc.nextLine();
        account.setClientName(clientName);

        System.out.println("Por favor, digite o número da conta");
        int number = sc.nextInt();
        account.setNumber(number);

        System.out.println("Por favor, digite o número da agência");
        String agency = sc.next();
        account.setAgency(agency);

        account.messageUser();
    }
}
