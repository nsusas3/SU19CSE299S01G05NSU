package com.project.jhasan.soudagor;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionMangement {

    SharedPreferences pref;

    // Editor for Shared preferences
    SharedPreferences.Editor editor;

    Context _context;


    int PRIVATE_MODE = 0;

    // Sharedpref file name
    private static final String PREF_NAME = "Service";


    private static final String IS_LOGIN = "IsLoggedIn";


    public static final String KEY_NAME = "name";


    public static final String KEY_EMAIL = "email";

    public SessionMangement(Context context){
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }


    public void createLoginSession(String name, String email){
        // Storing login value as TRUE
        editor.putBoolean(IS_LOGIN, true);

        // Storing name in pref
        editor.putString(KEY_NAME, name);

        // Storing email in pref
        editor.putString(KEY_EMAIL, email);
        
        editor.commit();
    }
}
