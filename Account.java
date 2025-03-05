public class Account {
    private Integer number;
    private String agency;
    private String clientName;
    private Double balance;

    public void validateInfo(String value){
        try {
            if(value == null || value.trim().isEmpty()){
                throw new ExceptionAccount("Dados inválidos.");
            }
        }catch (ExceptionAccount e){
            System.out.println(e.getMessage());
        }
    }

    public void validateBalance(Double balance){
        try {
            if(balance < 0){
                throw new ExceptionAccount("Você não pode depositar um valor negativo!");
            }
        }catch (ExceptionAccount e){
            System.out.println(e.getMessage());
        }
    }

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
        validateInfo(agency);
        this.agency = agency;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        validateInfo(clientName);
        this.clientName = clientName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        validateBalance(balance);
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
