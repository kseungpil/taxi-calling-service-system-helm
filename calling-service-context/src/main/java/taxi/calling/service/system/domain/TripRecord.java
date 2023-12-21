package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import taxi.calling.service.system.CallingServiceContextApplication;
import taxi.calling.service.system.domain.TripInfoRetrieved;

@Entity
@Table(name = "TripRecord_table")
@Data
//<<< DDD / Aggregate Root
public class TripRecord {

    @Id
    private UUID tripId;

    @PostPersist
    public void onPostPersist() {
        TripInfoRetrieved tripInfoRetrieved = new TripInfoRetrieved(this);
        tripInfoRetrieved.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static TripRecordRepository repository() {
        TripRecordRepository tripRecordRepository = CallingServiceContextApplication.applicationContext.getBean(
            TripRecordRepository.class
        );
        return tripRecordRepository;
    }
}
//>>> DDD / Aggregate Root
