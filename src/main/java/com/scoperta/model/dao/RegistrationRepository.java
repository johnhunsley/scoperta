package com.scoperta.model.dao;

import com.scoperta.model.Registration;

import java.util.Collection;

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
 *         Date : 08/06/2016
 *         Time : 10:12
 */
public interface RegistrationRepository {


    void createRegistration(Registration registration);

    void updateRegistration(Registration registration);

    Registration readRegistration(Long id);

    void deleteRegistration(Registration registration);

    Collection<Registration> readRegistrations();

}
