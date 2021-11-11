/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umlgenerator;

import static com.yworks.yfiles.algorithms.LoggingUtil.log;
import com.yworks.yfiles.utils.IEventHandler;
import com.yworks.yfiles.view.input.ClickEventArgs;

/**
 *
 * @author charl
 */
public class Canvas {
    public static IEventHandler<ClickEventArgs> clickOnCanvas = (source, args) -> Graph.enabledCreatedEntityOnGraph(false);
}
