package com.google.android.apps.googletv.app.device.impl;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.videos.R;
import defpackage.itk;
import defpackage.itm;
import defpackage.itn;
import defpackage.xcb;
import defpackage.xnb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MediaDeviceControllerForegroundService extends xcb {
    public itk a;
    public xnb b;
    public Context c;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new itn(this.a);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        NotificationManager notificationManager;
        xnb xnbVar = this.b;
        if (xnbVar != null && xnbVar.a()) {
            NotificationChannel notificationChannel = new NotificationChannel("2131428963", "Connect to a TV Nearby", 3);
            Context context = this.c;
            if (context != null && (notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class)) != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
            Notification notificationBuild = new Notification.Builder(this, "2131428963").setContentTitle("Connect to a TV").setContentText("Connect to a TV").setSmallIcon(R.drawable.ic_4k_badge).build();
            notificationBuild.getClass();
            startForeground(R.id.media_device_controller_foreground_service_notification, notificationBuild);
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        itk itkVar = this.a;
        if ((itkVar != null ? itkVar.e() : null) == null) {
            stopSelf();
        }
        itk itkVar2 = this.a;
        if (itkVar2 != null) {
            itkVar2.c().ea(new itm(this, 0));
        }
        return super.onUnbind(intent);
    }
}
