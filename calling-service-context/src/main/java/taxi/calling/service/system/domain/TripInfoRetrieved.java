package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import taxi.calling.service.system.domain.*;
import taxi.calling.service.system.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class TripInfoRetrieved extends AbstractEvent {

    private UUID tripId;

    public TripInfoRetrieved(TripRecord aggregate) {
        super(aggregate);
    }

    public TripInfoRetrieved() {
        super();
    }
}
//>>> DDD / Domain Event
