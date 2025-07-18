package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggd implements ggg, ges {
    public final gic a;
    private final yjz b;
    private final AtomicInteger c;
    private gfk d;

    public ggd(yjz yjzVar, gic gicVar) {
        gicVar.getClass();
        this.b = yjzVar;
        this.a = gicVar;
        this.c = new AtomicInteger(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v1, types: [yjv] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // defpackage.ges
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, defpackage.yjv r7, defpackage.yih r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ggb
            if (r0 == 0) goto L13
            r0 = r8
            ggb r0 = (defpackage.ggb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ggb r0 = new ggb
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r7 = r0.a
            java.lang.String r6 = r0.e
            defpackage.ybn.f(r8)
            goto L49
        L3a:
            defpackage.ybn.f(r8)
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r5.e()
            if (r8 == r1) goto L7c
        L49:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 0
            if (r8 == 0) goto L67
            yjz r8 = r5.b
            ggc r4 = new ggc
            r4.<init>(r5, r6, r7, r2)
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r8.a(r4, r0)
            if (r6 != r1) goto L66
            goto L7c
        L66:
            return r6
        L67:
            gic r8 = r5.a
            ghi r6 = r8.a(r6)
            java.lang.Object r7 = r7.a(r6)     // Catch: java.lang.Throwable -> L75
            defpackage.wef.r(r6, r2)
            return r7
        L75:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L77
        L77:
            r8 = move-exception
            defpackage.wef.r(r6, r7)
            throw r8
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggd.a(java.lang.String, yjv, yih):java.lang.Object");
    }

    @Override // defpackage.ggg
    public final gic b() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.gfk r7, defpackage.yjz r8, defpackage.yih r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.gga
            if (r0 == 0) goto L13
            r0 = r9
            gga r0 = (defpackage.gga) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gga r0 = new gga
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            java.lang.String r3 = "ROLLBACK TRANSACTION"
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            int r5 = r0.a
            defpackage.ybn.f(r9)     // Catch: java.lang.Throwable -> L2c
            goto L7a
        L2c:
            r7 = move-exception
            goto L95
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.ybn.f(r9)
            int r9 = r7.ordinal()
            if (r9 == 0) goto L5a
            if (r9 == r5) goto L52
            r2 = 2
            if (r9 != r2) goto L4c
            gic r9 = r6.a
            java.lang.String r2 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.gez.t(r9, r2)
            goto L61
        L4c:
            yfu r7 = new yfu
            r7.<init>()
            throw r7
        L52:
            gic r9 = r6.a
            java.lang.String r2 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.gez.t(r9, r2)
            goto L61
        L5a:
            gic r9 = r6.a
            java.lang.String r2 = "BEGIN DEFERRED TRANSACTION"
            defpackage.gez.t(r9, r2)
        L61:
            java.util.concurrent.atomic.AtomicInteger r9 = r6.c
            int r9 = r9.incrementAndGet()
            if (r9 <= 0) goto L6b
            r6.d = r7
        L6b:
            gfz r7 = new gfz     // Catch: java.lang.Throwable -> L2c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L2c
            r0.a = r5     // Catch: java.lang.Throwable -> L2c
            r0.d = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r8.a(r7, r0)     // Catch: java.lang.Throwable -> L2c
            if (r9 == r1) goto L94
        L7a:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.c
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L84
            r6.d = r4
        L84:
            if (r5 == 0) goto L8e
            gic r7 = r6.a
            java.lang.String r8 = "END TRANSACTION"
            defpackage.gez.t(r7, r8)
            return r9
        L8e:
            gic r7 = r6.a
            defpackage.gez.t(r7, r3)
            return r9
        L94:
            return r1
        L95:
            boolean r8 = r7 instanceof defpackage.gfv     // Catch: java.lang.Throwable -> L9f
            if (r8 == 0) goto L9c
            gfv r7 = (defpackage.gfv) r7     // Catch: java.lang.Throwable -> L9f
            throw r4     // Catch: java.lang.Throwable -> L9f
        L9c:
            throw r7     // Catch: java.lang.Throwable -> L9d
        L9d:
            r8 = move-exception
            goto La2
        L9f:
            r7 = move-exception
            r8 = r7
            r7 = r4
        La2:
            java.util.concurrent.atomic.AtomicInteger r9 = r6.c     // Catch: android.database.SQLException -> Lb2
            int r9 = r9.decrementAndGet()     // Catch: android.database.SQLException -> Lb2
            if (r9 != 0) goto Lac
            r6.d = r4     // Catch: android.database.SQLException -> Lb2
        Lac:
            gic r9 = r6.a     // Catch: android.database.SQLException -> Lb2
            defpackage.gez.t(r9, r3)     // Catch: android.database.SQLException -> Lb2
            goto Lb8
        Lb2:
            r9 = move-exception
            if (r7 == 0) goto Lb9
            defpackage.ybn.h(r7, r9)
        Lb8:
            throw r8
        Lb9:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggd.c(gfk, yjz, yih):java.lang.Object");
    }

    public final Object d(gfk gfkVar, yjz yjzVar, yih yihVar) {
        return this.b.a(new om(this, gfkVar, yjzVar, (yih) null, 3), yihVar);
    }

    public final Object e() {
        boolean z = true;
        if (this.d == null && !this.a.a.h()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
