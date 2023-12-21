package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import taxi.calling.service.system.domain.*;
import taxi.calling.service.system.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class TaxiLocationUpdated extends AbstractEvent {

    private UUID driverId;
    private UUID taxiId;
    private Address currentLocation;

    public TaxiLocationUpdated(TaxiTrip aggregate) {
        super(aggregate);
    }

    public TaxiLocationUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
