package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import taxi.calling.service.system.CallingServiceContextApplication;
import taxi.calling.service.system.domain.TaxiAssignmentAccepted;
import taxi.calling.service.system.domain.TaxiAssignmentRejected;

@Entity
@Table(name = "TaxiAssignment_table")
@Data
//<<< DDD / Aggregate Root
public class TaxiAssignment {

    @Id
    private UUID driverId;

    private UUID taxiId;

    @PostPersist
    public void onPostPersist() {
        TaxiAssignmentAccepted taxiAssignmentAccepted = new TaxiAssignmentAccepted(
            this
        );
        taxiAssignmentAccepted.publishAfterCommit();

        TaxiAssignmentRejected taxiAssignmentRejected = new TaxiAssignmentRejected(
            this
        );
        taxiAssignmentRejected.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static TaxiAssignmentRepository repository() {
        TaxiAssignmentRepository taxiAssignmentRepository = CallingServiceContextApplication.applicationContext.getBean(
            TaxiAssignmentRepository.class
        );
        return taxiAssignmentRepository;
    }
}
//>>> DDD / Aggregate Root
