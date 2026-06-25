package com.loose.coupling;

public class WebServiceDatabaseProvider implements UserDataProvider {
@Override
public String getUserDetails(){
    return "Fetching details from web service data provider";
}
}
