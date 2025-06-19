package in.umesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import in.umesh.binding.Order;
import in.umesh.constants.AppConstants;

@Service
public class OrderService {
	
	@Autowired 
	private KafkaTemplate<String, Order> kafkaTemplate;
	
	public String publishMsg(Order order) {
		kafkaTemplate.send(AppConstants.TOPIC, order);
		return "Message Published to kafka topic..!!";
	}

	

}
