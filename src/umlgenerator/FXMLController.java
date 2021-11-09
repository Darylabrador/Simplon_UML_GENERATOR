/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package umlgenerator;

import com.yworks.yfiles.geometry.PointD;
import com.yworks.yfiles.geometry.RectD;
import com.yworks.yfiles.graph.IBend;
import com.yworks.yfiles.graph.IEdge;
import com.yworks.yfiles.graph.IGraph;
import com.yworks.yfiles.graph.ILabel;
import com.yworks.yfiles.graph.INode;
import com.yworks.yfiles.graph.IPort;
import com.yworks.yfiles.graph.portlocationmodels.FreeNodePortLocationModel;
import com.yworks.yfiles.view.GraphControl;
import java.net.URL;
import java.util.ResourceBundle;
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
    IGraph graph = graphControl.getGraph();

    INode node1 = graph.createNode(new RectD(0, 0, 30, 30));
    INode node2 = graph.createNode(new RectD(100, 0, 30, 30));
    INode node3 = graph.createNode(new RectD(300, 300, 60, 30));

    IEdge edge1 = graph.createEdge(node1, node2);
    IEdge edge2 = graph.createEdge(node2, node3);

    IBend bend1 = graph.addBend(edge2, new PointD(330, 15));

    IPort portAtNode1 = graph.addPort(node1);
    IPort portAtNode3 = graph.addPort(node3, FreeNodePortLocationModel.NODE_LEFT_ANCHORED);
    IEdge edgeAtPorts = graph.createEdge(portAtNode1, portAtNode3);

    ILabel ln1 = graph.addLabel(node1, "n1");
    ILabel ln2 = graph.addLabel(node2, "n2");
    ILabel ln3 = graph.addLabel(node3, "n3");
    ILabel le3 = graph.addLabel(edgeAtPorts, "Edge at Ports");
  }

  public void onLoaded() {
    // Called right after stage is loaded.
    graphControl.fitGraphBounds();
  }
}