package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpm extends agtu implements agvb {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ bmn d;
    final /* synthetic */ agux e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpm(bmn bmnVar, agsw agswVar, agux aguxVar) {
        super(2, agswVar);
        this.d = bmnVar;
        this.e = aguxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bpm) c((bng) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (r8.a(r7) != r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[PHI: r1 r8
  0x007e: PHI (r1v5 bng) = (r1v4 bng), (r1v11 bng) binds: [B:20:0x007c, B:8:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r8v14 java.lang.Object) = (r8v13 java.lang.Object), (r8v0 java.lang.Object) binds: [B:20:0x007c, B:8:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r7.b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L16
            java.lang.Object r0 = r7.c
            defpackage.agpl.b(r8)
            goto L8b
        L16:
            java.lang.Object r1 = r7.c
            bng r1 = (defpackage.bng) r1
            defpackage.agpl.b(r8)
            goto L7e
        L1e:
            java.lang.Object r1 = r7.a
            java.lang.Object r3 = r7.c
            bng r3 = (defpackage.bng) r3
            defpackage.agpl.b(r8)
            r8 = r1
            r1 = r3
            goto L68
        L2a:
            java.lang.Object r1 = r7.a
            java.lang.Object r4 = r7.c
            bng r4 = (defpackage.bng) r4
            defpackage.agpl.b(r8)
            goto L4c
        L34:
            defpackage.agpl.b(r8)
            java.lang.Object r8 = r7.c
            bng r8 = (defpackage.bng) r8
            bnf r1 = defpackage.bnf.b
            r7.c = r8
            r7.a = r1
            r7.b = r4
            java.lang.Object r4 = r8.c()
            if (r4 == r0) goto L9c
            r6 = r4
            r4 = r8
            r8 = r6
        L4c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L66
            bmn r8 = r7.d
            blh r8 = r8.b()
            r7.c = r4
            r7.a = r1
            r7.b = r3
            java.lang.Object r8 = r8.a(r7)
            if (r8 == r0) goto L9c
        L66:
            r8 = r1
            r1 = r4
        L68:
            agux r3 = r7.e
            bpl r4 = new bpl
            r5 = 0
            r4.<init>(r5, r3)
            r7.c = r1
            r7.a = r5
            r7.b = r2
            bnf r8 = (defpackage.bnf) r8
            java.lang.Object r8 = r1.b(r8, r4, r7)
            if (r8 == r0) goto L9c
        L7e:
            r7.c = r8
            r2 = 4
            r7.b = r2
            java.lang.Object r1 = r1.c()
            if (r1 == r0) goto L9c
            r0 = r8
            r8 = r1
        L8b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L9c
            bmn r8 = r7.d
            blh r8 = r8.b()
            r8.b()
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        bpm bpmVar = new bpm(this.d, agswVar, this.e);
        bpmVar.c = obj;
        return bpmVar;
    }
}
