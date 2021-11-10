/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package umlgenerator;

import com.yworks.yfiles.geometry.IRectangle;
import com.yworks.yfiles.geometry.InsetsD;
import com.yworks.yfiles.geometry.PointD;
import com.yworks.yfiles.geometry.RectD;
import com.yworks.yfiles.graph.IBend;
import com.yworks.yfiles.graph.IColumn;
import com.yworks.yfiles.graph.IEdge;
import com.yworks.yfiles.graph.IGraph;
import com.yworks.yfiles.graph.ILabel;
import com.yworks.yfiles.graph.INode;
import com.yworks.yfiles.graph.IPort;
import com.yworks.yfiles.graph.IRow;
import com.yworks.yfiles.graph.ITable;
import com.yworks.yfiles.graph.Table;
import com.yworks.yfiles.graph.portlocationmodels.FreeNodePortLocationModel;
import com.yworks.yfiles.graph.styles.TableNodeStyle;
import com.yworks.yfiles.view.GraphControl;
import com.yworks.yfiles.view.input.GraphEditorInputMode;
import com.yworks.yfiles.view.input.MoveViewportInputMode;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;


/**
 * FXML Controller class
 *
 * @author charl
 */
public class FXMLController  {
    public GraphControl graphControl;
    
    public void initialize() {
      // Called by the JavaFX framework on loading.
      graphControl.setInputMode(new GraphEditorInputMode());
    }

    public void onLoaded() {
        // Called right after stage is loaded.
        graphControl.fitGraphBounds();
    }

    public void handleOpenFolderAction(ActionEvent event) {
        System.out.println("Hello, open folder!");
    }

    public void handleExportAction(ActionEvent event) {
        ImageExport imageExport = new ImageExport();
        imageExport.exportToJpg(graphControl, "exported");
    }

    
    public void handleCreateEntityAction(ActionEvent event) {
        Entity entity = new Entity();
        entity.createTable(graphControl);
    }

    public void handleRelation1to1(ActionEvent event) {
        System.out.println("Hello, set relation!");
    }

    public void handleRelation1toN(ActionEvent event) {
        System.out.println("Hello, set relation 2!");
    }

    public void handleRelation1NtoM(ActionEvent event) {
        System.out.println("Hello, set relation 3!");
    }
}