package views;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TitlePanel extends JPanel{
    JLabel mainLabel;

    public TitlePanel() {
        this.mainLabel = new JLabel("Paralelepipedon térfogata");
        this.mainLabel.setFont(new Font("Sans serif", Font.BOLD, 28));
        this.mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.mainLabel.setBorder(new EmptyBorder(5,5,5,5));
        
        this.add(this.mainLabel);
    }
}
