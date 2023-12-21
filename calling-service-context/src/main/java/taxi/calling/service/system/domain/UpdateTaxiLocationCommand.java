package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class UpdateTaxiLocationCommand {

    private UUID driverId;
    private UUID taxiId;
    private Address currentLocation;
}
