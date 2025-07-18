package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bol implements bng, bor {
    public final bsk a;
    private final agvb b;
    private final AtomicInteger c;
    private bnf d;

    public bol(agvb agvbVar, bsk bskVar) {
        bskVar.getClass();
        this.b = agvbVar;
        this.a = bskVar;
        this.c = new AtomicInteger(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v1, types: [agux] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // defpackage.blx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, defpackage.agux r7, defpackage.agsw r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.boi
            if (r0 == 0) goto L13
            r0 = r8
            boi r0 = (defpackage.boi) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            boi r0 = new boi
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.agpl.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r7 = r0.a
            java.lang.String r6 = r0.e
            defpackage.agpl.b(r8)
            goto L49
        L3a:
            defpackage.agpl.b(r8)
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r5.c()
            if (r8 == r1) goto L7c
        L49:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 0
            if (r8 == 0) goto L67
            agvb r8 = r5.b
            boj r4 = new boj
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
            bsk r8 = r5.a
            brj r6 = r8.a(r6)
            java.lang.Object r7 = r7.a(r6)     // Catch: java.lang.Throwable -> L75
            defpackage.aguj.a(r6, r2)
            return r7
        L75:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L77
        L77:
            r8 = move-exception
            defpackage.aguj.a(r6, r7)
            throw r8
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bol.a(java.lang.String, agux, agsw):java.lang.Object");
    }

    @Override // defpackage.bng
    public final Object b(bnf bnfVar, agvb agvbVar, agsw agswVar) {
        return this.b.a(new bok(this, bnfVar, agvbVar, null), agswVar);
    }

    @Override // defpackage.bng
    public final Object c() {
        boolean z = true;
        if (this.d == null && !((brz) this.a.a).f.inTransaction()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.bnf r7, defpackage.agvb r8, defpackage.agsw r9) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.boh
            if (r0 == 0) goto L13
            r0 = r9
            boh r0 = (defpackage.boh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            boh r0 = new boh
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            java.lang.String r3 = "ROLLBACK TRANSACTION"
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            int r5 = r0.a
            defpackage.agpl.b(r9)     // Catch: java.lang.Throwable -> L2c
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
            defpackage.agpl.b(r9)
            int r9 = r7.ordinal()
            if (r9 == 0) goto L5a
            if (r9 == r5) goto L52
            r2 = 2
            if (r9 != r2) goto L4c
            bsk r9 = r6.a
            java.lang.String r2 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.bri.a(r9, r2)
            goto L61
        L4c:
            agpg r7 = new agpg
            r7.<init>()
            throw r7
        L52:
            bsk r9 = r6.a
            java.lang.String r2 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.bri.a(r9, r2)
            goto L61
        L5a:
            bsk r9 = r6.a
            java.lang.String r2 = "BEGIN DEFERRED TRANSACTION"
            defpackage.bri.a(r9, r2)
        L61:
            java.util.concurrent.atomic.AtomicInteger r9 = r6.c
            int r9 = r9.incrementAndGet()
            if (r9 <= 0) goto L6b
            r6.d = r7
        L6b:
            bog r7 = new bog     // Catch: java.lang.Throwable -> L2c
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
            bsk r7 = r6.a
            java.lang.String r8 = "END TRANSACTION"
            defpackage.bri.a(r7, r8)
            return r9
        L8e:
            bsk r7 = r6.a
            defpackage.bri.a(r7, r3)
            return r9
        L94:
            return r1
        L95:
            boolean r8 = r7 instanceof defpackage.boc     // Catch: java.lang.Throwable -> L9f
            if (r8 == 0) goto L9c
            boc r7 = (defpackage.boc) r7     // Catch: java.lang.Throwable -> L9f
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
            bsk r9 = r6.a     // Catch: android.database.SQLException -> Lb2
            defpackage.bri.a(r9, r3)     // Catch: android.database.SQLException -> Lb2
            goto Lb8
        Lb2:
            r9 = move-exception
            if (r7 == 0) goto Lb9
            defpackage.agox.a(r7, r9)
        Lb8:
            throw r8
        Lb9:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bol.d(bnf, agvb, agsw):java.lang.Object");
    }

    @Override // defpackage.bor
    public final bsk e() {
        return this.a;
    }
}
