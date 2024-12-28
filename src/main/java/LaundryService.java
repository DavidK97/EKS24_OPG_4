import java.util.ArrayList;

public class LaundryService {
    private ArrayList<LaundryMachine> machines;
    TextUI ui;

    public LaundryService() {
        this.machines = new ArrayList<>();
        this.ui = new TextUI();
    }


    public void addMachine(LaundryMachine laundryMachine) {
        machines.add(laundryMachine);
    }


    public LaundryMachine chooseMachine() {
        ui.displayMsg("Ledige maskiner");
        int counter = 1;

        for (LaundryMachine laundryMachine : machines) {
            ui.displayMsg("Nr) " + counter + ": " + laundryMachine);
            counter++;
        }

        int choice = ui.promptNumeric("Vælg en maskine: \n");

            if (choice >= 1 && choice <= machines.size()) {
                return machines.get(choice - 1);
            } else {
                ui.displayMsg("Venligst indtast kun tal fra listen");
                return chooseMachine();
            }
    }
}
