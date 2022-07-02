package com.vinit.capacitor.intent;

import android.content.Intent;
import android.os.Bundle;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "CapacitorIntent")
public class CapacitorIntentPlugin extends Plugin {

    private static final String EVENT_SEND_ACTION_INTENT = "getSentIntent";

    /**
     * Handle ACTION_VIEW intents to store a URL that was used to open the app
     * @param intent
     */
    public void handleOnNewIntent(Intent intent) {
        // read intent action
        String action = intent.getAction();
        if (Intent.ACTION_SEND.equals(action)) {

            // Get type of intent
            String type = intent.getType();
            // Get the extras from the intent
            Bundle bundle = intent.getExtras();

            JSObject extraData = new JSObject();
            for (String key : bundle.keySet()) {
                Object value = bundle.get(key);
                extraData.put(key, value);
            }

            JSObject ret = new JSObject();
            ret.put("extraData", extraData);
            ret.put("type",type);
            notifyListeners(EVENT_SEND_ACTION_INTENT, ret, true);
        }
    }
}
