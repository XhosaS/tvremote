package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmo extends agtu implements agvb {
    int a;
    final /* synthetic */ jmr b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmo(jmr jmrVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jmrVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jmo) c((ahgs) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r1.a(r8, r7) == r0) goto L21;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r7.a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            if (r1 == r2) goto Le
            defpackage.agpl.b(r8)
            goto L4f
        Le:
            java.lang.Object r1 = r7.c
            ahgs r1 = (defpackage.ahgs) r1
            defpackage.agpl.b(r8)
            goto L35
        L16:
            defpackage.agpl.b(r8)
            java.lang.Object r8 = r7.c
            r1 = r8
            ahgs r1 = (defpackage.ahgs) r1
            jmr r8 = r7.b
            long r4 = defpackage.jmr.b
            jmn r6 = new jmn
            r6.<init>(r8, r3)
            r7.c = r1
            r7.a = r2
            long r4 = defpackage.ahce.a(r4)
            java.lang.Object r8 = defpackage.ahep.a(r4, r6, r7)
            if (r8 == r0) goto L52
        L35:
            fcy r8 = (defpackage.fcy) r8
            zdy r2 = defpackage.jmr.a
            if (r8 == 0) goto L3e
            java.lang.String r8 = r8.a
            goto L3f
        L3e:
            r8 = r3
        L3f:
            r7.c = r3
            r2 = 2
            r7.a = r2
            if (r8 != 0) goto L48
            java.lang.String r8 = ""
        L48:
            java.lang.Object r8 = r1.a(r8, r7)
            if (r8 != r0) goto L4f
            goto L52
        L4f:
            agpu r8 = defpackage.agpu.a
            return r8
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        jmo jmoVar = new jmo(this.b, agswVar);
        jmoVar.c = obj;
        return jmoVar;
    }
}
