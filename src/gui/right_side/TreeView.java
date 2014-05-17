package gui.right_side;

import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.JScrollPane;
import org.fife.rsta.ac.xml.tree.XmlOutlineTree;

public class TreeView extends AbstractView {

    public TreeView() {
        super();
        init();
    }

    @Override
    public void parse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void init() {
        view = new XmlOutlineTree();
        label.setText("TreeView");
        scrollPane = new JScrollPane(view);
        ((JScrollPane) scrollPane).setViewportView(view);
        super.add(scrollPane, BorderLayout.CENTER);
    }    

    @Override
    public void btnExitPressed() throws IOException {
         this.notifyObservers();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
