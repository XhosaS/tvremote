package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class imy extends agtu implements agvb {
    int a;
    final /* synthetic */ ind b;
    final /* synthetic */ boolean c;
    final /* synthetic */ owx d;
    final /* synthetic */ oww e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imy(ind indVar, boolean z, owx owxVar, oww owwVar, agsw agswVar) {
        super(2, agswVar);
        this.b = indVar;
        this.c = z;
        this.d = owxVar;
        this.e = owwVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((imy) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r15 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r15 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.agpl.b(r15)     // Catch: java.lang.IllegalStateException -> L12
            goto L10
        Ld:
            defpackage.agpl.b(r15)     // Catch: java.lang.IllegalStateException -> L12
        L10:
            r13 = r14
            goto L6d
        L12:
            r13 = r14
            goto La0
        L15:
            defpackage.agpl.b(r15)
            ind r15 = r14.b     // Catch: java.lang.IllegalStateException -> L12
            boolean r1 = r15.r     // Catch: java.lang.IllegalStateException -> L12
            java.lang.String r3 = "operationsViewModel"
            r4 = 0
            if (r1 == 0) goto L73
            boolean r1 = r14.c     // Catch: java.lang.IllegalStateException -> L12
            if (r1 != 0) goto L73
            owx r1 = r14.d     // Catch: java.lang.IllegalStateException -> L12
            owl r5 = r15.b()     // Catch: java.lang.IllegalStateException -> L12
            r1.l(r5)     // Catch: java.lang.IllegalStateException -> L12
            owl r7 = r1.a()     // Catch: java.lang.IllegalStateException -> L12
            if (r7 == 0) goto L71
            oww r1 = r14.e     // Catch: java.lang.IllegalStateException -> L12
            fze r5 = r15.g     // Catch: java.lang.IllegalStateException -> L12
            agow r6 = r15.f     // Catch: java.lang.IllegalStateException -> L12
            java.lang.Object r6 = r6.a()     // Catch: java.lang.IllegalStateException -> L12
            r6.getClass()     // Catch: java.lang.IllegalStateException -> L12
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.IllegalStateException -> L12
            oxe r15 = r15.D     // Catch: java.lang.IllegalStateException -> L12
            if (r15 != 0) goto L4c
            defpackage.agvy.b(r3)     // Catch: java.lang.IllegalStateException -> L12
            goto L4d
        L4c:
            r4 = r15
        L4d:
            java.lang.String r15 = "create-device-operation-id"
            java.lang.Class<owk> r3 = defpackage.owk.class
            owj r9 = r4.a(r15, r3)     // Catch: java.lang.IllegalStateException -> L12
            java.lang.String r10 = r1.d()     // Catch: java.lang.IllegalStateException -> L12
            java.lang.String r11 = r1.c()     // Catch: java.lang.IllegalStateException -> L12
            abhk r12 = r1.b()     // Catch: java.lang.IllegalStateException -> L12
            r14.a = r2     // Catch: java.lang.IllegalStateException -> L12
            r6 = r5
            fzw r6 = (defpackage.fzw) r6     // Catch: java.lang.IllegalStateException -> L12
            r13 = r14
            java.lang.Object r15 = defpackage.fzw.c(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.IllegalStateException -> La0
            if (r15 == r0) goto L99
        L6d:
            r4 = r15
            owv r4 = (defpackage.owv) r4     // Catch: java.lang.IllegalStateException -> La0
            goto L9a
        L71:
            r13 = r14
            goto L9a
        L73:
            r13 = r14
            r1 = 0
            r15.r = r1     // Catch: java.lang.IllegalStateException -> La0
            fze r1 = r15.g     // Catch: java.lang.IllegalStateException -> La0
            owx r2 = r13.d     // Catch: java.lang.IllegalStateException -> La0
            oww r5 = r13.e     // Catch: java.lang.IllegalStateException -> La0
            oxe r15 = r15.D     // Catch: java.lang.IllegalStateException -> La0
            if (r15 != 0) goto L85
            defpackage.agvy.b(r3)     // Catch: java.lang.IllegalStateException -> La0
            goto L86
        L85:
            r4 = r15
        L86:
            java.lang.String r15 = "assign-device-operation-id"
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            owj r15 = r4.a(r15, r3)     // Catch: java.lang.IllegalStateException -> La0
            r3 = 2
            r13.a = r3     // Catch: java.lang.IllegalStateException -> La0
            fzw r1 = (defpackage.fzw) r1     // Catch: java.lang.IllegalStateException -> La0
            java.lang.Object r15 = defpackage.fzw.a(r1, r2, r5, r15, r14)     // Catch: java.lang.IllegalStateException -> La0
            if (r15 != r0) goto L6d
        L99:
            return r0
        L9a:
            ind r15 = r13.b     // Catch: java.lang.IllegalStateException -> La0
            r15.m(r4)     // Catch: java.lang.IllegalStateException -> La0
            goto Lc4
        La0:
            zdy r15 = defpackage.ind.a
            zeo r15 = r15.b()
            r0 = 737(0x2e1, float:1.033E-42)
            java.lang.String r1 = "HomeGraphSetupActivityPeer.kt"
            java.lang.String r2 = "com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer$selectRoom$1$1$1"
            java.lang.String r3 = "invokeSuspend"
            zeo r15 = r15.q(r2, r3, r0, r1)
            zdv r15 = (defpackage.zdv) r15
            java.lang.String r0 = "Device is already assigned to this room. Ending HomeGraph setup successfully."
            r15.u(r0)
            ind r15 = r13.b
            ybo r0 = defpackage.ybo.SUCCESS
            r15.B = r0
            irg r0 = defpackage.irg.u
            r15.n(r0)
        Lc4:
            agpu r15 = defpackage.agpu.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new imy(this.b, this.c, this.d, this.e, agswVar);
    }
}
