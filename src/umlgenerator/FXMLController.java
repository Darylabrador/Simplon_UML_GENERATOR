/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package umlgenerator;

import com.yworks.yfiles.view.GraphControl;
import com.yworks.yfiles.view.input.ICommand;
import javafx.event.ActionEvent;


/**
 * FXML Controller class
 *
 * @author charl
 */
public class FXMLController  {
    public GraphControl graphControl;
    
    public void initialize() {
        graphControl.setFileIOEnabled(true);
        Graph.setGraphEditorInputMode(graphControl);
    }

    public void onLoaded() {
        Graph.fitGraph(graphControl);
    }

    public void handleOpenFolderAction(ActionEvent event) {
        Graph.enabledInteractionBetweenNodes(false);
        ICommand.OPEN.execute(null, graphControl);
    }

    public void handleExportAction(ActionEvent event) {
        Graph.enabledInteractionBetweenNodes(false);
        ImageExport.exportToJpg(graphControl, "exported_file");
    }

    public void handleCreateEntityAction(ActionEvent event) { 
        Graph.enabledInteractionBetweenNodes(false);
        Graph.enabledCreatedEntityOnGraph(graphControl); 
    }

    public void handleRelation1to1(ActionEvent event) { 
        Graph.enabledInteractionBetweenNodes(true);
    }

    public void handleRelation1toN(ActionEvent event) {
        Graph.enabledInteractionBetweenNodes(true);
    }

    public void handleRelation1NtoM(ActionEvent event) {
        Graph.enabledInteractionBetweenNodes(true);
    }
}