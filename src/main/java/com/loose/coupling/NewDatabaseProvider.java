package com.loose.coupling;

public class NewDatabaseProvider implements UserDataProvider {
@Override
public String getUserDetails(){
    return "fetching details from New Database Provider";
}
}
