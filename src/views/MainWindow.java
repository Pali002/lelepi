package views;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
    AedgePanel aedgePanel;
    BedgePanel bedgePanel;
    CedgePanel cedgePanel;

    public MainWindow() {
        this.aedgePanel = new AedgePanel();
        // this.bedgePanel = new BedgePanel();
        // this.cedgePanel = new CedgePanel();
        this.initWindow();

        // this.add(this.bedgePanel);
        // this.add(this.cedgePanel);
    }

    public void initWindow() {
        this.addComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public void addComponents() {
        this.add(this.aedgePanel);
    }
}
