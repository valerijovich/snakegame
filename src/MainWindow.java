import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Snake");
        setSize(320,320);
        setLocation(400,400);

        add(new GameField());

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
