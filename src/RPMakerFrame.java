import javax.management.Descriptor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPMakerFrame extends JFrame {

    //Main Panel
    JPanel MainPanel;
    JLabel Title;


    //Data Entry
    JPanel DataPanel;

    JPanel NamePanel;
    JTextField NameField;
    JLabel NameLabel;

    JPanel DescPanel;
    JTextField DescField;
    JLabel DescLabel;

    JPanel IDPanel;
    JTextField IDField;
    JLabel IDLabel;

    JPanel CostPanel;
    JTextField CostField;
    JLabel CostLabel;

    JPanel RecPanel;
    JTextField RecField;
    JLabel RecLabel;


    //Buttons
    JPanel BtnPanel;
    JButton AddBtn;
    JButton QuitBtn;

    //ActionListener
    int RecordsAdded = 0;
    String NameStr;
    String DescStr;
    String IDStr;


    public RPMakerFrame() throws HeadlessException {
        //Create the main panel and the title
        MainPanel = new JPanel(new BorderLayout());
        Title = new JLabel("Product Maker", SwingConstants.CENTER);
        Title.setFont(new Font("Consolas", Font.BOLD, 24));
        //Create the other panels to be added to the main panel
        createDataPanel();
        createBtnPanel();
        //Add the title and panels to main panel with borderlayout organization
        MainPanel.add(Title, BorderLayout.NORTH);
        MainPanel.add(DataPanel, BorderLayout.CENTER);
        MainPanel.add(BtnPanel, BorderLayout.SOUTH);
        //add the main panel to the frame
        add(MainPanel);
    }

    private void createDataPanel() {
        //Create Data Panel and its sub-panels for organization
        DataPanel = new JPanel();
        DataPanel.setLayout(new BoxLayout(DataPanel, BoxLayout.Y_AXIS));
        NamePanel = new JPanel(); //No layout for Sub-Panels as we want the default FlowLayout
        DescPanel = new JPanel();
        IDPanel = new JPanel();
        CostPanel = new JPanel();
        RecPanel = new JPanel();
        //Enter the values for the Components
        NameField = new JTextField(35);
        NameField.setDocument(new JTextFieldLimit(35));
        NameLabel = new JLabel("Name:");
        DescField = new JTextField(75);
        DescField.setDocument(new JTextFieldLimit(75));
        DescLabel = new JLabel("Description:");
        IDField = new JTextField(6);
        IDField.setDocument(new JTextFieldLimit(6));
        IDLabel = new JLabel("ID:");
        CostField = new JTextField(10);
        CostField.setDocument(new JTextFieldLimit(10));
        CostLabel = new JLabel("Cost:");
        RecField = new JTextField(String.valueOf(RecordsAdded), 3);
        RecLabel = new JLabel("Records Added:");
        //Add Components to Sub-panels
        NamePanel.add(NameLabel);
        NamePanel.add(NameField);
        DescPanel.add(DescLabel);
        DescPanel.add(DescField);
        IDPanel.add(IDLabel);
        IDPanel.add(IDField);
        CostPanel.add(CostLabel);
        CostPanel.add(CostField);
        RecPanel.add(RecLabel);
        RecPanel.add(RecField);
        //Add Sub-Panels to Data Panel
        DataPanel.add(IDPanel);
        DataPanel.add(NamePanel);
        DataPanel.add(DescPanel);
        DataPanel.add(CostPanel);
        DataPanel.add(RecPanel);
    }

    private void createBtnPanel() {
        //Create the Btn Panel and The buttons with their action listeners
        BtnPanel = new JPanel();
        QuitBtn = new JButton("Quit");
        QuitBtn.addActionListener((ActionEvent ae) -> {System.exit(0);});
        AddBtn = new JButton("Add");
        AddBtn.addActionListener(new ButtonListener());
        //Add buttons to the panel
        BtnPanel.add(QuitBtn);
        BtnPanel.add(AddBtn);
    }

    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Get string and make it proper length
            NameStr = NameField.getText();
            while (NameStr.length() < 35){
                NameStr = NameStr + " ";

            }

            //test output
            System.out.println(NameStr + " " + NameStr.length());

            //Add Record to counter
            RecordsAdded++;
            RecField.setText(String.valueOf(RecordsAdded));
        }
    }
}
