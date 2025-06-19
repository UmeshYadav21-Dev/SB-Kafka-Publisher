package in.umesh.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.umesh.binding.Order;
import in.umesh.service.OrderService;

@RestController
public class OrderRestController {
	
	@Autowired
	public  OrderService orderService;
	
	@PostMapping("/order")
	public String palceOrder(@RequestBody Order order) {
	 return	orderService.publishMsg(order);
	}

}
