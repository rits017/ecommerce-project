package com.loose.coupling;

public class UserDataaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return"Fetching data from userDatabase provider";
    }

}
