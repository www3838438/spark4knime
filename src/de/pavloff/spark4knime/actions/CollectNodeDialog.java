package de.pavloff.spark4knime.actions;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;

/**
 * <code>NodeDialog</code> for the "Collect" Node. Collect all the elements of
 * the RDD as a table
 * 
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more
 * complex dialog please derive directly from
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author Oleg Pavlov, University of Heidelberg
 */
public class CollectNodeDialog extends DefaultNodeSettingsPane {

	/**
	 * New pane for configuring Collect node dialog. No options are required.
	 */
	protected CollectNodeDialog() {
		super();
	}
}
