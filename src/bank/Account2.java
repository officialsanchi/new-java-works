package bank;

public class Account2 {
        private double balance;
        private String name;
        private String pin;
        private String number;

        public Account2(String inputName, String inputPin, String inputNumber){
            name = inputName;
            pin = inputPin;
            number = inputNumber;
        }

        public void deposit(double amount){
            if(amount>0){
                balance = balance + amount;
            }else System.out.print("amount must not be less than zero");
        }

        public void withdraw( double amount, String myPin){
            pinValidation(myPin);
            if(balance> amount){
                balance = balance - amount;
            }
        }

        private void pinValidation(String pin){
            if(!this.pin.equals(pin)){
                System.out.print("invalid pin");
            }

        }

        public double checkBalance(String number, String pin){
            pinValidation(pin);
            return balance;
        }
        public String getName(){
            return name;
        }
        public String getPin(){
            return pin;
        }
        public String getNumber(){
            return number;
        }
        public String toString(){
            return String.format("""  
	Name: %s
	Account Number: %s
	Balance: %.2f
	Pin: %s %n %n
	""",name,number,balance,">>>>");
        }


}
