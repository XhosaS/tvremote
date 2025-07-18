package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class idf extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ idg c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idf(idg idgVar, String str, int i, agsw agswVar) {
        super(2, agswVar);
        this.c = idgVar;
        this.d = str;
        this.e = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((idf) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r10.g.d(r1, r2, r9) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        if (defpackage.ahal.a(r1, r2, r9) != r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r9.b
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 == r4) goto L17
            if (r1 == r3) goto L11
            goto L17
        L11:
            java.lang.Object r1 = r9.a
            defpackage.agpl.b(r10)
            goto L82
        L17:
            defpackage.agpl.b(r10)
            goto Lad
        L1c:
            defpackage.agpl.b(r10)
            goto L31
        L20:
            defpackage.agpl.b(r10)
            idg r10 = r9.c
            java.lang.String r1 = r9.d
            r9.b = r5
            ftc r10 = r10.g
            java.lang.Object r10 = r10.b(r1, r9)
            if (r10 == r0) goto Lb0
        L31:
            r1 = r10
            fwl r1 = (defpackage.fwl) r1
            fwl r10 = defpackage.fwl.HOTWORD_CONSENT_SPECIFIED_FOR_NO_USER
            if (r1 != r10) goto L6b
            int r10 = r9.e
            if (r10 == r5) goto L6b
            zdy r1 = defpackage.idg.a
            zeo r1 = r1.b()
            r3 = 125(0x7d, float:1.75E-43)
            java.lang.String r6 = "SearchHotwordSettingsImpl.kt"
            java.lang.String r7 = "com/google/android/apps/tvsearch/settings/preferences/SearchHotwordSettingsImpl$setHotwordStateFromUserConsent$1"
            java.lang.String r8 = "invokeSuspend"
            zeo r1 = r1.q(r7, r8, r3, r6)
            zdv r1 = (defpackage.zdv) r1
            if (r10 != r4) goto L53
            r2 = r5
        L53:
            java.lang.String r10 = "Device-level hotword permission already set to: %b"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r1.x(r10, r3)
            idg r10 = r9.c
            java.lang.String r1 = r9.d
            r9.b = r4
            ftc r10 = r10.g
            java.lang.Object r10 = r10.d(r1, r2, r9)
            if (r10 != r0) goto Lad
            goto Lb0
        L6b:
            idg r10 = r9.c
            fwl r4 = defpackage.fwl.HOTWORD_CONSENT_ACCEPTED
            if (r1 != r4) goto L74
            foc r4 = defpackage.foc.TOGGLE_ON
            goto L76
        L74:
            foc r4 = defpackage.foc.TOGGLE_OFF
        L76:
            fjr r10 = r10.e
            r9.a = r1
            r9.b = r3
            java.lang.Object r10 = r10.b(r4, r9)
            if (r10 == r0) goto Lb0
        L82:
            idg r10 = r9.c
            fwl r3 = defpackage.fwl.HOTWORD_CONSENT_ACCEPTED
            if (r1 != r3) goto L89
            r2 = r5
        L89:
            r10.d(r2)
            fwl r2 = defpackage.fwl.HOTWORD_CONSENT_UNSPECIFIED
            if (r1 == r2) goto L99
            fwl r2 = defpackage.fwl.HOTWORD_CONSENT_SPECIFIED_FOR_NO_USER
            if (r1 != r2) goto L95
            goto L99
        L95:
            r10.b(r5)
            goto Lad
        L99:
            agte r1 = r10.c
            ide r2 = new ide
            r3 = 0
            r2.<init>(r10, r3)
            r9.a = r3
            r10 = 4
            r9.b = r10
            java.lang.Object r10 = defpackage.ahal.a(r1, r2, r9)
            if (r10 != r0) goto Lad
            goto Lb0
        Lad:
            agpu r10 = defpackage.agpu.a
            return r10
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new idf(this.c, this.d, this.e, agswVar);
    }
}
