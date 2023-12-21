package taxi.calling.service.system.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import taxi.calling.service.system.domain.*;

@Component
public class TaxiAssignmentHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<TaxiAssignment>> {

    @Override
    public EntityModel<TaxiAssignment> process(
        EntityModel<TaxiAssignment> model
    ) {
        return model;
    }
}
