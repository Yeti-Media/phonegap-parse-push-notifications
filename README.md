Phonegap Parse Push Notifications
=======================================
> receive push message from Parse.com in your phonegap app  


##Setup

For Android, in addition to adding the plugin, you need to add the following code to the `onCreate()` method of your Application class, with the Parse app´s id and client key.  

```java
Parse.initialize(this, "ParseAppId", "ParseAppClientKey");
PushService.setDefaultPushCallback(this, WHATA.class);
ParseInstallation.getCurrentInstallation().saveInBackground();
```

The Parse [notifications quickstart guide](https://parse.com/apps/quickstart#parse_push/android/existing) explains further.

Note that, as the time of the writing, the current version of phonegap does not generate an application class in the android code, so you need to add one yourself.

##Usage

After the device ready event, call the registration method on the plugin

```javascript
parsePush.register(null, function() {
  alert("Parse Push plugin failed");
});
```

To act on received notifications, set the onNotificationReceived function, as such: 
```javascript
parsePush.onNotificationReceived = function(appState, data) {
  //appState can be "foreground" or "background"
}
```

Note that for onNotificationReceived to work on Android devices, the notification sent should be a json with an action property defined, as such:
```javascript
{
  "action": "com.example.package.HEADS_UP",
  "message": "some message"
}
```
where `com.example.package` is your app´s package.
