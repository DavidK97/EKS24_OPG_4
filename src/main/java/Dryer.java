public class Dryer implements LaundryMachine{
    private TextUI ui;
    private int duration;
    private double price;
    private final int currentCycleInMinutes = 30;
    private final double pricePrMinute = 0.5;

    public Dryer () {
        this.duration = currentCycleInMinutes;
        this.price = currentCycleInMinutes * pricePrMinute;

    }


    public void chooseProgram() {
        int choice = ui.promptNumeric("Tørretumbler programmer: \n" +
                "1) Lav varme \n" +
                "2) Høj varme \n " +
                "\n" +
                "Indtast tallet for det ønskede program");

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            default:
                ui.displayMsg("Venligst indtast kun tal mellem 1-2");
                chooseProgram();
        }
    }


    public void displayPriceAndDuration() {

    }


    public void start() {

    }


    public void addExtra() {

    }

}
