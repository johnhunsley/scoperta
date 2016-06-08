package com.scoperta.model.dao;

import com.scoperta.model.Registration;

import java.util.Collection;

/**
 * d8888
 * d88888
 * d88P888
 * d88P 888 888  888  .d88b.  888  888
 * d88P  888 888  888 d88""88b `Y8bd8P'
 * d88P   888 Y88  88P 888  888   X88K
 * d8888888888  Y8bd8P  Y88..88P .d8""8b.
 * d88P     888   Y88P    "Y88P"  888  888
 *
 * @author John Hunsley
 *         (J00074Hunsle)
 *         john.hunsley@avox.info
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
