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
    }
    
    public static void fitGraph(GraphControl graphControl) {
        graphControl.fitGraphBounds();
    }
    
    public static void enabledCreatedEntityOnGraph(boolean isEnabled) {
        graphEditorInputMode.setCreateBendAllowed(isEnabled);
        graphEditorInputMode.setCreateEdgeAllowed(isEnabled);
        graphEditorInputMode.setCreateNodeAllowed(isEnabled);
    }

    public static boolean isAllowedCreateNode() {
        return graphEditorInputMode.isCreateNodeAllowed();
    }
}