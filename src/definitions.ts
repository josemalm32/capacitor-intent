import type { PluginListenerHandle } from '@capacitor/core';

export interface IntentData {
  extraData?: any;
  type?: any;
}

export interface CapacitorIntentPlugin {
  addListener(
    eventName: 'getSentIntent',
    listenerFunc: (data: IntentData) => void,
  ): Promise<PluginListenerHandle> & PluginListenerHandle;
}
