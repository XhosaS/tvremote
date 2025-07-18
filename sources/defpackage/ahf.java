package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahf implements Handler.Callback {
    private static ahf n;
    public final Context f;
    public final aeu g;
    public final Handler k;
    public volatile boolean l;
    public final cih m;
    private ajf p;
    private final Set q;
    private ajm r;
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    private static volatile boolean o = false;
    public long d = 10000;
    public boolean e = false;
    public final AtomicInteger h = new AtomicInteger(1);
    public final AtomicInteger i = new AtomicInteger(0);
    public final Map j = new ConcurrentHashMap(5, 0.75f, 1);

    private ahf(Context context, Looper looper, aeu aeuVar) {
        new mb();
        this.q = new mb();
        this.l = true;
        this.f = context;
        akn aknVar = new akn(looper, this);
        this.k = aknVar;
        this.g = aeuVar;
        this.m = new cih(aeuVar);
        if (ajq.a(context)) {
            this.l = false;
        }
        aknVar.sendMessage(aknVar.obtainMessage(6));
    }

    public static Status a(agr agrVar, aeq aeqVar) {
        Object obj = agrVar.a.a;
        return new Status(17, "API: " + ((String) obj) + " is not available on this device. Connection failed with: " + String.valueOf(aeqVar), aeqVar.d, aeqVar);
    }

    public static ahf c(Context context) {
        ahf ahfVar;
        HandlerThread handlerThread;
        synchronized (c) {
            if (n == null) {
                synchronized (ail.a) {
                    handlerThread = ail.b;
                    if (handlerThread == null) {
                        ail.b = new HandlerThread("GoogleApiHandler", 9);
                        ail.b.start();
                        handlerThread = ail.b;
                    }
                }
                n = new ahf(context.getApplicationContext(), handlerThread.getLooper(), aeu.a);
            }
            ahfVar = n;
        }
        return ahfVar;
    }

    private final ahc h(agb agbVar) {
        Map map = this.j;
        agr agrVar = agbVar.e;
        ahc ahcVar = (ahc) map.get(agrVar);
        if (ahcVar == null) {
            ahcVar = new ahc(this, agbVar);
            map.put(agrVar, ahcVar);
        }
        if (ahcVar.p()) {
            this.q.add(agrVar);
        }
        ahcVar.d();
        return ahcVar;
    }

    private final void i() {
        ajf ajfVar = this.p;
        if (ajfVar != null) {
            if (ajfVar.a > 0 || e()) {
                j().a(ajfVar);
            }
            this.p = null;
        }
    }

    private final ajm j() {
        if (this.r == null) {
            this.r = new ajm(this.f, ajg.b);
        }
        return this.r;
    }

    final ahc b(agr agrVar) {
        return (ahc) this.j.get(agrVar);
    }

    public final void d(aeq aeqVar, int i) {
        if (f(aeqVar, i)) {
            return;
        }
        Handler handler = this.k;
        handler.sendMessage(handler.obtainMessage(5, i, 0, aeqVar));
    }

    final boolean e() {
        if (this.e) {
            return false;
        }
        ajd ajdVar = ajc.a().a;
        if (ajdVar != null && !ajdVar.b) {
            return false;
        }
        int iE = this.m.e(203400000);
        return iE == -1 || iE == 0;
    }

    final boolean f(aeq aeqVar, int i) throws Resources.NotFoundException {
        Context context = this.f;
        if (aju.b(context)) {
            return false;
        }
        aeu aeuVar = this.g;
        PendingIntent pendingIntentE = aeqVar.b() ? aeqVar.d : aeuVar.e(context, aeqVar.c, null);
        if (pendingIntentE == null) {
            return false;
        }
        int i2 = aeqVar.c;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntentE);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        aeuVar.a(context, i2, PendingIntent.getActivity(context, 0, intent, akl.a | 134217728));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.adx r9, int r10, defpackage.agb r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L77
            agr r3 = r11.e
            boolean r11 = r8.e()
            r0 = 0
            if (r11 != 0) goto Ld
        Lb:
            r1 = r8
            goto L62
        Ld:
            ajc r11 = defpackage.ajc.a()
            ajd r11 = r11.a
            r1 = 1
            if (r11 == 0) goto L48
            boolean r2 = r11.b
            if (r2 != 0) goto L1b
            goto Lb
        L1b:
            boolean r11 = r11.c
            ahc r2 = r8.b(r3)
            if (r2 == 0) goto L47
            afx r4 = r2.b
            boolean r5 = r4 instanceof defpackage.aib
            if (r5 != 0) goto L2a
            goto Lb
        L2a:
            aib r4 = (defpackage.aib) r4
            boolean r5 = r4.z()
            if (r5 == 0) goto L47
            boolean r5 = r4.k()
            if (r5 != 0) goto L47
            aig r11 = defpackage.ahj.b(r2, r4, r10)
            if (r11 != 0) goto L3f
            goto Lb
        L3f:
            int r0 = r2.h
            int r0 = r0 + r1
            r2.h = r0
            boolean r1 = r11.c
            goto L48
        L47:
            r1 = r11
        L48:
            ahj r0 = new ahj
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
            if (r0 == 0) goto L78
            java.lang.Object r9 = r9.a
            android.os.Handler r10 = r1.k
            r10.getClass()
            aha r11 = new aha
            r2 = 0
            r11.<init>(r10, r2)
            ami r9 = (defpackage.ami) r9
            r9.g(r11, r0)
            return
        L77:
            r1 = r8
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahf.g(adx, int, agb):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02a7  */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahf.handleMessage(android.os.Message):boolean");
    }
}
