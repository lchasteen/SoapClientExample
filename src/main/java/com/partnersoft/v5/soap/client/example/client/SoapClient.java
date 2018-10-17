package com.partnersoft.v5.soap.client.example.client;

import java.io.IOException;
import java.util.Iterator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceMessageExtractor;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.support.MarshallingUtils;

import com.partnersoft.v5.soap.client.example.client.header.MultiSpeakHeader;
import com.partnersoft.v5.soap.client.example.multispeak.model.GetMethods;
import com.partnersoft.v5.soap.client.example.multispeak.model.GetMethodsResponse;
import com.partnersoft.v5.soap.client.example.multispeak.model.MultiSpeakMsgHeader;
import com.partnersoft.v5.soap.client.example.multispeak.model.PingURL;
import com.partnersoft.v5.soap.client.example.multispeak.model.PingURLResponse;
import com.partnersoft.v5.soap.client.example.multispeak.model.StakedWorkOrderNotification;
import com.partnersoft.v5.soap.client.example.multispeak.model.StakedWorkOrderNotificationResponse;


/**
 * {@link WebServiceGatewaySupport} for the soap client.
 * <br><br>
 * @author Lane Chasteen
 * 
 */
public class SoapClient extends WebServiceGatewaySupport {
	//-- logging --//
	private static final Logger log = LoggerFactory.getLogger(SoapClient.class);

	//-- properties --//
	private static final String MULTI_SPEAK_SERVER = "http://localhost:8086/ws";

	private final Jaxb2Marshaller marshaller;

	/**
	 * Creates a new SoapClient.
	 * @param marshaller - {@link Jaxb2Marshaller} for marshalling and unmarshalling messages.
	 */
	//-- constructors --//
	public SoapClient(Jaxb2Marshaller marshaller) {
		this.marshaller = marshaller;
	}

	//-- SoapClient methods --//
	/**
	 * Returns the {@link PingURLResponse} from a ping request.
	 * @return {@link PingURLResponse} from a ping request.
	 */
	public PingURLResponse pingService() {
		PingURL request = new PingURL();
		MultiSpeakMsgHeader header = new MultiSpeakMsgHeader();
		// Simple example of getting an object from the web service template.
		PingURLResponse response = (PingURLResponse) getWebServiceTemplate()
				.marshalSendAndReceive(getMultiSpeakServer() + "/PingURL", request,
						new MultiSpeakHeader(header,getSoapAction("PingURL")));

		return response;
	}

	/**
	 * Returns the {@link GetMethodsResponse} from a {@link GetMethods} request.
	 * @return {@link GetMethodsResponse} from a {@link GetMethods} request or {@code null}.
	 */
	public GetMethodsResponse getMethods() {
		final GetMethods requestPayload = new GetMethods();
		ResponseAndHeader<GetMethodsResponse> rah = getResponse("GetMethods", requestPayload, GetMethodsResponse.class);
		if (rah == null) {
			return null;
		}
		return rah.getData();
	}
	
	
	public StakedWorkOrderNotificationResponse getStakedWorkOrderNotification() {
		StakedWorkOrderNotification swan = getWorkOrderNotification();
		
		ResponseAndHeader<StakedWorkOrderNotificationResponse> rah = getResponse("GetStakedWorkOrderNotification", swan, StakedWorkOrderNotificationResponse.class);
		if (rah == null) {
			return null;
		}
		return rah.getData();
	}

	/**
	 * Returns the {@link StakedWorkOrderNotification} from the class path file.
	 * @return The {@link StakedWorkOrderNotification} from the class path file.
	 */
	private StakedWorkOrderNotification getWorkOrderNotification() {
		StakedWorkOrderNotification result = null;
		try {

			SOAPMessage message = MessageFactory.newInstance().createMessage(null,  new ClassPathResource("44444444444_SWON_request.xml").getInputStream());
			// Get body
			JAXBContext jaxbContext = JAXBContext.newInstance("com.partnersoft.v5.soap.client.example.multispeak.model");
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			result = (StakedWorkOrderNotification) jaxbUnmarshaller.unmarshal(message.getSOAPBody().extractContentAsDocument());
		}
		catch (IOException e) {
			log.error("Unable to locate source xml file.", e);
		}
		catch (JAXBException | SOAPException e1) {
			log.error("Unable to parse xml file.", e1);
		}

		return result;
	}
	
	/**
	 * Returns the full sURL path string with the appended soap action
	 * @param action - The Soap action to perform.
	 * @return The full URL path string with the appended soap action
	 */
	public static String getSoapAction(String action) {
		return "http://www.multispeak.org/Version_3.0/" + action;
	}

	/**
	 * Returns the server URL.
	 * @return The server URL.
	 */
	public static String getMultiSpeakServer() {
		return MULTI_SPEAK_SERVER;
	}

