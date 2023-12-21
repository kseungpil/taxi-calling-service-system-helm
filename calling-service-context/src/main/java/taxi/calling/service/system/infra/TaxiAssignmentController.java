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
// @RequestMapping(value="/taxiAssignments")
@Transactional
public class TaxiAssignmentController {

    @Autowired
    TaxiAssignmentRepository taxiAssignmentRepository;
}
//>>> Clean Arch / Inbound Adaptor
