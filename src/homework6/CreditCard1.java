package homework6;
public class CreditCard1{
    public static void main(String[] args) {

        CreditCard1 myCard1 = new CreditCard1(123, 100);
        CreditCard1 myCard2 = new CreditCard1(200, 3000);
        CreditCard1 myCard3 = new CreditCard1(450, 245);
        myCard1.ReplenishCard(100);
        myCard2.ReplenishCard(230);
        myCard3.withdrawTheAmount(100);
        myCard1.cardInformation();
        myCard2.cardInformation();
        myCard3.cardInformation();
    }

    private int accountNumber;  // номер счёта
    private int currentAmount; // текущая сумма на счету


    public CreditCard1(int accountNumber, int currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public void ReplenishCard(int addMoney) {    // пополнить карту
        currentAmount = currentAmount + addMoney;
        System.out.println("You successfully add money");

    }

    public void withdrawTheAmount(int removeMoney) {    // снять деньги с карточки
        if(removeMoney > currentAmount){
            System.out.println( "You can't remove money");
        } else{
            currentAmount = currentAmount - removeMoney;
            System.out.println("You successfully remove money");
        }

    }
    public void cardInformation() {    // текущая информация о карточке
        System.out.println("Account number: " + accountNumber);
        System.out.println("Current Amount: " + currentAmount);
    }
}


