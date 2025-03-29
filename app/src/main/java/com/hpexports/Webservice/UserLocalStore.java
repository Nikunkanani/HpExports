package com.hpexports.Webservice;

import android.content.Context;
import android.content.SharedPreferences;

//import com.neighborlyeats.model.Login.UserStoreDetails;

public class UserLocalStore {

    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context) {
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);

    }

    /*public void storeUserData(UserStoreDetails cUser ) {
        SharedPreferences.Editor userLocalDatabaseEditor = userLocalDatabase.edit();
        userLocalDatabaseEditor.putString("token", cUser.getToken());
        userLocalDatabaseEditor.putString("userId", cUser.getId());
        userLocalDatabaseEditor.putString("name", cUser.getName());
        userLocalDatabaseEditor.putString("mobile", cUser.getMobile());
        userLocalDatabaseEditor.putString("profileImage", cUser.getProfileImage());
        userLocalDatabaseEditor.putString("profileFillStatus", cUser.getProfileFillStatus());


        userLocalDatabaseEditor.apply();
    }



    public UserStoreDetails getLoggedInUser() {
        String token = userLocalDatabase.getString("token", "");
        String userId = userLocalDatabase.getString("userId", "");
        String name = userLocalDatabase.getString("name", "");
        String mobile = userLocalDatabase.getString("mobile", "");
        String profileImage = userLocalDatabase.getString("profileImage", "");
        String profileFillStatus = userLocalDatabase.getString("profileFillStatus", "");

        UserStoreDetails cUser = new UserStoreDetails(token, userId, name, mobile, profileImage, profileFillStatus);
        return cUser;
    }



    public void clearUserData() {
        SharedPreferences.Editor userLocalDatabaseEditor = userLocalDatabase.edit();
        userLocalDatabaseEditor.clear();
        userLocalDatabaseEditor.apply();
    }



    public void storeFilterData(String delivery, String foodType, String rangeOfDelivery, String location) {
        SharedPreferences.Editor editor = userLocalDatabase.edit();
        editor.putString("delivery", delivery);
        editor.putString("foodType", foodType);
        editor.putString("rangeOfDelivery", rangeOfDelivery);
        editor.putString("location", location);
        editor.apply();
    }

    public String[] getFilterData() {
        String delivery = userLocalDatabase.getString("delivery", "");
        String foodType = userLocalDatabase.getString("foodType", "");
        String rangeOfDelivery = userLocalDatabase.getString("rangeOfDelivery", "");
        String location = userLocalDatabase.getString("location", "");
        return new String[]{delivery, foodType, rangeOfDelivery, location};
    }

    public void clearFilterData() {
        SharedPreferences.Editor editor = userLocalDatabase.edit();
        editor.remove("delivery");
        editor.remove("foodType");
        editor.remove("rangeOfDelivery");
        editor.remove("location");
        editor.apply();
    }*/


}
