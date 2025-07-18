package defpackage;

import android.app.NotificationManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsk {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/performers/shownotification/NotificationChannelFactoryImpl");
    public static final gsj b = new gsj("AssistantNotificationImportanceDefault", "Assistant Notification Importance Default");
    public static final gsj c = new gsj("AssistantNotificationImportanceHigh", "Assistant Notification Importance High");
    public static final gsj d = new gsj("AssistantNotificationImportanceLow", "Assistant Notification Importance Low");
    public static final gsj e = new gsj("AssistantNotificationImportanceMax", "Assistant Notification Importance Max");
    public static final gsj f = new gsj("AssistantNotificationImportanceMin", "Assistant Notification Importance Min");
    public final NotificationManager g;

    public gsk(NotificationManager notificationManager) {
        this.g = notificationManager;
    }
}
