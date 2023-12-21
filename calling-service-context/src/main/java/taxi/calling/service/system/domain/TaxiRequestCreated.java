package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import taxi.calling.service.system.domain.*;
import taxi.calling.service.system.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class TaxiRequestCreated extends AbstractEvent {

    private UUID requestId;
    private Address departureLocation;
    private Address destination;
    private int passengerCount;

    public TaxiRequestCreated(TaxiRequest aggregate) {
        super(aggregate);
    }

    public TaxiRequestCreated() {
        super();
    }
}
//>>> DDD / Domain Event
