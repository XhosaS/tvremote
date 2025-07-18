package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lgp extends ksw {
    public final lgo a;
    public kzj b;
    public volatile Boolean c;
    public ScheduledExecutorService d;
    private final kuj e;
    private final lhl f;
    private final List g;
    private final kuj h;

    public lgp(lbk lbkVar) {
        super(lbkVar);
        this.g = new ArrayList();
        this.f = new lhl();
        this.a = new lgo(this);
        this.e = new lfv(this, lbkVar);
        this.h = new lfz(this, lbkVar);
    }

    protected final void A() {
        g();
        a();
        if (x()) {
            p(new lgb(this, i(false)));
        }
    }

    @Override // defpackage.ksw
    protected final boolean f() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.AppMetadata i(boolean r11) {
        /*
            r10 = this;
            lbk r0 = r10.y
            kts r1 = r0.c
            lbk r1 = r10.y
            kzq r1 = r1.e()
            r2 = 0
            if (r11 == 0) goto La8
            lab r11 = r0.f
            r0.o(r11)
            lbk r11 = r11.y
            lao r0 = r11.e
            r11.m(r0)
            lam r3 = r0.c
            if (r3 != 0) goto L1f
            goto La8
        L1f:
            r11.m(r0)
            lam r11 = r0.c
            lao r0 = r11.e
            r0.g()
            r0.g()
            long r3 = r11.a()
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L3b
            r11.b()
            r3 = r5
            goto L48
        L3b:
            lbk r7 = r0.y
            klk r7 = r7.B
            long r7 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r7
            long r3 = java.lang.Math.abs(r3)
        L48:
            long r7 = r11.d
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L50
        L4e:
            r11 = r2
            goto L83
        L50:
            long r7 = r7 + r7
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L59
            r11.b()
            goto L4e
        L59:
            android.content.SharedPreferences r3 = r0.c()
            java.lang.String r4 = r11.c
            java.lang.String r3 = r3.getString(r4, r2)
            android.content.SharedPreferences r0 = r0.c()
            java.lang.String r4 = r11.b
            long r7 = r0.getLong(r4, r5)
            r11.b()
            if (r3 == 0) goto L81
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 > 0) goto L77
            goto L81
        L77:
            android.util.Pair r11 = new android.util.Pair
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r11.<init>(r3, r0)
            goto L83
        L81:
            android.util.Pair r11 = defpackage.lao.a
        L83:
            if (r11 == 0) goto La8
            android.util.Pair r0 = defpackage.lao.a
            if (r11 != r0) goto L8a
            goto La8
        L8a:
            java.lang.Object r0 = r11.second
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r11 = r11.first
            java.lang.String r11 = (java.lang.String) r11
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ":"
            r2.append(r0)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
        La8:
            com.google.android.gms.measurement.internal.AppMetadata r11 = r1.h(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgp.i(boolean):com.google.android.gms.measurement.internal.AppMetadata");
    }

    final void j() {
        g();
        a();
        if (w()) {
            return;
        }
        if (z()) {
            lgo lgoVar = this.a;
            lgp lgpVar = lgoVar.c;
            lgpVar.g();
            Context context = lgpVar.y.a;
            synchronized (lgoVar) {
                if (lgoVar.a) {
                    lbk lbkVar = lgoVar.c.y;
                    lab labVar = lbkVar.f;
                    lbkVar.o(labVar);
                    labVar.k.a("Connection attempt already in progress");
                    return;
                }
                if (lgoVar.b != null && (lgoVar.b.n() || lgoVar.b.m())) {
                    lbk lbkVar2 = lgoVar.c.y;
                    lab labVar2 = lbkVar2.f;
                    lbkVar2.o(labVar2);
                    labVar2.k.a("Already awaiting connection attempt");
                    return;
                }
                lgoVar.b = new kzv(context, Looper.getMainLooper(), lgoVar, lgoVar);
                lbk lbkVar3 = lgoVar.c.y;
                lab labVar3 = lbkVar3.f;
                lbkVar3.o(labVar3);
                labVar3.k.a("Connecting to remote service");
                lgoVar.a = true;
                kkk.k(lgoVar.b);
                kzv kzvVar = lgoVar.b;
                int iG = kzvVar.c.g(kzvVar.b, 12451000);
                if (iG != 0) {
                    kzvVar.C(1, null);
                    kzvVar.g = new kiw(kzvVar);
                    Handler handler = kzvVar.d;
                    handler.sendMessage(handler.obtainMessage(3, kzvVar.r.get(), iG, null));
                } else {
                    kzvVar.k(new kiw(kzvVar));
                }
                return;
            }
        }
        lbk lbkVar4 = this.y;
        if (lbkVar4.d.y()) {
            return;
        }
        kts ktsVar = lbkVar4.c;
        Context context2 = lbkVar4.a;
        List<ResolveInfo> listQueryIntentServices = context2.getPackageManager().queryIntentServices(new Intent().setClassName(context2, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            lab labVar4 = lbkVar4.f;
            lbkVar4.o(labVar4);
            labVar4.c.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(context2, "com.google.android.gms.measurement.AppMeasurementService"));
        lgo lgoVar2 = this.a;
        lgp lgpVar2 = lgoVar2.c;
        lgpVar2.g();
        lbk lbkVar5 = lgpVar2.y;
        kle kleVarA = kle.a();
        Context context3 = lbkVar5.a;
        synchronized (lgoVar2) {
            if (lgoVar2.a) {
                lbk lbkVar6 = lgoVar2.c.y;
                lab labVar5 = lbkVar6.f;
                lbkVar6.o(labVar5);
                labVar5.k.a("Connection attempt already in progress");
                return;
            }
            lgp lgpVar3 = lgoVar2.c;
            lbk lbkVar7 = lgpVar3.y;
            lab labVar6 = lbkVar7.f;
            lbkVar7.o(labVar6);
            labVar6.k.a("Using local app measurement service");
            lgoVar2.a = true;
            kleVarA.c(context3, intent, lgpVar3.a, 129);
        }
    }

    public final void k() {
        g();
        a();
        lgo lgoVar = this.a;
        if (lgoVar.b != null && (lgoVar.b.m() || lgoVar.b.n())) {
            lgoVar.b.z();
        }
        lgoVar.b = null;
        try {
            kle.a().b(this.y.a, lgoVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.b = null;
    }

    public final void l() {
        g();
        lbk lbkVar = this.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        kzz kzzVar = labVar.k;
        List list = this.g;
        kzzVar.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                lbk lbkVar2 = this.y;
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                labVar2.c.b("Task exception while flushing queue", e);
            }
        }
        this.g.clear();
        this.h.a();
    }

    public final void m(AtomicReference atomicReference) {
        g();
        a();
        p(new lfr(this, atomicReference, i(false)));
    }

    public final void n(ComponentName componentName) {
        g();
        if (this.b != null) {
            this.b = null;
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.k.b("Disconnected from device MeasurementService", componentName);
            g();
            j();
        }
    }

    public final void o() {
        g();
        this.f.a = SystemClock.elapsedRealtime();
        ktx ktxVar = this.y.d;
        this.e.c(((Long) kzg.Y.a(null)).longValue());
    }

    public final void p(Runnable runnable) {
        g();
        if (w()) {
            runnable.run();
            return;
        }
        List list = this.g;
        long size = list.size();
        lbk lbkVar = this.y;
        ktx ktxVar = lbkVar.d;
        if (size >= 1000) {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.a("Discarding data. Max runnable queue size reached");
        } else {
            list.add(runnable);
            this.h.c(60000L);
            j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void q(defpackage.kzj r59, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r60, com.google.android.gms.measurement.internal.AppMetadata r61) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgp.q(kzj, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.AppMetadata):void");
    }

    protected final void r(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        g();
        a();
        kts ktsVar = this.y.c;
        kzt kztVarF = this.y.f();
        lbk lbkVar = kztVarF.y;
        lio lioVar = lbkVar.i;
        lbkVar.m(lioVar);
        byte[] bArrAq = lioVar.aq(conditionalUserPropertyParcel);
        boolean z = false;
        if (bArrAq.length > 131072) {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.d.a("Conditional user property too long for local database. Sending directly to service");
        } else if (kztVarF.k(2, bArrAq)) {
            z = true;
        }
        p(new lgd(this, i(true), z, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel)));
    }

    protected final void s(lez lezVar) {
        g();
        a();
        p(new lfw(this, lezVar));
    }

    public final void t(Bundle bundle) {
        boolean z;
        g();
        a();
        EventParams eventParams = new EventParams(bundle);
        lbk lbkVar = this.y;
        kts ktsVar = lbkVar.c;
        if (lbkVar.d.t(null, kzg.bc)) {
            kzt kztVarF = this.y.f();
            lbk lbkVar2 = kztVarF.y;
            lio lioVar = lbkVar2.i;
            lbkVar2.m(lioVar);
            byte[] bArrAq = lioVar.aq(eventParams);
            if (bArrAq == null) {
                lab labVar = lbkVar2.f;
                lbkVar2.o(labVar);
                labVar.d.a("Null default event parameters; not writing to database");
            } else if (bArrAq.length > 131072) {
                lab labVar2 = lbkVar2.f;
                lbkVar2.o(labVar2);
                labVar2.d.a("Default event parameters too long for local database. Sending directly to service");
            } else if (kztVarF.k(4, bArrAq)) {
                z = true;
            }
            z = false;
        } else {
            z = false;
        }
        p(new lfx(this, i(false), z, eventParams, bundle));
    }

    protected final void v(kzj kzjVar) {
        g();
        this.b = kzjVar;
        o();
        l();
    }

    public final boolean w() {
        g();
        a();
        return this.b != null;
    }

    final boolean x() {
        g();
        a();
        if (!z()) {
            return true;
        }
        lbk lbkVar = this.y;
        lio lioVar = lbkVar.i;
        lbkVar.m(lioVar);
        return lioVar.n() >= ((Integer) kzg.aJ.a(null)).intValue();
    }

    final boolean y() {
        g();
        a();
        if (!z()) {
            return true;
        }
        lbk lbkVar = this.y;
        lio lioVar = lbkVar.i;
        lbkVar.m(lioVar);
        return lioVar.n() >= 241200;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean z() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgp.z():boolean");
    }
}
