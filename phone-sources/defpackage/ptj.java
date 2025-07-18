package defpackage;

import android.util.Pair;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptj implements pta {
    private static final tvn b = tvn.n("GnpSdk");
    public final yil a;
    private final qnr c;
    private final pyd d;
    private final pzq e;

    public ptj(qnr qnrVar, pyd pydVar, pzq pzqVar, yil yilVar) {
        pydVar.getClass();
        pzqVar.getClass();
        this.c = qnrVar;
        this.d = pydVar;
        this.e = pzqVar;
        this.a = yilVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object d(defpackage.ptj r6, defpackage.qpv r7, java.util.List r8, defpackage.yih r9) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptj.d(ptj, qpv, java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e9, code lost:
    
        if (r6.d(r7, r8, r0) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object e(defpackage.ptj r6, defpackage.qpv r7, defpackage.ptf r8, defpackage.yih r9) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptj.e(ptj, qpv, ptf, yih):java.lang.Object");
    }

    @Override // defpackage.pta
    public final /* synthetic */ Pair a(String str, List list) {
        return (Pair) ykr.n(yim.a, new pfo((pta) this, (qpv) new qpz(str), list, (yih) null, 7));
    }

    @Override // defpackage.pta
    public final /* synthetic */ psy b(String str, ptf ptfVar) {
        return (psy) ykr.n(yim.a, new pfo((pta) this, (qpv) new qpz(str), ptfVar, (yih) null, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qpv r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.pth
            if (r0 == 0) goto L13
            r0 = r6
            pth r0 = (defpackage.pth) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pth r0 = new pth
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r6)
            qnr r6 = r4.c
            r0.c = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 == r1) goto Lac
        L3c:
            qdl r6 = (defpackage.qdl) r6
            boolean r5 = r6 instanceof defpackage.qdi
            r0 = 0
            if (r5 == 0) goto L78
            tvn r5 = defpackage.ptj.b
            tuv r5 = r5.g()
            tvk r5 = (defpackage.tvk) r5
            java.lang.String r1 = "Failed to fetch account from storage."
            r5.s(r1)
            qdi r6 = (defpackage.qdi) r6
            boolean r5 = r6.h()
            if (r5 == 0) goto L68
            java.lang.Throwable r5 = r6.a()
            psy r5 = defpackage.psy.a(r5)
            android.util.Pair r5 = android.util.Pair.create(r5, r0)
            r5.getClass()
            return r5
        L68:
            java.lang.Throwable r5 = r6.a()
            psy r5 = defpackage.psy.b(r5)
            android.util.Pair r5 = android.util.Pair.create(r5, r0)
            r5.getClass()
            return r5
        L78:
            java.lang.Object r5 = r6.c()
            if (r5 != 0) goto L9e
            tvn r5 = defpackage.ptj.b
            tuv r5 = r5.g()
            tvk r5 = (defpackage.tvk) r5
            java.lang.String r6 = "Account not in storage."
            r5.s(r6)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "can't fetch preferences - account not in storage."
            r5.<init>(r6)
            psy r5 = defpackage.psy.a(r5)
            android.util.Pair r5 = android.util.Pair.create(r5, r0)
            r5.getClass()
            return r5
        L9e:
            psy r5 = defpackage.psy.a
            java.lang.Object r6 = r6.c()
            android.util.Pair r5 = android.util.Pair.create(r5, r6)
            r5.getClass()
            return r5
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptj.c(qpv, yih):java.lang.Object");
    }
}
