import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button btnExit =new Button("exit");
    private Button btnAdd =new Button("Add");
    private Label lab =new Label("0");
    private int n=0;
    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setBounds(100,120,400,300);
        this.add(btnExit);
        this.add(btnAdd);
        this.add(lab);
        this.setLayout(null);
        btnExit.setBackground(new Color(255, 133, 59));
        btnAdd.setBackground(new Color(255, 120, 121));
        btnExit.setBounds(150,80,80,30);
        btnAdd.setBounds(150,110,80,30);
        lab.setBounds(150,200,80,30);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              n++;
              lab.setText(Integer.toString(n));
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