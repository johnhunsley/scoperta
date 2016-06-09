package com.scoperta.model.dao;

import com.scoperta.model.Registration;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;

/**
 *  _______  _______  _______  _______  _______  ______    _______  _______
 * |       ||       ||       ||       ||       ||    _ |  |       ||   _   |
 * |  _____||       ||   _   ||    _  ||    ___||   | ||  |_     _||  |_|  |
 * | |_____ |       ||  | |  ||   |_| ||   |___ |   |_||_   |   |  |       |
 * |_____  ||      _||  |_|  ||    ___||    ___||    __  |  |   |  |       |
 *  _____| ||     |_ |       ||   |    |   |___ |   |  | |  |   |  |   _   |
 * |_______||_______||_______||___|    |_______||___|  |_|  |___|  |__| |__|
 *
 * @author John Hunsley
 *         (J00074Hunsle)
 *         jphunsley@gmail.com
 *         Date : 09/06/2016
 *         Time : 11:12
 */
@Component("registrationRepository")
public class RegistrationRepositoryAWSDynamoDBImpl implements RegistrationRepository {
    private Logger logger =Logger.getLogger(RegistrationRepositoryAWSDynamoDBImpl.class);

    @Value("#{scopertaProperties['scoperta.dynamodb.endpoint']}")
    private String dynamoDBEndPoint;


    public void createRegistration(Registration registration) {

    }

    public void updateRegistration(Registration registration) {

    }

    public Registration readRegistration(Long id) {
        return null;
    }

    public void deleteRegistration(Registration registration) {

    }

    public Collection<Registration> readRegistrations() {
        return null;
    }
}
