package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pzx implements pzq {
    private static final tvn c = tvn.n("GnpSdk");
    public final xbw a;
    public final xbw b;
    private final Context d;
    private final qsy e;
    private final xbw f;
    private final qai g;
    private final qoj h;
    private final xbw i;
    private final xbw j;
    private final xbw k;
    private final xbw l;
    private final xbw m;
    private final xbw n;
    private final xbw o;
    private final xbw p;

    public pzx(Context context, qsy qsyVar, xbw xbwVar, qai qaiVar, qoj qojVar, xbw xbwVar2, xbw xbwVar3, xbw xbwVar4, xbw xbwVar5, xbw xbwVar6, xbw xbwVar7, xbw xbwVar8, xbw xbwVar9, xbw xbwVar10, xbw xbwVar11, xbw xbwVar12, xbw xbwVar13) {
        qsyVar.getClass();
        xbwVar.getClass();
        qaiVar.getClass();
        qojVar.getClass();
        xbwVar2.getClass();
        xbwVar3.getClass();
        xbwVar4.getClass();
        xbwVar5.getClass();
        xbwVar6.getClass();
        xbwVar7.getClass();
        xbwVar8.getClass();
        xbwVar9.getClass();
        xbwVar10.getClass();
        xbwVar11.getClass();
        xbwVar12.getClass();
        xbwVar13.getClass();
        this.d = context;
        this.e = qsyVar;
        this.f = xbwVar;
        this.g = qaiVar;
        this.h = qojVar;
        this.i = xbwVar2;
        this.j = xbwVar3;
        this.a = xbwVar5;
        this.k = xbwVar6;
        this.l = xbwVar7;
        this.m = xbwVar8;
        this.n = xbwVar9;
        this.b = xbwVar11;
        this.o = xbwVar12;
        this.p = xbwVar13;
    }

    @Override // defpackage.pzq
    public final synchronized psy a(qen qenVar, vmd vmdVar) throws Throwable {
        try {
            try {
                vmdVar.getClass();
                sjl.b();
                Bundle bundle = new Bundle();
                ocv.bp(bundle, qenVar);
                bundle.putInt("com.google.android.libraries.notifications.REGISTRATION_REASON", vmdVar.p);
                return (psy) ykr.n(yim.a, new ajo(this, qenVar, bundle, xfo.a() == 0 ? null : Long.valueOf(xfo.a()), (yih) null, 20));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // defpackage.pzq
    public final Object b(qen qenVar, long j, vlo vloVar, yih yihVar) {
        sjl.b();
        Bundle bundle = new Bundle();
        ocv.bp(bundle, qenVar);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION", j);
        bundle.putInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", vloVar.p);
        if (qtl.J(this.d)) {
            Object objF = f(qenVar, 2, this.n, this.j, bundle, null, yihVar);
            if (objF == yio.a) {
                return objF;
            }
        } else {
            Object objB = this.j.b();
            objB.getClass();
            qsx qsxVar = (qsx) objB;
            c.l().v("App not targeting Android O. Calling [%s] RPC in the current thread.", qsxVar.d());
            Object objC = qsxVar.c(bundle, yihVar);
            if (objC == yio.a) {
                return objC;
            }
        }
        return ygi.a;
    }

    @Override // defpackage.pzq
    public final Object c(qen qenVar, vlo vloVar, yih yihVar) {
        sjl.b();
        Bundle bundle = new Bundle();
        ocv.bp(bundle, qenVar);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION", 0L);
        bundle.putInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", vloVar.p);
        if (qtl.J(this.d)) {
            Object objF = f(qenVar, 2, this.m, this.i, bundle, null, yihVar);
            if (objF == yio.a) {
                return objF;
            }
        } else {
            Object objB = this.i.b();
            objB.getClass();
            qsx qsxVar = (qsx) objB;
            c.l().v("App not targeting Android O. Calling [%s] RPC in the current thread.", qsxVar.d());
            Object objC = qsxVar.c(bundle, yihVar);
            if (objC == yio.a) {
                return objC;
            }
        }
        return ygi.a;
    }

    @Override // defpackage.pzq
    public final Object d(qen qenVar, ptf ptfVar, yih yihVar) {
        sjl.b();
        List list = ptfVar.a;
        list.getClass();
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Bundle bundle = new Bundle();
        ocv.bp(bundle, qenVar);
        bundle.putInt("com.google.android.libraries.notifications.internal.scheduled.impl.INTENT_EXTRA_INCLUDE_TARGET", 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.g.a(qenVar, 6, ((ptc) it.next()).a().h());
        }
        Object objF = f(qenVar, 6, this.p, this.l, bundle, null, yihVar);
        return objF == yio.a ? objF : ygi.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    @Override // defpackage.pzq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.qen r9, defpackage.vmo r10, java.lang.String r11, defpackage.pvu r12, java.util.List r13, defpackage.yih r14) {
        /*
            r8 = this;
            defpackage.sjl.b()
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L9f
            java.util.Iterator r13 = r13.iterator()
        Ld:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r13.next()
            vko r0 = (defpackage.vko) r0
            qre r1 = defpackage.qre.a
            vtw r1 = r1.m()
            r1.getClass()
            defpackage.qtl.k(r1)
            r0.getClass()
            vuc r2 = r1.b
            boolean r2 = r2.A()
            if (r2 != 0) goto L33
            r1.u()
        L33:
            vuc r2 = r1.b
            qre r2 = (defpackage.qre) r2
            r2.b()
            vun r2 = r2.c
            r2.add(r0)
            defpackage.qtl.j(r10, r1)
            defpackage.qtl.i(r11, r1)
            r0 = 2
            defpackage.qtl.l(r0, r1)
            r2 = 3
            defpackage.qtl.m(r2, r1)
            vht r3 = r12.a
            r4 = 1
            if (r3 != 0) goto L54
        L52:
            r0 = r4
            goto L68
        L54:
            int r3 = r3.ordinal()
            switch(r3) {
                case 0: goto L52;
                case 1: goto L68;
                case 2: goto L68;
                case 3: goto L68;
                case 4: goto L68;
                case 5: goto L68;
                case 6: goto L68;
                case 7: goto L67;
                case 8: goto L65;
                case 9: goto L63;
                case 10: goto L67;
                case 11: goto L61;
                case 12: goto L68;
                default: goto L5b;
            }
        L5b:
            yfu r9 = new yfu
            r9.<init>()
            throw r9
        L61:
            r0 = r2
            goto L68
        L63:
            r0 = 4
            goto L68
        L65:
            r0 = 6
            goto L68
        L67:
            r0 = 5
        L68:
            defpackage.qtl.n(r0, r1)
            qre r0 = defpackage.qtl.h(r1)
            qai r1 = r8.g
            r2 = 100
            byte[] r0 = r0.h()
            r1.a(r9, r2, r0)
            goto Ld
        L7b:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            defpackage.ocv.bp(r5, r9)
            xbw r3 = r8.o
            xbw r4 = r8.k
            java.lang.Long r6 = new java.lang.Long
            r10 = 5000(0x1388, double:2.4703E-320)
            r6.<init>(r10)
            r2 = 100
            r0 = r8
            r1 = r9
            r7 = r14
            java.lang.Object r9 = r0.f(r1, r2, r3, r4, r5, r6, r7)
            yio r10 = defpackage.yio.a
            if (r9 != r10) goto L9c
            return r9
        L9c:
            ygi r9 = defpackage.ygi.a
            return r9
        L9f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed requirement."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzx.e(qen, vmo, java.lang.String, pvu, java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.qen r11, int r12, defpackage.xbw r13, defpackage.xbw r14, android.os.Bundle r15, java.lang.Long r16, defpackage.yih r17) {
        /*
            r10 = this;
            r0 = r17
            boolean r2 = r0 instanceof defpackage.pzv
            if (r2 == 0) goto L15
            r2 = r0
            pzv r2 = (defpackage.pzv) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.d = r3
            goto L1a
        L15:
            pzv r2 = new pzv
            r2.<init>(r10, r0)
        L1a:
            r6 = r2
            java.lang.Object r0 = r6.b
            yio r7 = defpackage.yio.a
            int r2 = r6.d
            r8 = 2
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 == r3) goto L38
            if (r2 != r8) goto L30
            java.lang.Object r2 = r6.a
            defpackage.ybn.f(r0)
            goto La2
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L38:
            defpackage.ybn.f(r0)
            return r0
        L3c:
            defpackage.ybn.f(r0)
            boolean r0 = defpackage.xfo.c()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r13.b()
            r0.getClass()
            qjl r0 = (defpackage.qjl) r0
            r6.d = r3
            r1 = r10
            r2 = r11
            r4 = r15
            r5 = r16
            r3 = r0
            java.lang.Object r0 = r1.g(r2, r3, r4, r5, r6)
            if (r0 != r7) goto L5e
            goto Lc5
        L5e:
            return r0
        L5f:
            r4 = r15
            r9 = r6
            java.lang.Object r0 = r14.b()
            r0.getClass()
            r3 = r0
            qsx r3 = (defpackage.qsx) r3
            if (r16 != 0) goto L73
            qsy r0 = r10.e     // Catch: defpackage.qsw -> L81
            r0.b(r11, r12, r3, r15)     // Catch: defpackage.qsw -> L81
            goto L7e
        L73:
            qsy r0 = r10.e     // Catch: defpackage.qsw -> L81
            long r5 = r16.longValue()     // Catch: defpackage.qsw -> L81
            r1 = r11
            r2 = r12
            r0.c(r1, r2, r3, r4, r5)     // Catch: defpackage.qsw -> L81
        L7e:
            psy r0 = defpackage.psy.a
            return r0
        L81:
            r0 = move-exception
            tvn r1 = defpackage.pzx.c
            tuv r1 = r1.l()
            tuv r0 = r1.i(r0)
            tvk r0 = (defpackage.tvk) r0
            java.lang.String r1 = r3.d()
            java.lang.String r2 = "Error scheduling RPC. Calling [%s] RPC in the current thread"
            r0.v(r2, r1)
            r9.a = r3
            r9.d = r8
            java.lang.Object r0 = r3.c(r15, r9)
            if (r0 == r7) goto Lc5
            r2 = r3
        La2:
            qoj r1 = r10.h
            android.content.Context r3 = r10.d
            psy r0 = (defpackage.psy) r0
            java.lang.String r3 = r3.getPackageName()
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = r2.d()
            r5 = 1
            java.lang.String r6 = r0.c()
            r7 = 0
            r11 = r1
            r15 = r2
            r12 = r3
            r13 = r4
            r16 = r5
            r17 = r6
            r14 = r7
            r11.a(r12, r13, r14, r15, r16, r17)
            return r0
        Lc5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzx.f(qen, int, xbw, xbw, android.os.Bundle, java.lang.Long, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.qen r9, defpackage.qjl r10, android.os.Bundle r11, java.lang.Long r12, defpackage.yih r13) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzx.g(qen, qjl, android.os.Bundle, java.lang.Long, yih):java.lang.Object");
    }
}
