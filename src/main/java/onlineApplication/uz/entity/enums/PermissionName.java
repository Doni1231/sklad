package onlineApplication.uz.entity.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum PermissionName {

    /**
     * START DATA REST PERMISSION ENUM
     */

    //COUNTRY ENTITY {started:Abdurozzaq}
    DELETE_COUNTRY("Delete country", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    SAVE_COUNTRY("Add country", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_COUNTRY("Edit country", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    //{end:Abdurozzaq}

    //PAY TYPE ENTITY
    DELETE_PAY_TYPE("Delete pay type", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_PAY_TYPE("Add pay type", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_PAY_TYPE("Edit pay type", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),

    //STATE ENTITY
    DELETE_STATE("Delete state", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_STATE("Add state", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_STATE("Edit state", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),

    //DISCOUNT PERCENT ENTITY
    DELETE_DISCOUNT_PERCENT("Delete discount percent", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_DISCOUNT_PERCENT("Add discount percent", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_DISCOUNT_PERCENT("Edit discount percent", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),

    //LOYALTY DISCOUNT TARIFF ENTITY
    DELETE_LOYALTY_DISCOUNT_TARIFF("Delete loyalty discount tariff", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_LOYALTY_DISCOUNT_TARIFF("Add loyalty discount tariff", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_LOYALTY_DISCOUNT_TARIFF("Edit loyalty discount tariff", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),

    //MAIN SERVICE ENTITY
    DELETE_MAIN_SERVICE("Delete main service", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_MAIN_SERVICE("Add main service", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_MAIN_SERVICE("Edit main service", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),

    //SUB SERVICE ENTITY
    DELETE_SUB_SERVICE("Delete sub service", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_SUB_SERVICE("Add sub service", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_SUB_SERVICE("Edit sub service", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),

    //WEEK DAY ENTITY
    DELETE_WEEK_DAY("Delete week days", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_WEEK_DAY("Add sub week days", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_WEEK_DAY("Edit sub week days", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),

    //TIME BOOKED ENTITY
    DELETE_TIME_BOOKED("Delete time booked", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_TIME_BOOKED("Add sub time booked", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_TIME_BOOKED("Edit time booked", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),

    //TIME DURATION ENTITY
    DELETE_TIME_DURATION("Delete time duration", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_TIME_DURATION("Add sub time duration", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_TIME_DURATION("Edit time duration", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),

    //SHARING DISCOUNT TARIFF ENTITY
    DELETE_SHARING_DISCOUNT_TARIFF("Delete sharing discount tariff", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_DELETE_SHARING_DISCOUNT_TARIFF("Add sharing discount tariff", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_DELETE_SHARING_DISCOUNT_TARIFF("Edit sharing discount tariff", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),

    //ADDITIONAL SERVICE ENTITY
    DELETE_ADDITIONAL_SERVICE("Delete additional service", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_ADDITIONAL_SERVICE("Add additional service", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_ADDITIONAL_SERVICE("Edit additional service", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),

    //DISCOUNT EXPENSE ENTITY
    DELETE_DISCOUNT_EXPENSE("Delete discount expense", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_DISCOUNT_EXPENSE("Add discount expense", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_DISCOUNT_EXPENSE("Edit discount expense", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),

    //COUNTY ENTITY
    DELETE_COUNTY("Delete county", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_COUNTY("Add county", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_COUNTY("Edit county", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),


    /**
     * FINISH DATA REST PERSMISSION ENUM
     */

//    VERIFY_EMAIL(Arrays.asList(RoleName.ROLE_USER, RoleName.ROLE_AGENT, RoleName.ROLE_ADMIN)),
//    GET_STATE(Arrays.asList(RoleName.ROLE_USER, RoleName.ROLE_AGENT, RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
//    //    GET_COUNTY, GET_PAY_TYPE,
////    GET_COUNTRY_LIST, GET_STATE_LIST, GET_COUNTY_LIST, GET_PAY_TYPE_LIST,
////    ADD_COUNTRY, ADD_STATE, ADD_COUNTY, ADD_PAY_TYPE,
////    EDIT_COUNTRY, EDIT_STATE, EDIT_COUNTY, EDIT_PAY_TYPE,
////    DELETE_COUNTRY, DELETE_STATE, DELETE_COUNTY, DELETE_PAY_TYPE,
////    REGISTER_ROLE_USER,
////    VERIFY_EMAIL,
////    LOGIN

    //SERVICE ENTITY {started:Diyorbek}
    ADD_SERVICE("Add Service", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_SERVICE("Edit Service", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    CHANGE_ACTIVE_SERVICE("Change active Service", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    CHANGE_DYNAMIC_SERVICE("Change dynamic Service", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    GET_SERVICE("Get Service", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    //{end:Diyorbek}

    //ADDITIONAL_SERVICE_PRICE ENTITY {started:Diyorbek}
    SAVE_ADDITIONAL_SERVICE_PRICE("Add Aditional Service Price", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_ADDITIONAL_SERVICE_PRICE("Edit Aditional Service Price", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    GET_ADDITIONAL_SERVICE_PRICE("Get Aditional Service Price", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ACTIVE_ADDITIONAL_SERVICE_PRICE("Change active Aditional Service Price", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    DELETE_ADDITIONAL_SERVICE_PRICE("Delete Aditional Service Price", Collections.singletonList(RoleName.ROLE_SUPER_ADMIN)),
    //{end:Diyorbek}
    //{STARTED:imirsaburov}
    ADD_AGENT_DOCUMENT("Add agent document",Arrays.asList(RoleName.ROLE_AGENT, RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    GET_AGENT_DOCUMENT("Get agent document",Arrays.asList(RoleName.ROLE_AGENT, RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_CUSTOM_DISCOUNT("Add custom discount",Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    GET_ONE_CUSTOM_DISCOUNT("Get custom discount",Arrays.asList(RoleName.ROLE_USER, RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    ADD_FEED_BACK("Add feed Back",Arrays.asList(RoleName.ROLE_USER, RoleName.ROLE_AGENT)),
    SEEN_FEED_BACK("Seen feed backs",Arrays.asList(RoleName.ROLE_SUPER_ADMIN, RoleName.ROLE_ADMIN)),
    EDIT_DOCUMENT_STATUS("Set Status Type",Arrays.asList(RoleName.ROLE_SUPER_ADMIN, RoleName.ROLE_ADMIN)),
    //{ended:imirsaburov}
    //PRICING ENTITY {STARTED:JAVOHIR}
    ADD_PRICING("Add pricing", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_PRICING("Edit pricing", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    GET_PRICING("Get pricing", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN, RoleName.ROLE_AGENT, RoleName.ROLE_USER)),
    //{end:JAVOHIR}
    //SERVICE PRICE ENTITY {STARTED:JAVOHIR}
    ADD_SERVICE_PRICE("Add servicePrice", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_SERVICE_PRICE("Edit servicePrice", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    GET_SERVICE_PRICE("Get servicePrice", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN, RoleName.ROLE_AGENT, RoleName.ROLE_USER)),
    //{end:JAVOHIR}

    //ORDER ENTITY {started: Sirojiddin}
    SAVE_ORDER("Add ORDER", Arrays.asList(RoleName.ROLE_USER, RoleName.ROLE_AGENT, RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    UPDATE_ORDER_STATUS("Edit order status", Arrays.asList(RoleName.ROLE_AGENT, RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    DELETE_ORDER("Delete order", Arrays.asList(RoleName.ROLE_USER, RoleName.ROLE_AGENT, RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    GET_ORDER_LIST("Get orders list", Arrays.asList(RoleName.ROLE_USER, RoleName.ROLE_AGENT, RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    GET_ORDER("Get order", Arrays.asList(RoleName.ROLE_USER, RoleName.ROLE_AGENT, RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),

    //HISTORY ENTITY
    GET_HISTORY("Get history", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    //{ended: Sirojiddin}

    UPLOAD_FILE_ATTACHMENT("Attachment upload file", Arrays.asList(RoleName.ROLE_USER, RoleName.ROLE_AGENT, RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    GET_FILE_ATTACHMENT("Attachment get file", Arrays.asList(RoleName.ROLE_AGENT, RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),

    ADD_ZIP_CODE("Add zip code", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    EDIT_ZIP_CODE("Edit zip code", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN)),
    DELETE_ZIP_CODE("Edit zip code", Arrays.asList(RoleName.ROLE_ADMIN, RoleName.ROLE_SUPER_ADMIN));






    public List<RoleName> roleNames;
    public String name;

    PermissionName(String name, List<RoleName> roleNames) {
        this.roleNames = roleNames;
        this.name = name;
    }
}
