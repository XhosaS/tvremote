package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class api extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ apj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public api(apj apjVar, agsw agswVar) {
        super(2, agswVar);
        this.c = apjVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((api) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r1.a(r5, r4) == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[PHI: r1 r5
  0x0037: PHI (r1v1 agvb) = (r1v5 agvb), (r1v6 agvb) binds: [B:10:0x0035, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r5v6 java.lang.Object) = (r5v10 java.lang.Object), (r5v0 java.lang.Object) binds: [B:10:0x0035, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0041 -> B:13:0x0043). Please report as a decompilation issue!!! */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.agpl.b(r5)
            goto L43
        Ld:
            java.lang.Object r1 = r4.a
            defpackage.agpl.b(r5)
            goto L37
        L13:
            defpackage.agpl.b(r5)
            apj r5 = r4.c
            alq r5 = r5.d
            java.util.concurrent.atomic.AtomicInteger r5 = r5.a
            int r5 = r5.get()
            if (r5 <= 0) goto L54
        L22:
            apj r5 = r4.c
            ahbt r1 = r5.a
            defpackage.ahbu.c(r1)
            agvb r1 = r5.b
            r4.a = r1
            r4.b = r2
            ahfn r5 = r5.c
            java.lang.Object r5 = r5.c(r4)
            if (r5 == r0) goto L53
        L37:
            r3 = 0
            r4.a = r3
            r3 = 2
            r4.b = r3
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 == r0) goto L53
        L43:
            apj r5 = r4.c
            alq r5 = r5.d
            java.util.concurrent.atomic.AtomicInteger r5 = r5.a
            int r5 = r5.decrementAndGet()
            if (r5 == 0) goto L50
            goto L22
        L50:
            agpu r5 = defpackage.agpu.a
            return r5
        L53:
            return r0
        L54:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.api.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new api(this.c, agswVar);
    }
}
