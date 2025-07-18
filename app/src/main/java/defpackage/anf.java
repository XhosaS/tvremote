package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anf extends agtu implements agvb {
    Object a;
    int b;
    /* synthetic */ boolean c;
    final /* synthetic */ ano d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anf(ano anoVar, int i, agsw agswVar) {
        super(2, agswVar);
        this.d = anoVar;
        this.e = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((anf) c(bool, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r4.a
            defpackage.agpl.b(r5)
            goto L3d
        Lf:
            boolean r1 = r4.c
            defpackage.agpl.b(r5)
            goto L28
        L15:
            defpackage.agpl.b(r5)
            boolean r1 = r4.c
            ano r5 = r4.d
            r4.b = r2
            apm r5 = r5.c()
            java.lang.Object r5 = defpackage.apo.a(r5, r4)
            if (r5 == r0) goto L57
        L28:
            if (r1 == 0) goto L47
            ano r1 = r4.d
            aof r1 = r1.b()
            r4.a = r5
            r2 = 2
            r4.b = r2
            java.lang.Object r1 = r1.a(r4)
            if (r1 == r0) goto L57
            r0 = r5
            r5 = r1
        L3d:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r3 = r0
            r0 = r5
            r5 = r3
            goto L49
        L47:
            int r0 = r4.e
        L49:
            alt r1 = new alt
            if (r5 == 0) goto L52
            int r2 = r5.hashCode()
            goto L53
        L52:
            r2 = 0
        L53:
            r1.<init>(r5, r2, r0)
            return r1
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        anf anfVar = new anf(this.d, this.e, agswVar);
        anfVar.c = ((Boolean) obj).booleanValue();
        return anfVar;
    }
}
