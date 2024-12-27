public class Main {

    public static void main (String [] args) {
        LaundryService laundryService = new LaundryService();

        LaundryMachine washingMachine1 = new WashingMachine(5);
        LaundryMachine washingMachine2 = new WashingMachine(5);
        LaundryMachine washingMachine3 = new WashingMachine(7);
        LaundryMachine dryer1 = new Dryer();

    }
}
