# @vinit_poojary/capacitor-intent

Capacitor Plugin for android intent

## Install

```bash
npm install @vinit_poojary/capacitor-intent
npx cap sync
```

## API

<docgen-index>

* [`addListener('getSentIntent', ...)`](#addlistenergetsentintent)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### addListener('getSentIntent', ...)

```typescript
addListener(eventName: 'getSentIntent', listenerFunc: (data: IntentData) => void) => Promise<PluginListenerHandle> & PluginListenerHandle
```

| Param              | Type                                                                 |
| ------------------ | -------------------------------------------------------------------- |
| **`eventName`**    | <code>'getSentIntent'</code>                                         |
| **`listenerFunc`** | <code>(data: <a href="#intentdata">IntentData</a>) =&gt; void</code> |

**Returns:** <code>Promise&lt;<a href="#pluginlistenerhandle">PluginListenerHandle</a>&gt; & <a href="#pluginlistenerhandle">PluginListenerHandle</a></code>

--------------------


### Interfaces


#### PluginListenerHandle

| Prop         | Type                                      |
| ------------ | ----------------------------------------- |
| **`remove`** | <code>() =&gt; Promise&lt;void&gt;</code> |


#### IntentData

| Prop            | Type             |
| --------------- | ---------------- |
| **`extraData`** | <code>any</code> |

</docgen-api>
