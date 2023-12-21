package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import taxi.calling.service.system.CustomerServiceContextApplication;

@Entity
@Table(name = "Customer_table")
@Data
//<<< DDD / Aggregate Root
public class Customer {

    @Id
    private UUID customerId;

    private String customerName;

    public static CustomerRepository repository() {
        CustomerRepository customerRepository = CustomerServiceContextApplication.applicationContext.getBean(
            CustomerRepository.class
        );
        return customerRepository;
    }
}
//>>> DDD / Aggregate Root
