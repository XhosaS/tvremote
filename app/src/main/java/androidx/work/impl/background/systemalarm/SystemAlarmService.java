package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import defpackage.bcq;
import defpackage.cbx;
import defpackage.chd;
import defpackage.chf;
import defpackage.cnt;
import defpackage.cnu;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemAlarmService extends bcq implements chd {
    private static final String a = cbx.d("SystemAlarmService");
    private chf b;
    private boolean c;

    private final void b() {
        chf chfVar = new chf(this);
        this.b = chfVar;
        if (chfVar.i == null) {
            chfVar.i = this;
        } else {
            cbx.c();
            Log.e(chf.a, "A completion listener for SystemAlarmDispatcher already exists.");
        }
    }

    @Override // defpackage.chd
    public final void a() {
        this.c = true;
        cbx.c().a(a, "All commands completed in dispatcher");
        String str = cnt.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (cnu.a) {
            linkedHashMap.putAll(cnu.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                cbx.c();
                Log.w(cnt.a, "WakeLock held for ".concat(String.valueOf(str2)));
            }
        }
        stopSelf();
    }

    @Override // defpackage.bcq, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
        this.c = false;
    }

    @Override // defpackage.bcq, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.c();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            cbx.c();
            Log.i(a, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.b.c();
            b();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.e(intent, i2);
        return 3;
    }
}
