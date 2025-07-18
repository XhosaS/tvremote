package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glc extends agtu implements agvb {
    int a;
    final /* synthetic */ glf b;
    final /* synthetic */ yea c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glc(glf glfVar, yea yeaVar, agsw agswVar) {
        super(2, agswVar);
        this.b = glfVar;
        this.c = yeaVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((glc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (r8.a(r1, r7) != r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
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
            r2 = 4
            r3 = 2
            r4 = 10
            r6 = 1
            if (r1 == 0) goto L14
            defpackage.agpl.b(r8)
            if (r1 == r6) goto L23
            if (r1 == r3) goto L6b
            goto La2
        L14:
            defpackage.agpl.b(r8)
            glf r8 = r7.b
            yea r1 = r7.c
            r7.a = r6
            java.lang.Object r8 = r8.b(r1, r7)
            if (r8 == r0) goto La5
        L23:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto La2
            yea r8 = r7.c
            r7.a = r3
            int r8 = r8.ordinal()
            if (r8 == r6) goto L4f
            if (r8 == r3) goto L47
            if (r8 == r2) goto L3f
            j$.time.Duration r8 = j$.time.Duration.ZERO
            r8.getClass()
            goto L56
        L3f:
            j$.time.Duration r8 = j$.time.Duration.ofMinutes(r4)
            r8.getClass()
            goto L56
        L47:
            j$.time.Duration r8 = j$.time.Duration.ofSeconds(r4)
            r8.getClass()
            goto L56
        L4f:
            j$.time.Duration r8 = j$.time.Duration.ofMinutes(r4)
            r8.getClass()
        L56:
            j$.time.Duration r1 = j$.time.Duration.ZERO
            int r1 = r8.compareTo(r1)
            if (r1 <= 0) goto L67
            java.lang.Object r8 = defpackage.zty.a(r8, r7)
            if (r8 == r0) goto L69
            agpu r8 = defpackage.agpu.a
            goto L69
        L67:
            agpu r8 = defpackage.agpu.a
        L69:
            if (r8 == r0) goto La5
        L6b:
            glf r8 = r7.b
            yea r1 = r7.c
            int r3 = r1.ordinal()
            if (r3 == r6) goto L92
            if (r3 == r2) goto L78
            goto L98
        L78:
            j$.time.Instant r2 = r8.c
            ztw r3 = r8.b
            j$.time.Instant r3 = r3.a()
            j$.time.Duration r4 = j$.time.Duration.ofMinutes(r4)
            r4.getClass()
            j$.time.Instant r3 = r3.minus(r4)
            boolean r2 = r2.isAfter(r3)
            if (r2 != 0) goto La2
            goto L98
        L92:
            eyw r2 = r8.a
            boolean r2 = r2.r
            if (r2 != 0) goto La2
        L98:
            r2 = 3
            r7.a = r2
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto La2
            goto La5
        La2:
            agpu r8 = defpackage.agpu.a
            return r8
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new glc(this.b, this.c, agswVar);
    }
}
