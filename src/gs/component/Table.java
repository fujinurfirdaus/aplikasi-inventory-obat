package gs.component;

//import com.fuji.model.StatusType;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fuji Nur Firdaus
 */
public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(22);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                if (i1 == 4) {
                    header.setHorizontalAlignment(JLabel.LEADING);
                    setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
               
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    
                    if (selected) {
//                        com.setForeground(new Color(255,255,255));
                        com.setBackground(new Color(45,149,150));
                    } else {
                        com.setForeground(new Color(102, 102, 102));
                    }
                    return com;
                
            }
        });
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }

    void setText(String b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
