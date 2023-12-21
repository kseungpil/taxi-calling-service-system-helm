package taxi.calling.service.system.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import taxi.calling.service.system.domain.*;

@Component
public class TaxiTripHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<TaxiTrip>> {

    @Override
    public EntityModel<TaxiTrip> process(EntityModel<TaxiTrip> model) {
        model.add(
            Link.of(model.getRequiredLink("self").getHref() + "/").withRel("")
        );
        model.add(
            Link.of(model.getRequiredLink("self").getHref() + "/").withRel("")
        );

        return model;
    }
}
