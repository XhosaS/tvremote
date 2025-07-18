package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ged extends agtu implements agvb {
    int a;
    final /* synthetic */ gee b;
    final /* synthetic */ double c;
    final /* synthetic */ double d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ged(gee geeVar, double d, double d2, agsw agswVar) {
        super(2, agswVar);
        this.b = geeVar;
        this.c = d;
        this.d = d2;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ged) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r14 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r4.b(r5, r7, r9, r13) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r6.b(r7, r9, r11, r13) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        return defpackage.agpu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r1 != 2) goto L31;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r13.a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L17
            if (r1 == r5) goto L13
            defpackage.agpl.b(r14)
            if (r1 == r4) goto L4c
            goto L80
        L13:
            defpackage.agpl.b(r14)
            goto L3a
        L17:
            defpackage.agpl.b(r14)
            gee r6 = r13.b
            gph r14 = r6.c
            gph r1 = defpackage.gph.a
            if (r14 != r1) goto L6c
            agow r14 = r6.d
            java.lang.Object r14 = r14.a()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L3d
            fda r14 = r6.a
            r13.a = r5
            java.lang.Object r14 = r14.f(r13)
            if (r14 == r0) goto L7f
        L3a:
            fcy r14 = (defpackage.fcy) r14
            goto L4e
        L3d:
            agte r14 = r6.b
            gec r1 = new gec
            r1.<init>(r6, r2)
            r13.a = r4
            java.lang.Object r14 = defpackage.ahal.a(r14, r1, r13)
            if (r14 == r0) goto L6a
        L4c:
            fcy r14 = (defpackage.fcy) r14
        L4e:
            gee r4 = r13.b
            double r5 = r13.c
            double r7 = r13.d
            if (r14 == 0) goto L58
            java.lang.String r2 = r14.a
        L58:
            if (r2 != 0) goto L5c
            java.lang.String r2 = ""
        L5c:
            j$.util.Optional r9 = j$.util.Optional.of(r2)
            r13.a = r3
            r10 = r13
            java.lang.Object r14 = r4.b(r5, r7, r9, r10)
            if (r14 != r0) goto L80
            goto L7f
        L6a:
            r10 = r13
            goto L7f
        L6c:
            r10 = r13
            double r7 = r10.c
            r12 = r10
            double r9 = r12.d
            j$.util.Optional r11 = j$.util.Optional.empty()
            r14 = 4
            r12.a = r14
            java.lang.Object r14 = r6.b(r7, r9, r11, r12)
            if (r14 != r0) goto L80
        L7f:
            return r0
        L80:
            agpu r14 = defpackage.agpu.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ged.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ged(this.b, this.c, this.d, agswVar);
    }
}
