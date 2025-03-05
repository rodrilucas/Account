public class Account {
    private Integer number;
    private String agency;
    private String clientName;
    private Integer balance;

    public Integer getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public String getAgency(){
        return agency;
    }

    public String getClientName(){
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

}
