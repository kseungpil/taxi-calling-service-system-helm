package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import taxi.calling.service.system.DriverServiceContextApplication;

@Entity
@Table(name = "Driver_table")
@Data
//<<< DDD / Aggregate Root
public class Driver {

    @Id
    private UUID driverId;

    private String driverName;

    public static DriverRepository repository() {
        DriverRepository driverRepository = DriverServiceContextApplication.applicationContext.getBean(
            DriverRepository.class
        );
        return driverRepository;
    }
}
//>>> DDD / Aggregate Root
