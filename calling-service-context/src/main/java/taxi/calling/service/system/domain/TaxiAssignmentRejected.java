package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import taxi.calling.service.system.domain.*;
import taxi.calling.service.system.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class TaxiAssignmentRejected extends AbstractEvent {

    private UUID driverId;
    private UUID taxiId;

    public TaxiAssignmentRejected(TaxiAssignment aggregate) {
        super(aggregate);
    }

    public TaxiAssignmentRejected() {
        super();
    }
}
//>>> DDD / Domain Event
