public class Dryer implements LaundryMachine{
    private TextUI ui;
    private int duration;
    private double price;
    private final int currentCycleInMinutes = 30;
    private final double pricePrMinute = 0.5;
    private final int addExtraTime = 10;

    public Dryer () {
        this.duration = currentCycleInMinutes;
        this.price = currentCycleInMinutes * pricePrMinute;
        this.ui = new TextUI();
    }


    public void chooseProgram() {
        int choice = ui.promptNumeric("Tørretumbler programmer: \n" +
                "1) Lav varme \n" +
                "2) Høj varme \n " +
                "\n" +
                "Indtast tallet for det ønskede program");

        switch (choice) {
            case 1:
                ui.displayMsg("Lav varme valgt");
                break;
            case 2:
                ui.displayMsg("Høj varme valgt");
                break;
            default:
                ui.displayMsg("Venligst indtast kun tal mellem 1-2");
                chooseProgram();
        }
    }


    public void displayPriceAndDuration() {
        ui.displayMsg("Pris: " + getPrice() + " kr | Tid: " + getDuration() + " minutter");
    }


    public void start() {
        ui.displayMsg("Maskinen er startet");
    }


    public void addExtra() {
        int choice = ui.promptNumeric("Tilføj 10 min ekstra for 5 kr? \n" +
                                       "1) Ja \n" +
                                       "2) Nej");
        switch (choice) {
            case 1:
                setDuration(getDuration() + 10);
                setPrice(getPrice() + 5);
                break;
            case 2:
                break;
            default:
                ui.displayMsg("Venligst indtast kun tal mellem 1-2");
                addExtra();
                break;
        }
    }


    public String toString () {
        return "Tørretumbler: " + getDuration() + " minutter  |  " + getPricePrMinute() + " kr pr. minut  |  ialt: " + getPrice() + "kr";
    }


    //getters and setters
    public void setDuration (int duration) {
        this.duration = duration;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public int getDuration () {
        return duration;
    }

    public double getPrice () {
        return price;
    }

    public double getPricePrMinute () {
        return pricePrMinute;
    }


}
