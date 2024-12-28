public class Main {

    public static void main (String [] args) {
        LaundryMachine currentMachine;

        LaundryService laundryService = new LaundryService();

        LaundryMachine washingMachine1 = new WashingMachine(5);
        LaundryMachine washingMachine2 = new WashingMachine(5);
        LaundryMachine washingMachine3 = new WashingMachine(7);
        LaundryMachine dryer1 = new Dryer();

        laundryService.addMachine(washingMachine1);
        laundryService.addMachine(washingMachine2);
        laundryService.addMachine(washingMachine3);
        laundryService.addMachine(dryer1);

        currentMachine = laundryService.chooseMachine();

        currentMachine.chooseProgram();
        System.out.println("Du har valgt følgende maskine: " + currentMachine);
        currentMachine.displayPriceAndDuration();
        currentMachine.addExtra();
        currentMachine.displayPriceAndDuration();
        currentMachine.start();
        currentMachine.addExtra();
        currentMachine.displayPriceAndDuration();

        //TODO gennemgang af om alt er opfyldt
        //TODO Junit-test

    }
}
