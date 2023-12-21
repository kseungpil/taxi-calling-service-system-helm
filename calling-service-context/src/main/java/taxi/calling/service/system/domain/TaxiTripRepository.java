package taxi.calling.service.system.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import taxi.calling.service.system.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "taxiTrips", path = "taxiTrips")
public interface TaxiTripRepository
    extends PagingAndSortingRepository<TaxiTrip, UUID> {}
