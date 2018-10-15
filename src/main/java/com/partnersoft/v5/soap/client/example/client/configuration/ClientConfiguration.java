
package com.partnersoft.v5.soap.client.example.client.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.partnersoft.v5.soap.client.example.client.SoapClient;

/**
 * Configuration for the soap client.
 * <br><br>
 * @author Lane Chasteen
 */
@Configuration
public class ClientConfiguration {
	//-- properties --//
	//-- constructors --//
	
	/**
	 * Returns the {@link Jaxb2Marshaller}.
	 * @return {@link Jaxb2Marshaller}.
	 */
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("com.partnersoft.v5.soap.client.example.multispeak.model");
		return marshaller;
	}

	/**
	 * Returns the {@link SoapClient}.
	 * @param marshaller - {@link Jaxb2Marshaller} for the client.
	 * @return {@link SoapClient}.
	 */
	@Bean
	public SoapClient getSoapClient(Jaxb2Marshaller marshaller) {
		SoapClient client = new SoapClient(marshaller);
		client.setDefaultUri(SoapClient.getMultiSpeakServer());
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
