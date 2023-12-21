package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import taxi.calling.service.system.domain.*;
import taxi.calling.service.system.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class TaxiAssignmentAccepted extends AbstractEvent {

    private UUID driverId;
    private UUID taxiId;

    public TaxiAssignmentAccepted(TaxiAssignment aggregate) {
        super(aggregate);
    }

    public TaxiAssignmentAccepted() {
        super();
    }
}
//>>> DDD / Domain Event
