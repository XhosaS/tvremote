package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import defpackage.bcq;
import defpackage.cbx;
import defpackage.cjj;
import defpackage.cjk;
import defpackage.cjl;
import defpackage.cjm;
import defpackage.cmz;
import defpackage.coe;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemForegroundService extends bcq implements cjk {
    public static final String a = cbx.d("SystemFgService");
    cjl b;
    NotificationManager c;
    private boolean d;

    private final void e() {
        this.c = (NotificationManager) getApplicationContext().getSystemService("notification");
        cjl cjlVar = new cjl(getApplicationContext());
        this.b = cjlVar;
        if (cjlVar.i == null) {
            cjlVar.i = this;
        } else {
            cbx.c();
            Log.e(cjl.a, "A callback already exists.");
        }
    }

    @Override // defpackage.cjk
    public final void a(int i) {
        this.c.cancel(i);
    }

    @Override // defpackage.cjk
    public final void b(int i, Notification notification) {
        this.c.notify(i, notification);
    }

    @Override // defpackage.cjk
    public final void c(int i, int i2, Notification notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            cjm.a(this, i, notification, i2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            startForeground(i, notification, i2);
        } else {
            startForeground(i, notification);
        }
    }

    @Override // defpackage.cjk
    public final void d() {
        this.d = true;
        cbx.c().a(a, "Shutting down.");
        stopForeground(true);
        stopSelf();
    }

    @Override // defpackage.bcq, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.bcq, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            cbx.c();
            Log.i(a, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.b.c();
            e();
            this.d = false;
        }
        if (intent == null) {
            return 3;
        }
        cjl cjlVar = this.b;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            cbx.c();
            String str = cjl.a;
            Objects.toString(intent);
            Log.i(str, "Started foreground service ".concat(intent.toString()));
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            coe coeVar = cjlVar.j;
            coeVar.a.execute(new cjj(cjlVar, stringExtra));
            cjlVar.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            cjlVar.b(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            cbx.c();
            Log.i(cjl.a, "Stopping foreground service");
            cjk cjkVar = cjlVar.i;
            if (cjkVar == null) {
                return 3;
            }
            cjkVar.d();
            return 3;
        }
        cbx.c();
        String str2 = cjl.a;
        Objects.toString(intent);
        Log.i(str2, "Stopping foreground work for ".concat(intent.toString()));
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        cmz.a(UUID.fromString(stringExtra2), cjlVar.b);
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.b.d(2048);
    }

    public final void onTimeout(int i, int i2) {
        this.b.d(i2);
    }
}
