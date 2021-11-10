/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umlgenerator;

import com.yworks.yfiles.geometry.IRectangle;
import com.yworks.yfiles.geometry.InsetsD;
import com.yworks.yfiles.graph.IColumn;
import com.yworks.yfiles.graph.IGraph;
import com.yworks.yfiles.graph.INode;
import com.yworks.yfiles.graph.IRow;
import com.yworks.yfiles.graph.ITable;
import com.yworks.yfiles.graph.Table;
import com.yworks.yfiles.graph.styles.TableNodeStyle;
import com.yworks.yfiles.view.GraphControl;

/**
 *
 * @author charl
 */
public class Entity {
   
    public static void createTable(GraphControl graphControl) {
        IGraph graph = graphControl.getGraph();
        ITable table = new Table();
        IColumn col1 = table.createColumn(200);
        IRow row1 = table.createRow();
        
        table.getRowDefaults().setInsets(new InsetsD(30, 5, 30, 5));
        table.getColumnDefaults().setInsets(new InsetsD(5, 30, 5, 30));
        TableNodeStyle tableNodeStyle = new TableNodeStyle(table);
        INode tableNode = graph.createGroupNode();
        graph.setStyle(tableNode, tableNodeStyle);
        IRectangle tableLayout = table.getLayout();
        
        table.addLabel(col1, "Column 1");
        table.addLabel(row1, "Row 1");
        graph.setNodeLayout(tableNode, tableLayout.toRectD());
    }
}
