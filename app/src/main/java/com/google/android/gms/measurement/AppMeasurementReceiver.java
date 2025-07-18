package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import defpackage.bbp;
import defpackage.kts;
import defpackage.kzz;
import defpackage.lab;
import defpackage.las;
import defpackage.lat;
import defpackage.lbk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends bbp implements las {
    public static final /* synthetic */ int c = 0;
    private lat d;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.d == null) {
            this.d = new lat(this);
        }
        lat latVar = this.d;
        lbk lbkVarI = lbk.i(context, null, null);
        lab labVar = lbkVarI.f;
        lbkVarI.o(labVar);
        if (intent == null) {
            labVar.f.a("Receiver called with null intent");
            return;
        }
        kts ktsVar = lbkVarI.c;
        String action = intent.getAction();
        kzz kzzVar = labVar.k;
        kzzVar.b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                labVar.f.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        kzzVar.a("Starting wakeful intent.");
        las lasVar = latVar.a;
        SparseArray sparseArray = bbp.a;
        synchronized (sparseArray) {
            int i = bbp.b;
            int i2 = i + 1;
            bbp.b = i2;
            if (i2 <= 0) {
                bbp.b = 1;
            }
            className.putExtra("androidx.contentpager.content.wakelockid", i);
            className.putExtra("android.support.content.wakelockid", i);
            ComponentName componentNameStartService = context.startService(className);
            if (componentNameStartService == null) {
                return;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire(60000L);
            sparseArray.put(i, wakeLockNewWakeLock);
        }
    }
}
