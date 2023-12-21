package taxi.calling.service.system.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taxi.calling.service.system.domain.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/taxiTrips")
@Transactional
public class TaxiTripController {

    @Autowired
    TaxiTripRepository taxiTripRepository;

    @RequestMapping(
        value = "taxiTrips/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public TaxiTrip updateTaxiLocation(
        @PathVariable(value = "id") UUID id,
        @RequestBody UpdateTaxiLocationCommand updateTaxiLocationCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /taxiTrip/updateTaxiLocation  called #####");
        Optional<TaxiTrip> optionalTaxiTrip = taxiTripRepository.findById(id);

        optionalTaxiTrip.orElseThrow(() -> new Exception("No Entity Found"));
        TaxiTrip taxiTrip = optionalTaxiTrip.get();
        taxiTrip.updateTaxiLocation(updateTaxiLocationCommand);

        taxiTripRepository.save(taxiTrip);
        return taxiTrip;
    }

    @RequestMapping(
        value = "taxiTrips/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public TaxiTrip completeTaxiTrip(
        @PathVariable(value = "id") UUID id,
        @RequestBody CompleteTaxiTripCommand completeTaxiTripCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /taxiTrip/completeTaxiTrip  called #####");
        Optional<TaxiTrip> optionalTaxiTrip = taxiTripRepository.findById(id);

        optionalTaxiTrip.orElseThrow(() -> new Exception("No Entity Found"));
        TaxiTrip taxiTrip = optionalTaxiTrip.get();
        taxiTrip.completeTaxiTrip(completeTaxiTripCommand);

        taxiTripRepository.save(taxiTrip);
        return taxiTrip;
    }
}
//>>> Clean Arch / Inbound Adaptor
