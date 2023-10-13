import javax.swing.*;

public class HomePage extends JFrame{
    private JPanel Panel;
    private JButton loginButton;
    private JButton term1Button;
    private JButton term2Button;
    private JLabel Lweclomemessage;
    private JButton term3Button;
    private JButton term4Button;
    private JButton analysisButton;
    private JLabel LPurpose;
    private JLabel Lpic2;
    private JLabel Lpic1;

    public HomePage() {
        setContentPane(Panel);
        setTitle("Home Page");
        setSize(1980, 1080);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }
    public static void main(String[] args) {
        HomePage Frame = new HomePage();
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        Lpic2 = new JLabel(new ImageIcon("download.jpg"));
        Lpic1 = new JLabel(new ImageIcon("educ.jpg"));
    }
}
