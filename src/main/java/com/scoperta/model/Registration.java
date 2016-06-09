package com.scoperta.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.io.Serializable;
import java.net.URI;

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
    @DynamoDBIgnore
    private static final long serialVersionUID = 785794562779985L;

    @DynamoDBVersionAttribute(attributeName = "version")
    private Long version;

    @DynamoDBHashKey(attributeName="id")
    private Long id;

    @DynamoDBAttribute(attributeName="name")
    private String name;

    @DynamoDBAttribute(attributeName="description")
    private String description;

    @DynamoDBAttribute(attributeName="uri")
    private String uri;

    @DynamoDBAttribute(attributeName="pingUri")
    private String pingUri;

    @DynamoDBAttribute(attributeName="active")
    private boolean active;

    @DynamoDBAttribute(attributeName="alive")
    private boolean alive;


}
