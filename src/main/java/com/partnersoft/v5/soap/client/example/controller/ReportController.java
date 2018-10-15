package com.partnersoft.v5.soap.client.example.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.partnersoft.v5.soap.client.example.client.SoapClient;
import com.partnersoft.v5.soap.client.example.multispeak.model.ArrayOfStation;
import com.partnersoft.v5.soap.client.example.multispeak.model.ArrayOfString;
import com.partnersoft.v5.soap.client.example.multispeak.model.ArrayOfWorkOrder;
import com.partnersoft.v5.soap.client.example.multispeak.model.Assembly;
import com.partnersoft.v5.soap.client.example.multispeak.model.AssemblyList;
import com.partnersoft.v5.soap.client.example.multispeak.model.GetMethodsResponse;
import com.partnersoft.v5.soap.client.example.multispeak.model.StakedWorkOrderNotification;
import com.partnersoft.v5.soap.client.example.multispeak.model.Station;
import com.partnersoft.v5.soap.client.example.multispeak.model.WorkOrder;

/**
 * Controller for web MVC reporting.
 * <br><br>
 * @author Lane Chasteen
 */
@Controller
public class ReportController {
	//-- logging --//
	private static final Logger log = LoggerFactory.getLogger(ReportController.class);

	//-- properties --//
	private final SoapClient client;

	//-- constructors --//
	/**
	 * Creates a new ReportController.
	 * @param client - {@link SoapClient} for client calls.
	 */
	@Autowired
	public ReportController(SoapClient client) {
		this.client = client;
	}

	@GetMapping("/report")
	public String greeting(Model model) {
		try {
			client.pingService();
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
		model.addAttribute("name", "PingUrl");
		model.addAttribute("map", Collections.emptyMap());
		return "report";
	}

	@GetMapping("/report/methods")
	public String getMethods(Model model) {
		Map<String, String> result = new HashMap<>();
		try {
			GetMethodsResponse response = client.getMethods();
			model.addAttribute("name", "GetMethods");
			if (response != null) {
				ArrayOfString aos = response.getGetMethodsResult();
				if (aos != null) {
					List<String> ls = aos.getString();
					if (ls != null) {
						for (String s : ls) {
							System.out.println(ls);
							result.put(s, s);
						}
					}
				}
			}
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}

		model.addAttribute("name", "GetMethods");
		model.addAttribute("map", result);
		return "report";
	}


	@GetMapping("/report/sample")
	public String getSample(Model model) {
		try {
			StakedWorkOrderNotification swon = client.getWorkOrderNotification();

			if (swon != null) {
				ArrayOfWorkOrder awo = swon.getStakedWorkOrders();
				if (awo != null) {
					for (WorkOrder wo : awo.getWorkOrder()) {
						log.info(wo.getAccountNumber());
						log.info(wo.getActCode());
						log.info(wo.getWoNumber());
						log.info(wo.getCounty());
						log.info(wo.getWoType());

						ArrayOfStation aos = wo.getStationList();
						if (aos == null) {
							continue;
						}
						for (Station s : aos.getStation()) {
							AssemblyList al = s.getAssemblyList();
							if (al == null) {
								continue;
							}
							for (Assembly as : al.getAssembly()) {
								log.info(as.getFeatureType());
								log.info(as.getUnitCode());
								log.info(String.valueOf(as.getUnitLength()));
							}
						}

					}
				}
			}
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
		model.addAttribute("name", "Unmarshall XML sample");
		model.addAttribute("map", Collections.emptyMap());
		return "report";
	}
}
