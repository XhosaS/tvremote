package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ams extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ ano c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ams(ano anoVar, agsw agswVar) {
        super(2, agswVar);
        this.c = anoVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ams) c((ahgs) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (r9 != r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
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
            r4 = 0
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L12
            defpackage.agpl.b(r9)
            goto Lb4
        L12:
            java.lang.Object r1 = r8.a
            java.lang.Object r2 = r8.d
            ahgs r2 = (defpackage.ahgs) r2
            defpackage.agpl.b(r9)
            goto L5e
        L1c:
            java.lang.Object r1 = r8.d
            ahgs r1 = (defpackage.ahgs) r1
            defpackage.agpl.b(r9)
            goto L45
        L24:
            defpackage.agpl.b(r9)
            java.lang.Object r9 = r8.d
            ahgs r9 = (defpackage.ahgs) r9
            ano r1 = r8.c
            r8.d = r9
            r8.b = r3
            ahbt r3 = r1.b
            agte r3 = r3.fs()
            anh r5 = new anh
            r5.<init>(r1, r4)
            java.lang.Object r1 = defpackage.ahal.a(r3, r5, r8)
            if (r1 == r0) goto Lca
            r7 = r1
            r1 = r9
            r9 = r7
        L45:
            apk r9 = (defpackage.apk) r9
            boolean r3 = r9 instanceof defpackage.alt
            if (r3 == 0) goto La8
            r3 = r9
            alt r3 = (defpackage.alt) r3
            java.lang.Object r3 = r3.a
            r8.d = r1
            r8.a = r9
            r8.b = r2
            java.lang.Object r2 = r1.a(r3, r8)
            if (r2 == r0) goto Lca
            r2 = r1
            r1 = r9
        L5e:
            ano r9 = r8.c
            aml r3 = new aml
            r3.<init>(r9, r4)
            ahhg r5 = new ahhg
            anp r6 = r9.d
            ahin r6 = r6.a
            r5.<init>(r3, r6)
            amm r3 = new amm
            r3.<init>(r4)
            ahhv r6 = new ahhv
            r6.<init>(r5, r3)
            amn r3 = new amn
            apk r1 = (defpackage.apk) r1
            r3.<init>(r1, r4)
            ahhr r1 = new ahhr
            r1.<init>(r6, r3)
            amr r3 = new amr
            r3.<init>(r1)
            amo r1 = new amo
            r1.<init>(r9, r4)
            ahhe r9 = new ahhe
            r9.<init>(r3, r1)
            r8.d = r4
            r8.a = r4
            r1 = 3
            r8.b = r1
            defpackage.ahhh.b(r2)
            java.lang.Object r9 = r9.fD(r2, r8)
            if (r9 == r0) goto La5
            agpu r9 = defpackage.agpu.a
        La5:
            if (r9 != r0) goto Lb4
            goto Lca
        La8:
            boolean r0 = r9 instanceof defpackage.app
            if (r0 != 0) goto Lc2
            boolean r0 = r9 instanceof defpackage.apa
            if (r0 != 0) goto Lbd
            boolean r9 = r9 instanceof defpackage.aoe
            if (r9 == 0) goto Lb7
        Lb4:
            agpu r9 = defpackage.agpu.a
            return r9
        Lb7:
            agpg r9 = new agpg
            r9.<init>()
            throw r9
        Lbd:
            apa r9 = (defpackage.apa) r9
            java.lang.Throwable r9 = r9.a
            throw r9
        Lc2:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r9.<init>(r0)
            throw r9
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ams.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ams amsVar = new ams(this.c, agswVar);
        amsVar.d = obj;
        return amsVar;
    }
}
