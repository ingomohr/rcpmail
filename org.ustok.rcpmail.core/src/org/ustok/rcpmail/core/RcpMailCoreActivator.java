/******************************************************
 * Copyright 2015 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.rcpmail.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Activator of the plug-in.
 * 
 * @author ingomohr
 * @created May 27, 2015
 */
public class RcpMailCoreActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	@Override
	public void start(BundleContext pBundleContext) throws Exception {
		RcpMailCoreActivator.context = pBundleContext;
	}

	@Override
	public void stop(BundleContext pBundleContext) throws Exception {
		RcpMailCoreActivator.context = null;
	}

}
