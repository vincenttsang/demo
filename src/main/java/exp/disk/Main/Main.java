package exp.disk.Main;

import exp.disk.Controller.OSManager;
import exp.disk.View.UIDesign;

public class Main {

    public static void main(String[] args) {
        try {
            OSManager manager = new OSManager();
            UIDesign ui = new UIDesign(manager);
            ui.getOsManager().setUIDesign(ui);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}