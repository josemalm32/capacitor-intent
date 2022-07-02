import { WebPlugin } from '@capacitor/core';

import type { CapacitorIntentPlugin } from './definitions';

export class CapacitorIntentWeb
  extends WebPlugin
  implements CapacitorIntentPlugin {
  constructor() {
    super({
      name: 'SendIntent',
      platforms: ['web'],
    });
  }
}
