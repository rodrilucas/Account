public class Account {
    private Integer number;
    private String agency;
    private String clientName;
    private Double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void messageUser() {
        System.out.println(
                "Olá " + clientName + ", " +
                "obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agency +
                ", conta " + number +
                " e seu saldo " + balance +
                " já está disponível para saque"
        );
    }

}
