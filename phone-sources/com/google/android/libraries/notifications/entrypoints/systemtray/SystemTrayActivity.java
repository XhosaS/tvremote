package com.google.android.libraries.notifications.entrypoints.systemtray;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.support.v7.appcompat.R;
import defpackage.lke;
import defpackage.qcb;
import defpackage.qdo;
import defpackage.qeq;
import defpackage.qhj;
import defpackage.qhk;
import defpackage.tvk;
import defpackage.tvn;
import defpackage.yfo;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SystemTrayActivity extends Activity {
    private static final tvn a = tvn.n("GnpSdk");

    /* renamed from: $r8$lambda$O3tsmc-cU_Ja7_sdQ2a4y2a6Cew, reason: not valid java name */
    public static /* synthetic */ void m140$r8$lambda$O3tsmccU_Ja7_sdQ2a4y2a6Cew(SystemTrayActivity systemTrayActivity, Context context, Intent intent) throws SecurityException, IllegalArgumentException {
        int threadPriority = Process.getThreadPriority(0);
        try {
            Process.setThreadPriority(10);
            yfo yfoVar = (yfo) qhj.a(context).Y().get("systemtray");
            if (yfoVar != null && yfoVar.b() != null) {
                ((qeq) yfoVar.b()).c(intent, qdo.c(), TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
            }
        } finally {
            Process.setThreadPriority(threadPriority);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        qhk qhkVarA;
        Context applicationContext = getApplicationContext();
        Intent intent = getIntent();
        if (intent != null) {
            ((tvk) ((tvk) a.e()).j("com/google/android/libraries/notifications/entrypoints/systemtray/SystemTrayActivity", "onCreate", 40, "SystemTrayActivity.java")).B("Intent received for action [%s] package [%s].", intent.getAction(), intent.getPackage());
            try {
                qhkVarA = qhj.a(getApplicationContext());
            } catch (IllegalStateException e) {
                ((tvk) ((tvk) ((tvk) a.g()).i(e)).j("com/google/android/libraries/notifications/entrypoints/systemtray/SystemTrayActivity", "onCreate", '0', "SystemTrayActivity.java")).s("Chime component not initialized: Activity stopped.");
                qhkVarA = null;
            }
            if (qhkVarA != null) {
                qhkVarA.x().a(applicationContext);
                super.onCreate(bundle);
                tvn tvnVar = qcb.a;
                if (intent.getBooleanExtra("com.google.android.libraries.notifications.HANDLE_IN_FOREGROUND", false)) {
                    qhj.a(applicationContext).w().a(new lke((Object) this, (Object) applicationContext, (Object) intent, 13, (short[]) null));
                } else {
                    Intent intent2 = new Intent(intent);
                    intent2.setFlags(268435456);
                    ((tvk) ((tvk) a.e()).j("com/google/android/libraries/notifications/entrypoints/systemtray/SystemTrayActivity", "forwardIntent", R.styleable.AppCompatTheme_textAppearanceListItemSecondary, "SystemTrayActivity.java")).v("Forwarding Intent from Activity to %s", SystemTrayBroadcastReceiver.class);
                    intent2.setClass(this, SystemTrayBroadcastReceiver.class);
                    sendBroadcast(intent2);
                }
            }
            finish();
        }
        ((tvk) ((tvk) a.f()).j("com/google/android/libraries/notifications/entrypoints/systemtray/SystemTrayActivity", "onCreate", 38, "SystemTrayActivity.java")).s("SystemTrayActivity received null intent");
        finish();
    }
}
