package taxi.calling.service.system.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import taxi.calling.service.system.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "taxiAssignments",
    path = "taxiAssignments"
)
public interface TaxiAssignmentRepository
    extends PagingAndSortingRepository<TaxiAssignment, UUID> {}
