package com.google.android.apps.googletv.app.presentation.widgets.actions;

import android.content.Context;
import android.content.Intent;
import android.service.quicksettings.TileService;
import com.google.android.apps.googletv.app.presentation.pages.device.DeviceNotificationActivity;
import defpackage.dmy;
import defpackage.opz;
import defpackage.oqe;
import defpackage.osk;
import defpackage.ygi;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VirtualRemoteClickAction extends TileService implements dmy {
    @Override // defpackage.dmy
    public final Object a(Context context) {
        ConcurrentHashMap concurrentHashMap = opz.a;
        Intent intentPutExtra = new Intent(DeviceNotificationActivity.ACTION_VR).setPackage(context.getPackageName()).addFlags(268435456).putExtra("referrer", "widget_referrer");
        context.startActivity(intentPutExtra);
        intentPutExtra.getClass();
        osk.k(intentPutExtra, oqe.y, "virtualRemoteButton");
        return ygi.a;
    }
}
