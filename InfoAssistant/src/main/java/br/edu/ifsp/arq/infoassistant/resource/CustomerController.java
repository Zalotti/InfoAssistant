package br.edu.ifsp.arq.infoassistant.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.arq.infoassistant.domain.model.Customer;

@RestController
public class CustomerController {
	
	@GetMapping("/customers")
	public List<Customer> listar(){
		var customer1 = new Customer();
		customer1.setId(1L);
		customer1.setName("João Vitor");
		customer1.setCellphone("111111111");

		var customer2 = new Customer();
		customer2.setId(2L);
		customer2.setName("Hellen Lohana");
		customer2.setCellphone("2222222222");
		
		var customer3 = new Customer();
		customer3.setId(3L);
		customer3.setName("Fabiana Alves");
		customer3.setCellphone("3333333333");

		return Arrays.asList(customer1, customer2, customer3);	
	}

}