package views;



import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MainWindow extends JFrame {
    JLabel mainLabel;
    AedgePanel aedgePanel;
    BedgePanel bedgePanel;
    CedgePanel cedgePanel;
    VolumePanel volumePanel;
    ButtonsPanel buttonsPanel;

    public MainWindow() {
        this.mainLabel = new JLabel("Paralelepiedon térfogata");
        this.aedgePanel = new AedgePanel();
        this.bedgePanel = new BedgePanel();
        this.cedgePanel = new CedgePanel();
        this.volumePanel = new VolumePanel();
        this.buttonsPanel = new ButtonsPanel();

        this.initComponent();
        this.initWindow();
    }
    
    public void initComponent() {

    }

    public void initWindow() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.addComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public void addComponents() {
        this.add(this.mainLabel);
        this.add(this.aedgePanel);
        this.add(this.bedgePanel);
        this.add(this.cedgePanel);
        this.add(this.buttonsPanel);
        this.add(this.volumePanel);
    }
}
