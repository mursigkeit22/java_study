package homework.better_version;

public class Bowl {


    private int maxAmount;

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    private int currentAmount;

    public int getMaxAmount() {
        return maxAmount;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public Bowl(int maxAmount) {
        this.maxAmount = maxAmount;
        this.currentAmount = 0;
    }

    public void decreaseAmount(int amount){
        setCurrentAmount(getCurrentAmount() - amount);
    }

    public void fillTheBowl(int amount) {
        if (amount > 0) {
            int newAmount = currentAmount + amount;
            if (newAmount >= maxAmount) {
                currentAmount = maxAmount;
                System.out.println("The bowl is filled to the very top!");

            }
            else{currentAmount = newAmount;
                System.out.println("Food left in bowl: " + currentAmount);
            }
        }
        else {
            System.out.println("Please fill the bowl with actual food");
        }
    }
}
