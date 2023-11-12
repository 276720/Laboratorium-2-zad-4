import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertButton implements ActionListener {
    Convert convert = new Convert();
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        convert.convertUnits();
    }
}

