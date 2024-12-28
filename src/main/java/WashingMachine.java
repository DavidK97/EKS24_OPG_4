public class WashingMachine implements LaundryMachine{
    private TextUI ui;
    private int duration;
    private double price;
    private boolean isRunning;
    private int capacity;
    private final double pricePrKg = 1.2; //current rate
    private final double prewashPrice = 5;


    public WashingMachine (int capacity) {
        if ((capacity == 5) || (capacity == 7)) {
            this.capacity = capacity;
        } else {
            ui.displayMsg ("Washingmachine size can only be 5 or 7 kg");
        }
        this.price = pricePrKg * capacity;
        this.isRunning = false;
        this.duration = 0;
        this.ui = new TextUI();
    }


    public void chooseProgram() {
        int choice = ui.promptNumeric("Vaskemaskine programmer: \n" +
                       "1) Uld og silke \n" +
                       "2) Bomuld 40 \n" +
                       "3) Bomuld 60 \n" +
                        "\n" +
                       "Indtast tallet for det ønskede program");

        switch (choice) {
            case 1:
                setDuration(30);
                break;
            case 2:
                setDuration(40);
                break;
            case 3:
                setDuration(60);
                break;

            default:
                ui.displayMsg("Venligst indtast kun tal mellem 1-3");
                chooseProgram();
                break;
        }
    }


    public void displayPriceAndDuration() {
        ui.displayMsg("Pris: " + getPrice() + " kr | Tid: " + getDuration() + " minutter");
    }


    public void start() {
        ui.displayMsg("Maskinen er startet");
        setIsRunning(true);  //Must be true!
    }


    public void addExtra() {
        if (getIsRunning() == true) {
            ui.displayMsg("Programmet er påbegyndt. Der kan ikke tilføjes forvask, når programmet er igang");
        } else {
            int choice = ui.promptNumeric("Tilføj forvask for 5 kr? \n" +
                    "1) Ja \n" +
                    "2) Nej");

            switch (choice) {
                case 1:
                    ui.displayMsg("Forvask tilføjet. Der bliver lagt 5kr til prisen");
                    setPrice(getPrice() + getPrewashPrice());
                    break;
                case 2:
                    break;
                default:
                    ui.displayMsg("Venligst indtast kun tal mellem 1-3");
                    addExtra();
                    break;
            }
        }
    }

    public String toString () {
        return "Vaskemaskine: " + getCapacity() + "kg max  |  " + getPricePrKg() + " kr pr. kg  |  ialt: " + getPrice() + "kr";
    }


    //getters and setters
    public void setDuration (int duration) {
        this.duration = duration;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public void setIsRunning (boolean isRunning) {
        this.isRunning = isRunning;
    }

    public double getPrice () {
        return price;
    }

    public int getDuration () {
        return duration;
    }

    public int getCapacity () {
        return capacity;
    }

    public boolean getIsRunning() {
        return isRunning;
    }

    public double getPricePrKg () {
        return pricePrKg;
    }

    public double getPrewashPrice () {
        return prewashPrice;
    }
}
