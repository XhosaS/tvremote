package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahht implements ahgs {
    final /* synthetic */ agwe a;
    final /* synthetic */ ahgs b;
    final /* synthetic */ agvb c;

    public ahht(agwe agweVar, ahgs ahgsVar, agvb agvbVar) {
        this.a = agweVar;
        this.b = ahgsVar;
        this.c = agvbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r8.a(r7, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r8.a(r7, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ahgs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, defpackage.agsw r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ahhs
            if (r0 == 0) goto L13
            r0 = r8
            ahhs r0 = (defpackage.ahhs) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ahhs r0 = new ahhs
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            goto L38
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.a
            defpackage.agpl.b(r8)
            goto L5c
        L38:
            defpackage.agpl.b(r8)
            goto L76
        L3c:
            defpackage.agpl.b(r8)
            agwe r8 = r6.a
            boolean r8 = r8.a
            if (r8 == 0) goto L50
            ahgs r8 = r6.b
            r0.d = r5
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L76
            goto L79
        L50:
            agvb r8 = r6.c
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 == r1) goto L79
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L76
            agwe r8 = r6.a
            r8.a = r5
            ahgs r8 = r6.b
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L76
            goto L79
        L76:
            agpu r7 = defpackage.agpu.a
            return r7
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahht.a(java.lang.Object, agsw):java.lang.Object");
    }
}
