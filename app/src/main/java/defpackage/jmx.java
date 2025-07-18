package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmx extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ jmz c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmx(jmz jmzVar, long j, agsw agswVar) {
        super(2, agswVar);
        this.c = jmzVar;
        this.d = j;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jmx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r8 != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r7.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L14
            java.lang.Object r1 = r7.a
            defpackage.agpl.b(r8)
            goto L93
        L14:
            java.lang.Object r1 = r7.a
            defpackage.agpl.b(r8)
            goto L5f
        L1a:
            defpackage.agpl.b(r8)
            goto L34
        L1e:
            defpackage.agpl.b(r8)
            jmz r8 = r7.c
            long r5 = r7.d
            r7.b = r4
            jmv r1 = new jmv
            r1.<init>(r8, r5, r2)
            agte r8 = r8.c
            java.lang.Object r8 = defpackage.ahal.a(r8, r1, r7)
            if (r8 == r0) goto Lae
        L34:
            java.lang.String r8 = (java.lang.String) r8
            int r1 = r8.length()
            java.lang.String r4 = "invokeSuspend"
            java.lang.String r5 = "com/google/android/apps/tvsearch/voice/libassistant/updaters/CastIdUpdaterImpl$start$2$1"
            java.lang.String r6 = "CastIdUpdaterImpl.kt"
            if (r1 <= 0) goto L76
            zdy r1 = defpackage.jmz.a
            zeo r1 = r1.b()
            r2 = 47
            zeo r1 = r1.q(r5, r4, r2, r6)
            zdv r1 = (defpackage.zdv) r1
            java.lang.String r2 = "Retrieved valid castId"
            r1.u(r2)
            jmz r1 = r7.c
            r1.d = r8
            java.util.Set r8 = r1.e
            java.util.Iterator r1 = r8.iterator()
        L5f:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto Lab
            java.lang.Object r8 = r1.next()
            jmt r8 = (defpackage.jmt) r8
            r7.a = r1
            r7.b = r3
            java.lang.Object r8 = r8.ak(r7)
            if (r8 != r0) goto L5f
            goto Lae
        L76:
            zdy r8 = defpackage.jmz.a
            zeo r8 = r8.d()
            r1 = 51
            zeo r8 = r8.q(r5, r4, r1, r6)
            zdv r8 = (defpackage.zdv) r8
            java.lang.String r1 = "Retrieved invalid castId"
            r8.u(r1)
            jmz r8 = r7.c
            r8.d = r2
            java.util.Set r8 = r8.e
            java.util.Iterator r1 = r8.iterator()
        L93:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto Lab
            java.lang.Object r8 = r1.next()
            jmt r8 = (defpackage.jmt) r8
            r7.a = r1
            r2 = 3
            r7.b = r2
            java.lang.Object r8 = r8.aj(r7)
            if (r8 != r0) goto L93
            goto Lae
        Lab:
            agpu r8 = defpackage.agpu.a
            return r8
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jmx(this.c, this.d, agswVar);
    }
}
