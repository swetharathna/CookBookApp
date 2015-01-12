package com.cmpe277.myapp;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

import android.app.Application;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
	    
		// Add your initialization code here
		Parse.initialize(this, "6dHfnDP3fr37zWIVkXBJDXN8nhH3OMXW5KGD3elj", "L7ZI5iasooYqzdcZthVHycvCvw0rtSH9aPrszczM");
		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
	    
		// If you would like all objects to be private by default, remove this line.
		defaultACL.setPublicReadAccess(true);
		
		ParseACL.setDefaultACL(defaultACL, true);
		
	}

}
