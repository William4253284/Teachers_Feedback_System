// Full names : William Mohlahlane
// Student number : 4253284
// Project name: Teachers Fedback System
// Worked with Olebogeng Mokwena, 4273486
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Teachers_Feedback_System extends JFrame {
    private JTextField tfUserName;

    private JButton btnSubmit;
    private JButton btnCancel;
    private JPanel MainPanel;
    private JTextField passwordField1;

    public Teachers_Feedback_System(){
        setContentPane(MainPanel);
        setTitle("Login Page");
        setSize(1980, 1080);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = tfUserName.getText();
                String password = passwordField1.getText();
                try {
                    FileWriter  f = new FileWriter("C:/Users/William/IdeaProjects/sprint 2 Task 2/src/Database.txt",true); // This one creates a file to the given path
                    BufferedWriter b = new BufferedWriter(f);
                    PrintWriter writer = new PrintWriter(b);
                    writer.write("UserName: " + tfUserName.getText() + "\n");
                    writer.write("Password " + passwordField1.getText());
                    writer.write("\n\n");

                    writer.close();
                }
                catch (IOException l) {
                    System.out.println("An error has occured.");
                }
                if ((username.equalsIgnoreCase("William") && password.equals("ok"))) { // Check the password
                    if (e.getSource() == btnSubmit) {
                        new HomePage();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(rootPane,"Wrong Password, TRY AGAIN!!");
                }
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfUserName.setText("");
                passwordField1.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Teachers_Feedback_System myFrame = new Teachers_Feedback_System();
    }
}
