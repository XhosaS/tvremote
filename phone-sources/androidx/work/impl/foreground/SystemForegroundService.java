package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import defpackage.aye;
import defpackage.dvn;
import defpackage.fki;
import defpackage.gli;
import defpackage.gpn;
import defpackage.grs;
import defpackage.gtz;
import defpackage.gua;
import defpackage.gvj;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemForegroundService extends dvn implements gtz {
    public static final String a = gpn.a("SystemFgService");
    gua b;
    NotificationManager c;
    private boolean d;

    private final void e() {
        this.c = (NotificationManager) getApplicationContext().getSystemService("notification");
        gua guaVar = new gua(getApplicationContext());
        this.b = guaVar;
        if (guaVar.h == null) {
            guaVar.h = this;
        } else {
            gpn.b();
            Log.e(gua.a, "A callback already exists.");
        }
    }

    @Override // defpackage.gtz
    public final void a(int i) {
        this.c.cancel(i);
    }

    @Override // defpackage.gtz
    public final void b(int i, Notification notification) {
        this.c.notify(i, notification);
    }

    @Override // defpackage.gtz
    public final void c(int i, int i2, Notification notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            fki.aQ(this, i, notification, i2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            startForeground(i, notification, i2);
        } else {
            startForeground(i, notification);
        }
    }

    @Override // defpackage.gtz
    public final void d() {
        this.d = true;
        gpn.b();
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        stopSelf();
    }

    @Override // defpackage.dvn, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.dvn, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            gpn.b();
            this.b.c();
            e();
            this.d = false;
        }
        if (intent == null) {
            return 3;
        }
        gua guaVar = this.b;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            gpn.b();
            Objects.toString(intent);
            intent.toString();
            guaVar.i.q(new gvj(guaVar, intent.getStringExtra("KEY_WORKSPEC_ID"), 1));
            guaVar.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            guaVar.b(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            gpn.b();
            gtz gtzVar = guaVar.h;
            if (gtzVar == null) {
                return 3;
            }
            gtzVar.d();
            return 3;
        }
        gpn.b();
        Objects.toString(intent);
        intent.toString();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        grs grsVar = guaVar.b;
        UUID uuidFromString = UUID.fromString(stringExtra);
        uuidFromString.getClass();
        Object obj = grsVar.h.d;
        ?? r0 = grsVar.k.c;
        r0.getClass();
        fki.bb((gli) obj, "CancelWorkById", r0, new aye(grsVar, uuidFromString, 20, null));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.b.d(RecyclerView.ItemAnimator.FLAG_MOVED);
    }

    public final void onTimeout(int i, int i2) {
        this.b.d(i2);
    }
}
