/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umlgenerator;

import com.yworks.yfiles.view.GraphControl;
import com.yworks.yfiles.view.input.GraphEditorInputMode;

/**
 *
 * @author charl
 */
public class Graph {
    private static GraphEditorInputMode graphEditorInputMode = new GraphEditorInputMode();
    
    public static void setGraphEditorInputMode(GraphControl graphControl) {
        graphControl.setInputMode(graphEditorInputMode);
        enabledCreateNode(false);
        enabledInteractionBetweenNodes(false);
    }
    
    public static void fitGraph(GraphControl graphControl) {
        graphControl.fitGraphBounds();
    }
    
    public static void enabledCreatedEntityOnGraph(GraphControl graphControl) {
        Entity.createTable(graphControl);
    }
    
    public static void enabledCreateNode(boolean isEnabled) {
        graphEditorInputMode.setCreateNodeAllowed(isEnabled);
    }
    
    public static void enabledInteractionBetweenNodes(boolean isEnabled){
        graphEditorInputMode.setCreateBendAllowed(isEnabled);
        graphEditorInputMode.setCreateEdgeAllowed(isEnabled);
    }
    
    public static boolean isAllowedCreateNode() {
        return graphEditorInputMode.isCreateNodeAllowed();
    }
}