package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import taxi.calling.service.system.domain.*;
import taxi.calling.service.system.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class TaxiTripCompleted extends AbstractEvent {

    private UUID driverId;
    private UUID taxiId;
    private Address destination;

    public TaxiTripCompleted(TaxiTrip aggregate) {
        super(aggregate);
    }

    public TaxiTripCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
