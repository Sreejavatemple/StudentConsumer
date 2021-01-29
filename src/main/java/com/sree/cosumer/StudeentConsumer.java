package com.sree.cosumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class StudeentConsumer {
@Autowired
private DiscoveryClient client;

@GetMapping("con")
public String StudentConsumer() {
	RestTemplate rt=new RestTemplate();
	List<ServiceInstance> list=client.getInstances("STUDENT-PROVIDER");
	ResponseEntity<String> resp=rt.getForEntity(list.get(0).getUri()+"/std",String.class);
	
	return "FROM CONSUMER";
}
}
