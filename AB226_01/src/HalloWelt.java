
import java.awt.*;
import javax.swing.*;


/**HalloWelt
 * Java HelloWorld Klasse.
 *
 * @author  Ramon Schenk
 * @version 1.0
 */
public class HalloWelt extends JFrame {
    public HalloWelt() {
        super("Ein erstes Beispiel");

        Icon icon = new ImageIcon(getClass().getResource("duke1.gif"));
        JLabel label = new JLabel("HalloWelt!",icon ,JLabel.CENTER);
        add(label);
        Font schrift = new Font("SansSerif", Font.BOLD, 20);
        label.setFont(schrift);
        label.setForeground(Color.red);
        label.setBackground(Color.white);
        label.setOpaque(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HalloWelt();
    }

}