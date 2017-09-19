import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button btnExit =new Button("exit");
    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setBounds(100,120,400,300);
        this.add(btnExit);
        this.setLayout(null);
        btnExit.setBounds(50,80,80,30);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}