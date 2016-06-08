package com.scoperta.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBVersionAttribute;

import java.io.Serializable;

/** _______  _______  _______  _______  _______  ______    _______  _______
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
 *         Date : 05/06/2016
 *         Time : 09:52
 */
@DynamoDBTable(tableName="ScopertaRegistrations")
public class Registration implements Serializable {
    private static final long serialVersionUID = 785794562779985L;

    @DynamoDBVersionAttribute(attributeName = "version")
    private Long version;

    @DynamoDBHashKey(attributeName="Id")
    private Long id;
}
