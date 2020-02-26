import javax.swing.JFrame;
 
public class Main extends JFrame{
    public Main(){
        setSize(400, 300);
        setTitle("Developing the First Swing Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 
    public static void main(String[] args) {
        Main demo = new Main( );
        demo.setVisible(true);
    }
}

