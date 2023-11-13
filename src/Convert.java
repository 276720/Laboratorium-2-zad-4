import javax.swing.*;

public class Convert{

    public void convertUnits() {

        String selectedInputUnit = (String) UnitConverterApp.getUnitInput().getSelectedItem();
        String selectedOutputUnit = (String) UnitConverterApp.getUnitOutput().getSelectedItem();
        double inputValue = Double.parseDouble(UnitConverterApp.getValueInput().getText());

        double result = 0.0;

        if (selectedInputUnit.equals("kg") && selectedOutputUnit.equals("g")) {
            result = inputValue * 1000;
        } else if (selectedInputUnit.equals("g") && selectedOutputUnit.equals("kg")) {
            result = inputValue / 1000;
        } else if (selectedInputUnit.equals("kg") && selectedOutputUnit.equals("t")) {
            result = inputValue /1000;
        } else if (selectedInputUnit.equals("t") && selectedOutputUnit.equals("kg")) {
            result = inputValue * 1000;
        }else if (selectedInputUnit.equals("g") && selectedOutputUnit.equals("t")) {
            result = inputValue / 1000000;
        }else if (selectedInputUnit.equals("t") && selectedOutputUnit.equals("g")) {
            result = inputValue * 1000000;
        } else {
            result = inputValue;
        }

        UnitConverterApp.getResultLabel().setText("Wynik: " + result + " " + selectedOutputUnit);
    }
}
