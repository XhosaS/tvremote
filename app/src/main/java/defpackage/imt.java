package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class imt extends agtu implements agvb {
    int a;
    final /* synthetic */ ind b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;
    final /* synthetic */ owx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imt(ind indVar, String str, boolean z, owx owxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = indVar;
        this.c = str;
        this.d = z;
        this.e = owxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((imt) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r15 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r15 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        return r0;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            r14 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r14.a
            r2 = 1
            defpackage.agpl.b(r15)
            if (r1 == 0) goto Lc
            r6 = r14
            goto L60
        Lc:
            ind r15 = r14.b
            java.lang.String r1 = r14.c
            r15.C = r1
            boolean r1 = r15.r
            java.lang.String r3 = "operationsViewModel"
            r4 = 0
            if (r1 == 0) goto L66
            boolean r1 = r14.d
            if (r1 != 0) goto L66
            owx r1 = r14.e
            owl r5 = r15.b()
            r1.l(r5)
            owl r7 = r1.a()
            if (r7 == 0) goto L64
            fze r1 = r15.g
            agow r5 = r15.f
            java.lang.Object r5 = r5.a()
            r5.getClass()
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            oxe r5 = r15.D
            if (r5 != 0) goto L42
            defpackage.agvy.b(r3)
            goto L43
        L42:
            r4 = r5
        L43:
            java.lang.String r3 = "create-device-operation-id"
            java.lang.Class<owk> r5 = defpackage.owk.class
            owj r9 = r4.a(r3, r5)
            java.lang.String r10 = r15.C
            r14.a = r2
            int r15 = defpackage.fzc.a
            abhk r12 = defpackage.fzd.a
            r6 = r1
            fzw r6 = (defpackage.fzw) r6
            java.lang.String r11 = ""
            r13 = r14
            java.lang.Object r15 = defpackage.fzw.c(r6, r7, r8, r9, r10, r11, r12, r13)
            r6 = r13
            if (r15 == r0) goto L96
        L60:
            r4 = r15
            owv r4 = (defpackage.owv) r4
            goto L97
        L64:
            r6 = r14
            goto L97
        L66:
            r6 = r14
            r1 = 0
            r15.r = r1
            fze r1 = r15.g
            owx r2 = r6.e
            owl r5 = r15.b()
            java.lang.String r5 = r5.b()
            r7 = r4
            java.lang.String r4 = r15.C
            oxe r15 = r15.D
            if (r15 != 0) goto L81
            defpackage.agvy.b(r3)
            r15 = r7
        L81:
            java.lang.String r3 = "create-room-assign-device-operation-id"
            java.lang.Class<oww> r7 = defpackage.oww.class
            owj r15 = r15.a(r3, r7)
            r3 = 2
            r6.a = r3
            fzw r1 = (defpackage.fzw) r1
            r3 = r5
            r5 = r15
            java.lang.Object r15 = defpackage.fzw.d(r1, r2, r3, r4, r5, r6)
            if (r15 != r0) goto L60
        L96:
            return r0
        L97:
            ind r15 = r6.b
            r15.m(r4)
            agpu r15 = defpackage.agpu.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new imt(this.b, this.c, this.d, this.e, agswVar);
    }
}
