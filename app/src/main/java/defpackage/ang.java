package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ang extends agtu implements agux {
    Object a;
    int b;
    final /* synthetic */ agwh c;
    final /* synthetic */ ano d;
    final /* synthetic */ agwg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ang(agwh agwhVar, ano anoVar, agwg agwgVar, agsw agswVar) {
        super(1, agswVar);
        this.c = agwhVar;
        this.d = anoVar;
        this.e = agwgVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new ang(this.c, this.d, this.e, (agsw) obj).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r6 != r0) goto L19;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r5.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            java.lang.Object r0 = r5.a
            agwg r0 = (defpackage.agwg) r0
            defpackage.agpl.b(r6)
            goto L6c
        L14:
            java.lang.Object r1 = r5.a
            agwg r1 = (defpackage.agwg) r1
            defpackage.agpl.b(r6)     // Catch: defpackage.als -> L57
            goto L4e
        L1c:
            java.lang.Object r1 = r5.a
            agwh r1 = (defpackage.agwh) r1
            defpackage.agpl.b(r6)     // Catch: defpackage.als -> L57
            goto L3a
        L24:
            defpackage.agpl.b(r6)
            agwh r1 = r5.c     // Catch: defpackage.als -> L57
            ano r6 = r5.d     // Catch: defpackage.als -> L57
            r5.a = r1     // Catch: defpackage.als -> L57
            r5.b = r3     // Catch: defpackage.als -> L57
            apm r6 = r6.c()     // Catch: defpackage.als -> L57
            java.lang.Object r6 = defpackage.apo.a(r6, r5)     // Catch: defpackage.als -> L57
            if (r6 != r0) goto L3a
            goto L77
        L3a:
            r1.a = r6     // Catch: defpackage.als -> L57
            agwg r1 = r5.e     // Catch: defpackage.als -> L57
            ano r6 = r5.d     // Catch: defpackage.als -> L57
            aof r6 = r6.b()     // Catch: defpackage.als -> L57
            r5.a = r1     // Catch: defpackage.als -> L57
            r5.b = r2     // Catch: defpackage.als -> L57
            java.lang.Object r6 = r6.a(r5)     // Catch: defpackage.als -> L57
            if (r6 == r0) goto L77
        L4e:
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: defpackage.als -> L57
            int r6 = r6.intValue()     // Catch: defpackage.als -> L57
            r1.a = r6     // Catch: defpackage.als -> L57
            goto L74
        L57:
            agwg r6 = r5.e
            ano r1 = r5.d
            agwh r2 = r5.c
            java.lang.Object r2 = r2.a
            r5.a = r6
            r4 = 3
            r5.b = r4
            java.lang.Object r1 = r1.k(r2, r3, r5)
            if (r1 == r0) goto L77
            r0 = r6
            r6 = r1
        L6c:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0.a = r6
        L74:
            agpu r6 = defpackage.agpu.a
            return r6
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ang.b(java.lang.Object):java.lang.Object");
    }
}
