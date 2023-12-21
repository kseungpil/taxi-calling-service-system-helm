package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class RejectTaxiAssignmentCommand {

    private UUID driverId;
    private UUID taxiId;
}
