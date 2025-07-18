package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anh extends agtu implements agvb {
    int a;
    final /* synthetic */ ano b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anh(ano anoVar, agsw agswVar) {
        super(2, agswVar);
        this.b = anoVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r5 == r0) goto L19;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.agpl.b(r5)
            goto L3d
        Ld:
            defpackage.agpl.b(r5)     // Catch: java.lang.Throwable -> L11
            goto L30
        L11:
            r5 = move-exception
            goto L40
        L13:
            defpackage.agpl.b(r5)
            ano r5 = r4.b
            anp r1 = r5.d
            apk r3 = r1.a()
            boolean r3 = r3 instanceof defpackage.aoe
            if (r3 == 0) goto L27
            apk r5 = r1.a()
            return r5
        L27:
            r4.a = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r5 = r5.g(r4)     // Catch: java.lang.Throwable -> L11
            if (r5 != r0) goto L30
            goto L3c
        L30:
            ano r5 = r4.b
            r1 = 2
            r4.a = r1
            r1 = 0
            java.lang.Object r5 = r5.h(r1, r4)
            if (r5 != r0) goto L3d
        L3c:
            return r0
        L3d:
            apk r5 = (defpackage.apk) r5
            return r5
        L40:
            apa r0 = new apa
            r1 = -1
            r0.<init>(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new anh(this.b, agswVar);
    }
}
