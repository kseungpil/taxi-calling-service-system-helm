package taxi.calling.service.system.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import taxi.calling.service.system.domain.*;

@Component
public class TaxiRequestHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<TaxiRequest>> {

    @Override
    public EntityModel<TaxiRequest> process(EntityModel<TaxiRequest> model) {
        return model;
    }
}
