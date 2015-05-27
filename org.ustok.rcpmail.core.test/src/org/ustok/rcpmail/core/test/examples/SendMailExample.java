/******************************************************
 * Copyright 2015 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.rcpmail.core.test.examples;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Example for sending an e-mail.
 * 
 * @author ingomohr
 * @created May 27, 2015
 */
public class SendMailExample {

	public static void main(String[] args) {
		Properties props = System.getProperties();
		props.setProperty("mail.smtp.host", "aspmx.l.google.com");

		Session session = Session.getDefaultInstance(props);

		System.out.println("Creating message...");
		MimeMessage msg = new MimeMessage(session);

		final String from = "enternamehere@gmail.com";
		final String to = "enternamehere@gmail.com";

		try {
			msg.setFrom(from);
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));

			msg.setSubject("Some subject");

			// note: for HTML content use msg.setContent instead
			msg.setText("Test message\n\nHello World!");

			System.out.println("Sending message...");
			Transport.send(msg);

			System.out.println("Sent message successfully!");
		} catch (MessagingException ex) {
			ex.printStackTrace();
		}

	}

}
