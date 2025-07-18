package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import defpackage.dvn;
import defpackage.gpn;
import defpackage.gsn;
import defpackage.gso;
import defpackage.gvs;
import defpackage.gvt;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemAlarmService extends dvn implements gsn {
    private gso a;
    private boolean b;

    static {
        gpn.a("SystemAlarmService");
    }

    private final void b() {
        gso gsoVar = new gso(this);
        this.a = gsoVar;
        if (gsoVar.i == null) {
            gsoVar.i = this;
        } else {
            gpn.b();
            Log.e(gso.a, "A completion listener for SystemAlarmDispatcher already exists.");
        }
    }

    @Override // defpackage.gsn
    public final void a() {
        this.b = true;
        gpn.b();
        String str = gvs.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (gvt.a) {
            linkedHashMap.putAll(gvt.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                gpn.b();
                Log.w(gvs.a, "WakeLock held for ".concat(String.valueOf(str2)));
            }
        }
        stopSelf();
    }

    @Override // defpackage.dvn, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
        this.b = false;
    }

    @Override // defpackage.dvn, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b = true;
        this.a.b();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.b) {
            gpn.b();
            this.a.b();
            b();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.a.d(intent, i2);
        return 3;
    }
}
