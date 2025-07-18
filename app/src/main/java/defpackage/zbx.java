package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zbx extends zbq {
    final Object a;
    int b;
    final /* synthetic */ zby c;

    public zbx(zby zbyVar, int i) {
        this.c = zbyVar;
        this.a = zbyVar.a[i];
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // defpackage.zbo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a() {
        /*
            r4 = this;
            int r0 = r4.b
            r1 = -1
            if (r0 == r1) goto L17
            zby r2 = r4.c
            int r3 = r2.c
            if (r0 >= r3) goto L17
            java.lang.Object r3 = r4.a
            java.lang.Object[] r2 = r2.a
            r0 = r2[r0]
            boolean r0 = defpackage.yqs.a(r3, r0)
            if (r0 != 0) goto L21
        L17:
            zby r0 = r4.c
            java.lang.Object r2 = r4.a
            int r0 = r0.d(r2)
            r4.b = r0
        L21:
            int r0 = r4.b
            if (r0 != r1) goto L27
            r0 = 0
            return r0
        L27:
            zby r1 = r4.c
            int[] r1 = r1.b
            r0 = r1[r0]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbx.a():int");
    }

    @Override // defpackage.zbo
    public final Object b() {
        return this.a;
    }
}
