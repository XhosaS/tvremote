package com.google.android.tv.remote.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.widget.Toast;
import defpackage.cbs;
import defpackage.cbt;
import defpackage.nf;
import defpackage.om;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PackageReplacedReceiver extends BroadcastReceiver {
    private static final cbt a = cbt.k("com/google/android/tv/remote/service/PackageReplacedReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cbt cbtVar = a;
        ((cbs) cbtVar.b().j("com/google/android/tv/remote/service/PackageReplacedReceiver", "onReceive", 24, "PackageReplacedReceiver.java")).p("My package replaced received");
        if (Build.VERSION.SDK_INT > 27) {
            nf.d(context, new Intent(context, (Class<?>) RemoteService.class));
            return;
        }
        ((cbs) cbtVar.b().j("com/google/android/tv/remote/service/PackageReplacedReceiver", "onReceive", 30, "PackageReplacedReceiver.java")).p("Updating Android TV Remote Service. Try reconnecting in a few minutes.");
        Toast.makeText(context, R.string.atv_kill_process_explanation, 1).show();
        new Handler().postDelayed(new om(6), 5000L);
    }
}
