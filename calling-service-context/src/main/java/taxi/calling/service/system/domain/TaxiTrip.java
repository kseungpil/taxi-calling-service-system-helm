package taxi.calling.service.system.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import taxi.calling.service.system.CallingServiceContextApplication;
import taxi.calling.service.system.domain.TaxiTripStarted;

@Entity
@Table(name = "TaxiTrip_table")
@Data
//<<< DDD / Aggregate Root
public class TaxiTrip {

    @Id
    private UUID driverId;

    private UUID taxiId;

    private Address destination;

    @PostPersist
    public void onPostPersist() {
        TaxiTripStarted taxiTripStarted = new TaxiTripStarted(this);
        taxiTripStarted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static TaxiTripRepository repository() {
        TaxiTripRepository taxiTripRepository = CallingServiceContextApplication.applicationContext.getBean(
            TaxiTripRepository.class
        );
        return taxiTripRepository;
    }

    //<<< Clean Arch / Port Method
    public void updateTaxiLocation(
        UpdateTaxiLocationCommand updateTaxiLocationCommand
    ) {
        //implement business logic here:

        TaxiLocationUpdated taxiLocationUpdated = new TaxiLocationUpdated(this);
        taxiLocationUpdated.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void completeTaxiTrip(
        CompleteTaxiTripCommand completeTaxiTripCommand
    ) {
        //implement business logic here:

        TaxiTripCompleted taxiTripCompleted = new TaxiTripCompleted(this);
        taxiTripCompleted.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
