package com.vinit.capacitor.intent;

import android.os.Bundle;
import android.util.Log;
import com.getcapacitor.BridgeActivity;

public class CapacitorIntent extends  BridgeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerPlugin(CapacitorIntentPlugin.class);
    }
}
