package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateTaxiRequestCommand {

    private Address departureLocation;
    private Address destination;
    private int passengerCount;
}
