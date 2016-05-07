import com.notsalty.services.CustomerService;
import com.notsalty.services.CustomerServiceImpl;

public class Application {
	
	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstName() + " " + service.findAll().get(0).getLastName());
	}

}
