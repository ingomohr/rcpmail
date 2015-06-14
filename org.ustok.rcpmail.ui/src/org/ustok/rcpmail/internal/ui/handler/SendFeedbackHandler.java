/******************************************************
 * Copyright 2015 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.rcpmail.internal.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

/**
 * UI Handler to send feedback.
 * 
 * @author ingomohr
 * @created Jun 14, 2015
 */
public class SendFeedbackHandler extends AbstractHandler {

	public SendFeedbackHandler() {
		setEnabled(true);
	}

	@Override
	public Object execute(ExecutionEvent pEvent) throws ExecutionException {
		System.out.println("Go, Feedback, go!");

		// TODO Auto-generated method stub
		return null;
	}

}
