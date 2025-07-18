package defpackage;

import android.app.PendingIntent;
import android.content.Context;
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
/* loaded from: classes2.dex */
public final class nzg implements Handler.Callback {
    public static nzg d;
    public final Context g;
    public final nvj h;
    public final obl i;
    public final Handler o;
    public volatile boolean p;
    private ocd r;
    private oce s;
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    private static volatile boolean q = false;
    public long e = 10000;
    public boolean f = false;
    public final AtomicInteger j = new AtomicInteger(1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final Map l = new ConcurrentHashMap(5, 0.75f, 1);
    public nye m = null;
    public final Set n = new it();
    private final Set t = new it();

    private nzg(Context context, Looper looper, nvj nvjVar) {
        this.p = true;
        this.g = context;
        ogh oghVar = new ogh(looper, this);
        this.o = oghVar;
        this.h = nvjVar;
        this.i = new obl(nvjVar);
        if (ocp.a(context)) {
            this.p = false;
        }
        oghVar.sendMessage(oghVar.obtainMessage(6));
    }

    public static Status a(nxn nxnVar, nve nveVar) {
        return new Status(17, "API: " + nxnVar.a() + " is not available on this device. Connection failed with: " + String.valueOf(nveVar), nveVar.d, nveVar);
    }

    public static nzg c(Context context) {
        nzg nzgVar;
        HandlerThread handlerThread;
        synchronized (c) {
            if (d == null) {
                synchronized (obi.a) {
                    handlerThread = obi.b;
                    if (handlerThread == null) {
                        obi.b = new HandlerThread("GoogleApiHandler", 9);
                        obi.b.start();
                        handlerThread = obi.b;
                    }
                }
                d = new nzg(context.getApplicationContext(), handlerThread.getLooper(), nvj.a);
            }
            nzgVar = d;
        }
        return nzgVar;
    }

    private final nzd j(nwq nwqVar) {
        Map map = this.l;
        nxn nxnVar = nwqVar.z;
        nzd nzdVar = (nzd) map.get(nxnVar);
        if (nzdVar == null) {
            nzdVar = new nzd(this, nwqVar);
            map.put(nxnVar, nzdVar);
        }
        if (nzdVar.o()) {
            this.t.add(nxnVar);
        }
        nzdVar.d();
        return nzdVar;
    }

    private final oce k() {
        if (this.s == null) {
            this.s = new ocl(this.g, ocf.a);
        }
        return this.s;
    }

    private final void l() {
        ocd ocdVar = this.r;
        if (ocdVar != null) {
            if (ocdVar.a > 0 || g()) {
                k().a(ocdVar);
            }
            this.r = null;
        }
    }

    final nzd b(nxn nxnVar) {
        return (nzd) this.l.get(nxnVar);
    }

    public final void d(nve nveVar, int i) {
        if (h(nveVar, i)) {
            return;
        }
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(5, i, 0, nveVar));
    }

    public final void e() {
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void f(nye nyeVar) {
        synchronized (c) {
            if (this.m != nyeVar) {
                this.m = nyeVar;
                this.n.clear();
            }
            this.n.addAll(nyeVar.e);
        }
    }

    final boolean g() {
        if (this.f) {
            return false;
        }
        ocb ocbVar = oca.a().a;
        if (ocbVar != null && !ocbVar.b) {
            return false;
        }
        int iC = this.i.c(203400000);
        return iC == -1 || iC == 0;
    }

    final boolean h(nve nveVar, int i) throws Resources.NotFoundException {
        Context context = this.g;
        if (ocv.j(context)) {
            return false;
        }
        nvj nvjVar = this.h;
        PendingIntent pendingIntentJ = nveVar.b() ? nveVar.d : nvjVar.j(context, nveVar.c, null);
        if (pendingIntentJ == null) {
            return false;
        }
        nvjVar.f(context, nveVar.c, GoogleApiActivity.wrapPendingIntent(context, pendingIntentJ, i));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0292  */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzg.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(defpackage.kwy r9, int r10, defpackage.nwq r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L78
            nxn r3 = r11.z
            boolean r11 = r8.g()
            r0 = 0
            if (r11 != 0) goto Ld
        Lb:
            r1 = r8
            goto L62
        Ld:
            oca r11 = defpackage.oca.a()
            ocb r11 = r11.a
            r1 = 1
            if (r11 == 0) goto L48
            boolean r2 = r11.b
            if (r2 != 0) goto L1b
            goto Lb
        L1b:
            boolean r11 = r11.c
            nzd r2 = r8.b(r3)
            if (r2 == 0) goto L47
            nwj r4 = r2.b
            boolean r5 = r4 instanceof defpackage.oat
            if (r5 != 0) goto L2a
            goto Lb
        L2a:
            oat r4 = (defpackage.oat) r4
            boolean r5 = r4.T()
            if (r5 == 0) goto L47
            boolean r5 = r4.E()
            if (r5 != 0) goto L47
            oay r11 = defpackage.nzu.b(r2, r4, r10)
            if (r11 != 0) goto L3f
            goto Lb
        L3f:
            int r0 = r2.j
            int r0 = r0 + r1
            r2.j = r0
            boolean r1 = r11.c
            goto L48
        L47:
            r1 = r11
        L48:
            nzu r0 = new nzu
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
            if (r0 == 0) goto L79
            java.lang.Object r9 = r9.a
            android.os.Handler r10 = r1.o
            r10.getClass()
            emk r11 = new emk
            r2 = 8
            r11.<init>(r10, r2)
            onz r9 = (defpackage.onz) r9
            r9.l(r11, r0)
            return
        L78:
            r1 = r8
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzg.i(kwy, int, nwq):void");
    }
}
