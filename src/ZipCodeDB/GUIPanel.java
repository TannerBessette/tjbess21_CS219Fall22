package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JPanel is the "base class". GUIPanel is the "derived" class.

public class GUIPanel extends JPanel {
    private JTextField zipcode;
    private JButton submit;
    private JTextArea output;

    private Database db; // The zipcode database
    private JButton northernmost;

    public GUIPanel() {
        // initialize the instance data
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode);

        this.submit = new JButton("Submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener());

        this.output = new JTextArea(5,20);
        this.add(this.output);

        this.db = new Database(); // load the zipcodes

        this.northernmost = new JButton("Northernmost");
        this.add(this.northernmost);
        this.northernmost.addActionListener(new getNorthern());

    }

    // defining a class inside of a class
    class SubmitButtonListener implements ActionListener {
        // function will get called when the user presses submit
        public void actionPerformed(ActionEvent e) {
            // get the zipcode out of the text field
            String code = zipcode.getText();
            Zipcode zc = db.search(code);
            WeatherObservation wob = zc.getWeatherData();
            output.setText(wob.toString());
        }

    }
}
