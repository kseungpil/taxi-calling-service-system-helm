package taxi.calling.service.system.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import taxi.calling.service.system.domain.*;

@Component
public class TripRecordHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<TripRecord>> {

    @Override
    public EntityModel<TripRecord> process(EntityModel<TripRecord> model) {
        return model;
    }
}
