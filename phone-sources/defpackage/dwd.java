package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwd extends yiz implements yjz {
    Object a;
    Object b;
    int c;
    final /* synthetic */ dve d;
    final /* synthetic */ dvd e;
    final /* synthetic */ yow f;
    final /* synthetic */ yjz g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwd(dve dveVar, dvd dvdVar, yow yowVar, yjz yjzVar, yih yihVar) {
        super(2, yihVar);
        this.d = dveVar;
        this.e = dvdVar;
        this.f = yowVar;
        this.g = yjzVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dwd) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new dwd(this.d, this.e, this.f, this.g, yihVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[SYNTHETIC] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            yio r0 = defpackage.yio.a
            int r1 = r11.c
            if (r1 == 0) goto L12
            java.lang.Object r1 = r11.b
            java.lang.Object r2 = r11.a
            defpackage.ybn.f(r12)     // Catch: java.lang.Throwable -> Le
            goto L69
        Le:
            r0 = move-exception
            r12 = r0
            goto L86
        L12:
            defpackage.ybn.f(r12)
            dve r12 = r11.d
            dvd r1 = r12.a()
            dvd r2 = defpackage.dvd.a
            if (r1 == r2) goto L9f
            ylf r5 = new ylf
            r5.<init>()
            ylf r1 = new ylf
            r1.<init>()
            dvd r2 = r11.e     // Catch: java.lang.Throwable -> L83
            yow r6 = r11.f     // Catch: java.lang.Throwable -> L83
            yjz r10 = r11.g     // Catch: java.lang.Throwable -> L83
            r11.a = r5     // Catch: java.lang.Throwable -> L83
            r11.b = r1     // Catch: java.lang.Throwable -> L83
            r3 = 1
            r11.c = r3     // Catch: java.lang.Throwable -> L83
            yof r8 = new yof     // Catch: java.lang.Throwable -> L83
            yih r4 = defpackage.wcq.S(r11)     // Catch: java.lang.Throwable -> L83
            r8.<init>(r4, r3)     // Catch: java.lang.Throwable -> L83
            r8.v()     // Catch: java.lang.Throwable -> L83
            dvb r3 = defpackage.dvc.Companion     // Catch: java.lang.Throwable -> L83
            dvc r4 = defpackage.dvb.c(r2)     // Catch: java.lang.Throwable -> L83
            dvc r7 = defpackage.dvb.a(r2)     // Catch: java.lang.Throwable -> L83
            yyk r9 = new yyk     // Catch: java.lang.Throwable -> L83
            r9.<init>()     // Catch: java.lang.Throwable -> L83
            dwc r3 = new dwc     // Catch: java.lang.Throwable -> L83
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L83
            r1.a = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r1.a     // Catch: java.lang.Throwable -> L83
            r2.getClass()     // Catch: java.lang.Throwable -> L83
            dvi r2 = (defpackage.dvi) r2     // Catch: java.lang.Throwable -> L83
            r12.c(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r12 = r8.i()     // Catch: java.lang.Throwable -> L83
            if (r12 == r0) goto L82
            r2 = r5
        L69:
            ylf r2 = (defpackage.ylf) r2
            java.lang.Object r12 = r2.a
            yqe r12 = (defpackage.yqe) r12
            if (r12 == 0) goto L74
            defpackage.ylh.ah(r12)
        L74:
            ylf r1 = (defpackage.ylf) r1
            java.lang.Object r12 = r1.a
            dvi r12 = (defpackage.dvi) r12
            if (r12 == 0) goto L9f
            dve r0 = r11.d
            r0.d(r12)
            goto L9f
        L82:
            return r0
        L83:
            r0 = move-exception
            r12 = r0
            r2 = r5
        L86:
            ylf r2 = (defpackage.ylf) r2
            java.lang.Object r0 = r2.a
            yqe r0 = (defpackage.yqe) r0
            if (r0 == 0) goto L91
            defpackage.ylh.ah(r0)
        L91:
            ylf r1 = (defpackage.ylf) r1
            java.lang.Object r0 = r1.a
            dvi r0 = (defpackage.dvi) r0
            if (r0 == 0) goto L9e
            dve r1 = r11.d
            r1.d(r0)
        L9e:
            throw r12
        L9f:
            ygi r12 = defpackage.ygi.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
