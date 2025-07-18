package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yuy extends yiz implements yka {
    int a;
    /* synthetic */ int b;
    final /* synthetic */ yuz c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuy(yuz yuzVar, yih yihVar) {
        super(3, yihVar);
        this.c = yuzVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        yuy yuyVar = new yuy(this.c, (yih) obj3);
        yuyVar.d = (ysy) obj;
        yuyVar.b = iIntValue;
        return yuyVar.invokeSuspend(ygi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r1.emit(r7, r6) != r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[PHI: r1
  0x0055: PHI (r1v3 ysy) = (r1v10 ysy), (r1v11 ysy) binds: [B:21:0x0053, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[PHI: r1
  0x0064: PHI (r1v4 ysy) = (r1v8 ysy), (r1v9 ysy) binds: [B:23:0x0062, B:9:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ysy] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            yio r0 = defpackage.yio.a
            int r1 = r6.a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L25
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L19
            if (r1 == r2) goto L13
            goto L25
        L13:
            java.lang.Object r1 = r6.d
            defpackage.ybn.f(r7)
            goto L64
        L19:
            java.lang.Object r1 = r6.d
            defpackage.ybn.f(r7)
            goto L55
        L1f:
            java.lang.Object r1 = r6.d
            defpackage.ybn.f(r7)
            goto L49
        L25:
            defpackage.ybn.f(r7)
            goto L73
        L29:
            defpackage.ybn.f(r7)
            java.lang.Object r1 = r6.d
            int r7 = r6.b
            if (r7 <= 0) goto L3d
            yus r7 = defpackage.yus.a
            r6.a = r5
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L73
            goto L76
        L3d:
            yuz r7 = r6.c
            r6.a = r4
            long r4 = r7.a
            java.lang.Object r7 = defpackage.yoz.f(r4, r6)
            if (r7 == r0) goto L76
        L49:
            yus r7 = defpackage.yus.b
            r6.d = r1
            r6.a = r3
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 == r0) goto L76
        L55:
            r6.d = r1
            r6.a = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r7 = defpackage.yoz.f(r2, r6)
            if (r7 == r0) goto L76
        L64:
            yus r7 = defpackage.yus.c
            r2 = 0
            r6.d = r2
            r2 = 5
            r6.a = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L73
            goto L76
        L73:
            ygi r7 = defpackage.ygi.a
            return r7
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yuy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
