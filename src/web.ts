import { PluginListenerHandle, WebPlugin } from '@capacitor/core';

import type { CapacitorIntentPlugin, IntentData } from './definitions';

export class CapacitorIntentWeb
  extends WebPlugin
  implements CapacitorIntentPlugin {
  constructor() {
    super();
  }

 public addListener(
    eventName: "getSentIntent",
    listenerFunc: (data: IntentData) => void
  ): Promise<PluginListenerHandle> & PluginListenerHandle {
    const handle = super.addListener(eventName, listenerFunc) as Promise<PluginListenerHandle> & PluginListenerHandle;
    handle.remove = async () => {
      await (await handle).remove();
    };
    return handle;
  }
}
