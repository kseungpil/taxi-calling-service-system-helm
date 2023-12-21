package taxi.calling.service.system.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import taxi.calling.service.system.domain.*;

@Component
public class DriverHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Driver>> {

    @Override
    public EntityModel<Driver> process(EntityModel<Driver> model) {
        return model;
    }
}
