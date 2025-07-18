package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anj extends agtu implements agux {
    Object a;
    int b;
    final /* synthetic */ ano c;
    final /* synthetic */ agte d;
    final /* synthetic */ agvb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anj(ano anoVar, agte agteVar, agvb agvbVar, agsw agswVar) {
        super(1, agswVar);
        this.c = anoVar;
        this.d = agteVar;
        this.e = agvbVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new anj(this.c, this.d, this.e, (agsw) obj).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r8.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 == r2) goto L12
            java.lang.Object r0 = r8.a
            defpackage.agpl.b(r9)
            return r0
        L12:
            java.lang.Object r1 = r8.a
            alt r1 = (defpackage.alt) r1
            defpackage.agpl.b(r9)
            goto L44
        L1a:
            defpackage.agpl.b(r9)
            goto L2b
        L1e:
            defpackage.agpl.b(r9)
            ano r9 = r8.c
            r8.b = r3
            java.lang.Object r9 = r9.i(r3, r8)
            if (r9 == r0) goto L6e
        L2b:
            agte r1 = r8.d
            agvb r4 = r8.e
            alt r9 = (defpackage.alt) r9
            ani r5 = new ani
            r6 = 0
            r5.<init>(r4, r9, r6)
            r8.a = r9
            r8.b = r2
            java.lang.Object r1 = defpackage.ahal.a(r1, r5, r8)
            if (r1 == r0) goto L6e
            r7 = r1
            r1 = r9
            r9 = r7
        L44:
            java.lang.Object r2 = r1.a
            if (r2 == 0) goto L4d
            int r4 = r2.hashCode()
            goto L4e
        L4d:
            r4 = 0
        L4e:
            int r1 = r1.b
            if (r4 != r1) goto L66
            boolean r1 = defpackage.agvy.c(r2, r9)
            if (r1 != 0) goto L65
            ano r1 = r8.c
            r8.a = r9
            r2 = 3
            r8.b = r2
            java.lang.Object r1 = r1.k(r9, r3, r8)
            if (r1 == r0) goto L6e
        L65:
            return r9
        L66:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r9.<init>(r0)
            throw r9
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anj.b(java.lang.Object):java.lang.Object");
    }
}
