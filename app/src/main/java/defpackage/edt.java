package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edt extends ecq {

    @eau(a = eav.NONE)
    @eat(a = 10)
    drq m;

    private edt() {
        super("SingleComponentSection");
    }

    public static eds t(ecr ecrVar) {
        return new eds(ecrVar, new edt());
    }

    @Override // defpackage.ecq
    public final /* bridge */ /* synthetic */ ecq c(boolean z) {
        edt edtVar = (edt) super.c(z);
        drq drqVar = edtVar.m;
        edtVar.m = drqVar != null ? drqVar.l() : null;
        return edtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0028 A[RETURN] */
    @Override // defpackage.ecq
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(defpackage.ecq r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L29
        L12:
            edt r5 = (defpackage.edt) r5
            drq r2 = r4.m
            if (r2 == 0) goto L23
            drq r5 = r5.m
            boolean r3 = defpackage.ebc.a
            boolean r5 = r2.g(r5)
            if (r5 != 0) goto L28
            goto L27
        L23:
            drq r5 = r5.m
            if (r5 == 0) goto L28
        L27:
            return r1
        L28:
            return r0
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edt.a(ecq):boolean");
    }

    @Override // defpackage.ect
    public final boolean l() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void p(defpackage.ecr r18, defpackage.ecf r19, defpackage.ecq r20, defpackage.ecq r21) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edt.p(ecr, ecf, ecq, ecq):void");
    }
}
