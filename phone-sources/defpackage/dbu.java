package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbu extends yiz implements yjz {
    Object a;
    int b;
    /* synthetic */ boolean c;
    final /* synthetic */ dbz d;
    final /* synthetic */ int e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbu(dbz dbzVar, int i, yih yihVar, int i2) {
        super(2, yihVar);
        this.f = i2;
        this.d = dbzVar;
        this.e = i;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((dbu) create(bool, (yih) obj2)).invokeSuspend(ygi.a);
        }
        Boolean bool2 = (Boolean) obj;
        bool2.booleanValue();
        return ((dbu) create(bool2, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.f != 0) {
            dbu dbuVar = new dbu(this.d, this.e, yihVar, 1, null);
            dbuVar.c = ((Boolean) obj).booleanValue();
            return dbuVar;
        }
        dbu dbuVar2 = new dbu(this.d, this.e, yihVar, 0);
        dbuVar2.c = ((Boolean) obj).booleanValue();
        return dbuVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v20, types: [dbz] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L69
            yio r0 = defpackage.yio.a
            int r3 = r6.b
            if (r3 == 0) goto L1e
            if (r3 == r2) goto L16
            boolean r0 = r6.c
            java.lang.Object r1 = r6.a
            defpackage.ybn.f(r7)
            goto L4a
        L16:
            boolean r3 = r6.c
            defpackage.ybn.f(r7)     // Catch: java.lang.Throwable -> L1c
            goto L2e
        L1c:
            r7 = move-exception
            goto L31
        L1e:
            defpackage.ybn.f(r7)
            boolean r3 = r6.c
            dbz r7 = r6.d     // Catch: java.lang.Throwable -> L1c
            r6.b = r2     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r7 = r7.h(r3, r6)     // Catch: java.lang.Throwable -> L1c
            if (r7 != r0) goto L2e
            goto L68
        L2e:
            dcq r7 = (defpackage.dcq) r7     // Catch: java.lang.Throwable -> L1c
            goto L5e
        L31:
            if (r3 == 0) goto L54
            dbz r4 = r6.d
            cvi r4 = r4.m()
            r6.a = r7
            r6.c = r2
            r6.b = r1
            java.lang.Object r1 = r4.t()
            if (r1 != r0) goto L46
            goto L68
        L46:
            r0 = r1
            r1 = r7
            r7 = r0
            r0 = r3
        L4a:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r3 = r0
            r0 = r7
            r7 = r1
            goto L56
        L54:
            int r0 = r6.e
        L56:
            dck r1 = new dck
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r1.<init>(r7, r0)
            r7 = r1
        L5e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            yfw r1 = new yfw
            r1.<init>(r7, r0)
            r0 = r1
        L68:
            return r0
        L69:
            yio r0 = defpackage.yio.a
            int r3 = r6.b
            if (r3 == 0) goto L7d
            if (r3 == r2) goto L77
            java.lang.Object r0 = r6.a
            defpackage.ybn.f(r7)
            goto La5
        L77:
            boolean r2 = r6.c
            defpackage.ybn.f(r7)
            goto L90
        L7d:
            defpackage.ybn.f(r7)
            boolean r7 = r6.c
            dbz r3 = r6.d
            r6.b = r2
            java.lang.Object r2 = r3.g(r6)
            if (r2 != r0) goto L8d
            goto La2
        L8d:
            r5 = r2
            r2 = r7
            r7 = r5
        L90:
            if (r2 == 0) goto Laf
            dbz r2 = r6.d
            cvi r2 = r2.m()
            r6.a = r7
            r6.b = r1
            java.lang.Object r1 = r2.t()
            if (r1 != r0) goto La3
        La2:
            return r0
        La3:
            r0 = r7
            r7 = r1
        La5:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r5 = r0
            r0 = r7
            r7 = r5
            goto Lb1
        Laf:
            int r0 = r6.e
        Lb1:
            dax r1 = new dax
            if (r7 == 0) goto Lba
            int r2 = r7.hashCode()
            goto Lbb
        Lba:
            r2 = 0
        Lbb:
            r1.<init>(r7, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbu(dbz dbzVar, int i, yih yihVar, int i2, byte[] bArr) {
        super(2, yihVar);
        this.f = i2;
        this.d = dbzVar;
        this.e = i;
    }
}
