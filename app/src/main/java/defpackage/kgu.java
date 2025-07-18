package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kgu implements Handler.Callback {
    public static kgu d;
    public final Context g;
    public final kcx h;
    public final kjv i;
    public final Handler o;
    public volatile boolean p;
    private TelemetryData r;
    private kkt s;
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status b = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object c = new Object();
    private static volatile boolean q = false;
    public long e = 10000;
    public boolean f = false;
    public final AtomicInteger j = new AtomicInteger(1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final Map l = new ConcurrentHashMap(5, 0.75f, 1);
    public kgh m = null;
    public final Set n = new wg(0);
    private final Set t = new wg(0);

    private kgu(Context context, Looper looper, kcx kcxVar) {
        this.p = true;
        this.g = context;
        kos kosVar = new kos(looper, this);
        this.o = kosVar;
        this.h = kcxVar;
        this.i = new kjv(kcxVar);
        if (kll.a(context)) {
            this.p = false;
        }
        kosVar.sendMessage(kosVar.obtainMessage(6));
    }

    public static Status a(kfq kfqVar, ConnectionResult connectionResult) {
        return new Status(17, "API: " + kfqVar.a.b + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult), connectionResult.d, connectionResult);
    }

    public static kgu c(Context context) {
        kgu kguVar;
        HandlerThread handlerThread;
        synchronized (c) {
            if (d == null) {
                synchronized (kjp.a) {
                    handlerThread = kjp.b;
                    if (handlerThread == null) {
                        kjp.b = new HandlerThread("GoogleApiHandler", 9);
                        kjp.b.start();
                        handlerThread = kjp.b;
                    }
                }
                d = new kgu(context.getApplicationContext(), handlerThread.getLooper(), kcx.a);
            }
            kguVar = d;
        }
        return kguVar;
    }

    private final kgq j(kes kesVar) {
        Map map = this.l;
        kfq kfqVar = kesVar.g;
        kgq kgqVar = (kgq) map.get(kfqVar);
        if (kgqVar == null) {
            kgqVar = new kgq(this, kesVar);
            map.put(kfqVar, kgqVar);
        }
        if (kgqVar.p()) {
            this.t.add(kfqVar);
        }
        kgqVar.d();
        return kgqVar;
    }

    private final kkt k() {
        if (this.s == null) {
            this.s = new klb(this.g, kku.b);
        }
        return this.s;
    }

    private final void l() {
        TelemetryData telemetryData = this.r;
        if (telemetryData != null) {
            if (telemetryData.a > 0 || h()) {
                k().a(telemetryData);
            }
            this.r = null;
        }
    }

    final kgq b(kfq kfqVar) {
        return (kgq) this.l.get(kfqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.lvj r9, int r10, defpackage.kes r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L74
            kfq r3 = r11.g
            boolean r11 = r8.h()
            r0 = 0
            if (r11 != 0) goto Ld
        Lb:
            r1 = r8
            goto L62
        Ld:
            kko r11 = defpackage.kko.a()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r11 = r11.a
            r1 = 1
            if (r11 == 0) goto L48
            boolean r2 = r11.b
            if (r2 != 0) goto L1b
            goto Lb
        L1b:
            boolean r11 = r11.c
            kgq r2 = r8.b(r3)
            if (r2 == 0) goto L47
            keg r4 = r2.b
            boolean r5 = r4 instanceof defpackage.kiz
            if (r5 != 0) goto L2a
            goto Lb
        L2a:
            kiz r4 = (defpackage.kiz) r4
            boolean r5 = r4.E()
            if (r5 == 0) goto L47
            boolean r5 = r4.n()
            if (r5 != 0) goto L47
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r11 = defpackage.khk.b(r2, r4, r10)
            if (r11 != 0) goto L3f
            goto Lb
        L3f:
            int r0 = r2.k
            int r0 = r0 + r1
            r2.k = r0
            boolean r1 = r11.c
            goto L48
        L47:
            r1 = r11
        L48:
            khk r0 = new khk
            r4 = 0
            if (r1 == 0) goto L53
            long r6 = java.lang.System.currentTimeMillis()
            goto L54
        L53:
            r6 = r4
        L54:
            if (r1 == 0) goto L5a
            long r4 = android.os.SystemClock.elapsedRealtime()
        L5a:
            r1 = r6
            r6 = r4
            r4 = r1
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
        L62:
            if (r0 == 0) goto L75
            lvn r9 = r9.a
            android.os.Handler r10 = r1.o
            r10.getClass()
            kgk r11 = new kgk
            r11.<init>()
            r9.l(r11, r0)
            return
        L74:
            r1 = r8
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgu.d(lvj, int, kes):void");
    }

    public final void e(ConnectionResult connectionResult, int i) {
        if (i(connectionResult, i)) {
            return;
        }
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void f() {
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void g(kgh kghVar) {
        synchronized (c) {
            if (this.m != kghVar) {
                this.m = kghVar;
                this.n.clear();
            }
            this.n.addAll(kghVar.e);
        }
    }

    final boolean h() {
        if (this.f) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = kko.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        int iB = this.i.b(203400000);
        return iB == -1 || iB == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02a4  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgu.handleMessage(android.os.Message):boolean");
    }

    final boolean i(ConnectionResult connectionResult, int i) throws Resources.NotFoundException {
        Context context = this.g;
        if (klz.a(context)) {
            return false;
        }
        kcx kcxVar = this.h;
        PendingIntent pendingIntentD = connectionResult.b() ? connectionResult.d : kcxVar.d(context, connectionResult.c, null);
        if (pendingIntentD == null) {
            return false;
        }
        kcxVar.f(context, connectionResult.c, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentD, i, true), kok.a | 134217728));
        return true;
    }
}
