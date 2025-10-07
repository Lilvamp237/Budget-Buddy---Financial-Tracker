import financegui.Login1;  // import your Login1 class

public class App {
    public static void main(String[] args) {
        // Launch the GUI on the Event Dispatch Thread
        javax.swing.SwingUtilities.invokeLater(() -> {
            new Login1().setVisible(true);
        });
    }
}
