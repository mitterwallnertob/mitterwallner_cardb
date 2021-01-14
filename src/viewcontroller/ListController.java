package viewcontroller;

/**
 * @author Tobias Mitterwallner
 * @version 1
 * @date 14.01.2020
 * @class ListController
 */

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.CarDatabase;
import model.Vehicle;

import java.util.ArrayList;

public class ListController
{
    CarDatabase cdb= new CarDatabase();

    @FXML
    private TextField txt_field;

    @FXML
    private Button search_btn;

    @FXML
    private Button exactsearch_btn;

    @FXML
    private ListView lv;

    @FXML
    private Label errorlabel;


    public void searchbutton() {
        search();
    }

    public void exactsearchbutton() {
        exactsearch();
    }

    public void search() {
        Vehicle[] vehicle = cdb.search(txt_field.getText(), false);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for(int i = 0; i < vehicle.length; i++){
            vehicles.add(vehicle[i]);
        }
        lv.setItems(FXCollections.observableList(vehicles));

    }

    public void exactsearch() {
        Vehicle[] vehicle = cdb.search(txt_field.getText(), true);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for(int i = 0; i < vehicle.length; i++){
            vehicles.add(vehicle[i]);
        }
        if(!vehicles.contains(null))
        {
            lv.setItems(FXCollections.observableList(vehicles));
        } else {
            errorlabel.setVisible(true);
        }
    }
}

