package com.partnersoft.v5.soap.client.example.client.header;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.TransformerException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

import com.partnersoft.v5.soap.client.example.multispeak.model.MultiSpeakMsgHeader;
import com.partnersoft.v5.soap.client.example.multispeak.model.ObjectFactory;

/**
 * {@link WebServiceMessageCallback} for the {@link MultiSpeakMsgHeader} object.
 * Allows for custom {@link MultiSpeakMsgHeader} messages.
 * <br><br>
 * Copyright 2017 Partner Software, Inc.
 * @author Lane Chasteen
 */
public class MultiSpeakHeader implements WebServiceMessageCallback {
	//-- properties --//
	private final MultiSpeakMsgHeader header;
	private final String soapAction;

	//-- constructors --//
	/**
	 * Created a new MultiSpeakHeader.
	 * @param header - {@link MultiSpeakMsgHeader} message.
	 * @param soapAction - Soap action to set in message
	 */
	public MultiSpeakHeader(MultiSpeakMsgHeader header, String soapAction) {
		this.header = header;
		this.soapAction = soapAction;
	}

	//-- WebServiceMessageCallback methods --//
	/**
	 * Adds the {@link MultiSpeakMsgHeader} to the {@link WebServiceMessage}.
	 * @throws TransformerException if there is a problem during the marshalling process of
	 * the header.
	 */
	@Override
	public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
		SoapHeader soapHeader = ((SoapMessage) message).getSoapHeader();
		SoapMessage soapMessage = ((SoapMessage) message);
		soapMessage.setSoapAction(soapAction);
	
		try {
			JAXBContext context = JAXBContext.newInstance("com.partnersoft.v5.soap.client.example.multispeak.model");
			ObjectFactory objectFactory = new ObjectFactory();
			JAXBElement<MultiSpeakMsgHeader> je = objectFactory.createMultiSpeakMsgHeader(header);
			Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(je, soapHeader.getResult());
		} 
		catch (JAXBException e) {
			throw new IOException("error while marshalling authentication.", e);
		}
	}
}
