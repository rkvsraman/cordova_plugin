package com.neevtech.cordova;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;

public class Echo extends CordovaPlugin {



    public Echo() {
    }

    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {


        if (action.equals("say")) {
            final String message = args.getString(0);
            this.cordova.getThreadPool().execute(new Runnable() {
                public void run() {
		     
                    callbackContext.success("Saying hello to " + message);
                }
            });
            
        }
        else if (action.equals("fail")) {
		callbackContext.error("Just failing here");
        }
        else {
        	return false;
        }
        return true;
    }
}
