package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import taxi.calling.service.system.CallingServiceContextApplication;
import taxi.calling.service.system.domain.TaxiRequestCreated;

@Entity
@Table(name = "TaxiRequest_table")
@Data
//<<< DDD / Aggregate Root
public class TaxiRequest {

    @Id
    private Address departureLocation;

    private Address destination;

    private int passengerCount;

    @PostPersist
    public void onPostPersist() {
        TaxiRequestCreated taxiRequestCreated = new TaxiRequestCreated(this);
        taxiRequestCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static TaxiRequestRepository repository() {
        TaxiRequestRepository taxiRequestRepository = CallingServiceContextApplication.applicationContext.getBean(
            TaxiRequestRepository.class
        );
        return taxiRequestRepository;
    }
}
//>>> DDD / Aggregate Root
