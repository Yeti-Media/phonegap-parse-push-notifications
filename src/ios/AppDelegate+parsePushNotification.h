//
//  AppDelegate+parsePushNotification.h
//  HelloWorld
//
//  Created by yoyo on 2/12/14.
//
//

#import "AppDelegate.h"


@interface AppDelegate (parsePushNotification)
    
- (void)application:(UIApplication *)application didRegisterForRemoteNotificationsWithDeviceToken:(NSData *)deviceToken;
- (void)application:(UIApplication *)application didFailToRegisterForRemoteNotificationsWithError:(NSError *)error;
- (void)application:(UIApplication *)application didReceiveRemoteNotification:(NSDictionary *)userInfo;
- (void)applicationDidBecomeActive:(UIApplication *)application;
- (id) getCommandInstance:(NSString*)className;
    
    @property (nonatomic, retain) NSDictionary	*launchNotification;
    
@end