	/**
	 * Returns the {@link MultiSpeakMsgHeader} from the request {@link SaajSoapMessage}.
	 * @param message {@link SaajSoapMessage} for the header.
	 * @return he {@link MultiSpeakMsgHeader} from the request {@link SaajSoapMessage} or
	 * {@code null} if there is a problem getting the header.
	 */
	static MultiSpeakMsgHeader getMultiSpeakMsgHeaderFromMessage(SaajSoapMessage message) {
		MultiSpeakMsgHeader headerMessage = null;
		if (message == null) {
			return null;
		}

		org.springframework.ws.soap.SoapHeader requestHeader = message.getSoapHeader();

		if (requestHeader == null) {
			return null;
		}

		Iterator<SoapHeaderElement> se = requestHeader.examineAllHeaderElements();
		Unmarshaller unmarshaller = null;
		try {
			JAXBContext context = JAXBContext.newInstance(MultiSpeakMsgHeader.class);
			unmarshaller = context.createUnmarshaller();
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage());
			return null;
		}

		while(se.hasNext()) {
			SoapHeaderElement el = se.next();
			if (el == null) {
				continue;
			}

			if (unmarshaller == null) {
				break;
			}

			try {
				JAXBElement<MultiSpeakMsgHeader> element = 
						unmarshaller.unmarshal(el.getSource(), MultiSpeakMsgHeader.class);
				if (element != null) {
					headerMessage = element.getValue();
					break;
				}
			}
			catch (Exception e) {
				log.error(e.getLocalizedMessage());
			}
		}

		return headerMessage;
	}

	/**
	 * Returns {@link ResponseAndHeader} response with the header and response object from the soap request.
	 * @param <T> - The com.partnersoft.v5.soap.client.example.multispeak.model payload object to send.
	 * @param <V> - The com.partnersoft.v5.soap.client.example.multispeak.model response object as the response.
	 * @param soapMessage - The end point message handler.
	 * @param payload - The multispeak object to marshal. 
	 * @param clazz - The class for the response object. 
	 * @return {@link GetMethodsResponse} from a {@link GetMethods} request.
	 */
	private <T, V> ResponseAndHeader<V> getResponse (String soapMessage, T payload, Class<V> clazz) {
		final Jaxb2Marshaller thisMarshaller = marshaller;
		return getWebServiceTemplate().sendAndReceive(
				getMultiSpeakServer() + "/" + soapMessage,
				// Request
				 new WebServiceMessageCallback() {
					  @Override
				      public void doWithMessage(WebServiceMessage message) throws IOException {
				    	  if (message != null) {
								MarshallingUtils.marshal(thisMarshaller, payload, message);
							}
				      }
				 },
				// Response
				new WebServiceMessageExtractor<ResponseAndHeader<V>>() {

					@Override
					public ResponseAndHeader<V> extractData(WebServiceMessage message)
							throws IOException {
						if (message instanceof SaajSoapMessage) {
							SaajSoapMessage smRequest = (SaajSoapMessage) message;
							MultiSpeakMsgHeader requestHeader = getMultiSpeakMsgHeaderFromMessage(smRequest);
							System.out.println(requestHeader.getAppName());
							System.out.println(requestHeader.getAppVersion());
							
							Object obj = MarshallingUtils.unmarshal(thisMarshaller, message);
							if (obj.getClass() == clazz) {
								return new ResponseAndHeader<>(requestHeader, clazz.cast(obj));
							}
						}
						return null;
					}
				
				});
	}
	
	//-- Inner class definition --//
	/**
	 * Container class for the {@link MultiSpeakMsgHeader} and the <T> Soap response object.
	 * <br><br>
	 * Copyright 2018 Partner Software, Inc.
	 * @author Lane Chasteen
	 * @param <T> - The com.partnersoft.v5.soap.client.example.multispeak.model response object as the response.
	 */
	public class ResponseAndHeader<T> {
		//-- properties --//
		private final T t;
		private final MultiSpeakMsgHeader header;
		
		//-- constructors --//
		/**
		 * Creates a new ResponseAndHeader object.
		 * @param header - {@link MultiSpeakMsgHeader} response header.
		 * @param t - The multispeak response object.
		 */
		public ResponseAndHeader(MultiSpeakMsgHeader header, T t) {
			this.header = header;
			this.t = t;
		}
		
		//-- ResponseAndHeader methods --//
		/**
		 * Returns the {@link MultiSpeakMsgHeader} response header.
		 * @return {@link MultiSpeakMsgHeader} response header.
		 */
		public MultiSpeakMsgHeader getHeader() {
			return header;
		}
		
		/**
		 * Returns the Soap response object data.
		 * @return The Soap response object data.
		 */
		public T getData() {
			return t;
		}
	}
}
