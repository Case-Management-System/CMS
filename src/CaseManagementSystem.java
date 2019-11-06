/**
 *
 * @author s177229
 */
public class CaseManagementSystem {
    
    public static void main(String[] args) {

        CMSModel model = new CMSModel();
        CMSController control = new CMSController();
        CMSView view = new CMSView();

        control.setModel(model);
        control.setView(view);
        view.setController(control);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                view.setVisible(true);
            }
        });
    }
    
}
