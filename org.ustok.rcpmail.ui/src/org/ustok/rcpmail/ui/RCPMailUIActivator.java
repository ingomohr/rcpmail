/******************************************************
 * Copyright 2015 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.rcpmail.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * Activator of the plug-in.
 * 
 * @author ingomohr
 * @created May 27, 2015
 */
public class RCPMailUIActivator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "org.ustok.rcpmail.ui"; //$NON-NLS-1$

	private static RCPMailUIActivator plugin;

	/**
	 * The constructor
	 */
	public RCPMailUIActivator() {
	}

	@Override
	public void start(BundleContext pContext) throws Exception {
		super.start(pContext);
		plugin = this;
	}

	@Override
	public void stop(BundleContext pContext) throws Exception {
		plugin = null;
		super.stop(pContext);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance. Never <code>null</code> once plug-in is running.
	 */
	public static RCPMailUIActivator getDefault() {
		return plugin;
	}

}
