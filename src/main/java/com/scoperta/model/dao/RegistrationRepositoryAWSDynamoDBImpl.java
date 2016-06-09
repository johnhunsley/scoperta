package com.scoperta.model.dao;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.scoperta.model.Registration;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;

/**
 *  _______  _______  _______  _______  _______  ______    _______  _______
 * |       ||       ||       ||       ||       ||    _ | |       ||   _   |
 * |  _____||       ||   _   ||    _  ||    ___||   | || |_     _||  |_|  |
 * | |_____ |       ||  | |  ||   |_| ||   |___ |   |_||_  |   |  |       |
 * |_____  ||      _||  |_|  ||    ___||    ___||    __  | |   |  |       |
 *  _____| ||     |_ |       ||   |    |   |___ |   |  | | |   |  |   _   |
 * |_______||_______||_______||___|    |_______||___|  |_| |___|  |__| |__|
 *
 * Repository type for CRUD operations of a {@link Registration} instance in DynamoDB
 *
 * @author John Hunsley
 *         jphunsley@gmail.com
 *         Date : 09/06/2016
 *         Time : 21:12
 */
@Component("registrationRepository")
public class RegistrationRepositoryAWSDynamoDBImpl implements RegistrationRepository {
    private Logger logger =Logger.getLogger(RegistrationRepositoryAWSDynamoDBImpl.class);

    @Value("#{scopertaProperties['scoperta.dynamodb.endpoint']}")
    private String dynamoDBEndPoint;

    @Value("#{scopertaProperties['scoperta.dynamodb.registration.table']}")
    private String registrationTable;

    /**
     *
     * @return {@link DynamoDBMapper} mapper
     */
    protected final DynamoDBMapper createMapper() {
        AmazonDynamoDBClient client = new AmazonDynamoDBClient().withEndpoint(dynamoDBEndPoint);
        return new DynamoDBMapper(client);
    }

    /**
     *
     * @param registration
     */
    public void createRegistration(Registration registration) {
        DynamoDBMapper mapper = createMapper();
        mapper.save(registration);
    }

    public void updateRegistration(Registration registration) {
        DynamoDBMapper mapper = createMapper();
        mapper.save(registration);
    }

    public Registration readRegistration(Long id) {
        DynamoDBMapper mapper = createMapper();
        return mapper.load(Registration.class, id);
    }

    public void deleteRegistration(Registration registration) {
        DynamoDBMapper mapper = createMapper();
        mapper.delete(registration);
    }

    public Collection<Registration> readRegistrations() {
        return null;
    }
}
