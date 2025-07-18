package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uu {
    public final vx a;
    public clx b;
    public boolean d;
    public yqe e;
    public final cb f;
    private final yjz g;
    public final yrz c = vyf.R(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, 6);
    private final bhi h = new bhi((byte[]) null, (byte[]) null, (byte[]) null);

    public uu(vx vxVar, cb cbVar, yjz yjzVar, clx clxVar) {
        this.a = vxVar;
        this.f = cbVar;
        this.g = yjzVar;
        this.b = clxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.uu r7, defpackage.ylf r8, defpackage.ylc r9, defpackage.vx r10, defpackage.ylf r11, long r12, defpackage.yih r14) {
        /*
            boolean r0 = r14 instanceof defpackage.ur
            if (r0 == 0) goto L13
            r0 = r14
            ur r0 = (defpackage.ur) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ur r0 = new ur
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            ylf r11 = r0.g
            vx r10 = r0.f
            ylc r9 = r0.e
            ylf r8 = r0.d
            uu r7 = r0.c
            defpackage.ybn.f(r14)
            goto L62
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            defpackage.ybn.f(r14)
            r5 = 0
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 >= 0) goto L48
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L48:
            qy r14 = new qy
            r2 = 0
            r5 = 7
            r14.<init>(r7, r2, r5)
            r0.c = r7
            r0.d = r8
            r0.e = r9
            r0.f = r10
            r0.g = r11
            r0.b = r4
            java.lang.Object r14 = defpackage.yoz.t(r12, r14, r0)
            if (r14 != r1) goto L62
            return r1
        L62:
            un r14 = (defpackage.un) r14
            if (r14 == 0) goto L9b
            java.lang.Object r12 = r8.a
            un r12 = (defpackage.un) r12
            boolean r12 = r12.c
            long r12 = r14.b
            un r0 = new un
            long r1 = r14.a
            r0.<init>(r1, r12)
            r8.a = r0
            java.lang.Object r8 = r8.a
            un r8 = (defpackage.un) r8
            long r12 = r8.a
            long r12 = r10.d(r12)
            float r8 = r10.b(r12)
            r9.a = r8
            r8 = 0
            r10 = 30
            mz r8 = defpackage.hp.k(r8, r10)
            r11.a = r8
            r7.d(r14)
            float r7 = r9.a
            boolean r7 = defpackage.a.bG(r7)
            r3 = r7 ^ 1
        L9b:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu.b(uu, ylf, ylc, vx, ylf, long, yih):java.lang.Object");
    }

    public static final un f(yrz yrzVar) {
        un unVarA = null;
        Iterator itA = new cxb(new us(new sw(yrzVar, 4), null), 3).a();
        while (itA.hasNext()) {
            un unVar = (un) itA.next();
            unVarA = unVarA == null ? unVar : unVarA.a(unVar);
        }
        return unVarA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0112, code lost:
    
        if (r0.a(r1, r9) != r10) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.vx r17, defpackage.un r18, float r19, float r20, defpackage.yih r21) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu.a(vx, un, float, float, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.vx r6, defpackage.yjz r7, defpackage.yih r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ut
            if (r0 == 0) goto L13
            r0 = r8
            ut r0 = (defpackage.ut) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ut r0 = new ut
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r8)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ybn.f(r8)
            r5.d = r3
            qd r8 = new qd
            r2 = 0
            r4 = 5
            r8.<init>(r6, r7, r2, r4)
            r0.c = r3
            yqx r6 = new yqx
            yil r7 = r0.getContext()
            r6.<init>(r7, r0)
            java.lang.Object r6 = defpackage.wae.H(r6, r6, r8)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r6 = 0
            r5.d = r6
            ygi r6 = defpackage.ygi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu.c(vx, yjz, yih):java.lang.Object");
    }

    public final void d(un unVar) {
        long j = unVar.a;
        bhi bhiVar = this.h;
        Object obj = bhiVar.b;
        long j2 = unVar.b;
        ((btu) obj).b(j2, Float.intBitsToFloat((int) (j >> 32)));
        ((btu) bhiVar.a).b(j2, Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final float g(pku pkuVar, float f) {
        vx vxVar = this.a;
        return vxVar.b(vxVar.d(pkuVar.F(vxVar.f(vxVar.a(f)))));
    }
}
