import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class RPMakerFrame extends JFrame {

    //Main Panel
    JPanel MainPanel;

    //Data Entry
    JPanel DataPanel;
    JTextField NameField;
    JLabel NameLabel;
    JTextField DescField;
    JLabel DescLabel;
    JTextField IDField;
    JLabel IDLabel;

    //Buttons
    JPanel BtnPanel;
    JButton AddBtn;
    JButton QuitBtn;

    public RPMakerFrame() throws HeadlessException {
        MainPanel = new JPanel(new BorderLayout());
        createDataPanel();
        createBtnPanel();
        MainPanel.add(DataPanel, BorderLayout.CENTER);
        MainPanel.add(BtnPanel, BorderLayout.SOUTH);
        add(MainPanel);
    }

    private void createDataPanel() {
        DataPanel = new JPanel();
        DataPanel.setLayout(new BoxLayout(DataPanel, BoxLayout.Y_AXIS));
        NameField = new JTextField();
        DescField = new JTextField();
        IDField = new JTextField();
        DataPanel.add(NameField);
        DataPanel.add(DescField);
        DataPanel.add(IDField);



    }

    private void createBtnPanel() {
        BtnPanel = new JPanel();
        QuitBtn = new JButton("Quit");
        QuitBtn.addActionListener((ActionEvent ae) -> {System.exit(0);});
        AddBtn = new JButton("Add");
        BtnPanel.add(QuitBtn);
        BtnPanel.add(AddBtn);
    }
}
