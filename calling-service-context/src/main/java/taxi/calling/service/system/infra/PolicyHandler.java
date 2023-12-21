package taxi.calling.service.system.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import taxi.calling.service.system.config.kafka.KafkaProcessor;
import taxi.calling.service.system.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    TaxiRequestRepository taxiRequestRepository;

    @Autowired
    TaxiAssignmentRepository taxiAssignmentRepository;

    @Autowired
    TaxiTripRepository taxiTripRepository;

    @Autowired
    TripRecordRepository tripRecordRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}
}
//>>> Clean Arch / Inbound Adaptor
