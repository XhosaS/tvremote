package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ann extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ agwg c;
    final /* synthetic */ ano d;
    final /* synthetic */ Object e;
    final /* synthetic */ boolean f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ann(agwg agwgVar, ano anoVar, Object obj, boolean z, agsw agswVar) {
        super(2, agswVar);
        this.c = agwgVar;
        this.d = anoVar;
        this.e = obj;
        this.f = z;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ann) c((aod) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r6 == r0) goto L24;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.io.IOException {
        /*
            r5 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 == r2) goto Ld
            defpackage.agpl.b(r6)
            goto L5e
        Ld:
            java.lang.Object r1 = r5.a
            java.lang.Object r2 = r5.g
            aod r2 = (defpackage.aod) r2
            defpackage.agpl.b(r6)
            goto L35
        L17:
            defpackage.agpl.b(r6)
            java.lang.Object r6 = r5.g
            aod r6 = (defpackage.aod) r6
            agwg r1 = r5.c
            ano r3 = r5.d
            aof r3 = r3.b()
            r5.g = r6
            r5.a = r1
            r5.b = r2
            java.lang.Object r2 = r3.b(r5)
            if (r2 == r0) goto L7f
            r4 = r2
            r2 = r6
            r6 = r4
        L35:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            agwg r1 = (defpackage.agwg) r1
            r1.a = r6
            java.lang.Object r6 = r5.e
            r1 = 0
            r5.g = r1
            r5.a = r1
            r3 = 2
            r5.b = r3
            r2.c()
            aoc r3 = new aoc
            r3.<init>(r2, r6, r1)
            java.io.File r6 = r2.a
            java.lang.Object r6 = defpackage.aob.a(r6, r3, r5)
            if (r6 == r0) goto L5b
            agpu r6 = defpackage.agpu.a
        L5b:
            if (r6 != r0) goto L5e
            goto L7f
        L5e:
            boolean r6 = r5.f
            if (r6 == 0) goto L7c
            ano r6 = r5.d
            java.lang.Object r0 = r5.e
            alt r1 = new alt
            if (r0 == 0) goto L6f
            int r2 = r0.hashCode()
            goto L70
        L6f:
            r2 = 0
        L70:
            anp r6 = r6.d
            agwg r3 = r5.c
            int r3 = r3.a
            r1.<init>(r0, r2, r3)
            r6.b(r1)
        L7c:
            agpu r6 = defpackage.agpu.a
            return r6
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ann.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ann annVar = new ann(this.c, this.d, this.e, this.f, agswVar);
        annVar.g = obj;
        return annVar;
    }
}
