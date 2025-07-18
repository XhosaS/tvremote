package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhq implements fhn {
    private final int a;
    private final int b;
    private final edi c;

    public fhq(edx edxVar, dze dzeVar) {
        edi ediVar = edxVar.a;
        this.c = ediVar;
        ediVar.K(12);
        int iM = ediVar.m();
        if ("audio/raw".equals(dzeVar.Y)) {
            int iP = edt.p(dzeVar.as, dzeVar.aq);
            if (iM == 0 || iM % iP != 0) {
                edb.e("BoxParsers", a.ce(iM, iP, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: "));
                iM = iP;
            }
        }
        this.a = iM == 0 ? -1 : iM;
        this.b = ediVar.m();
    }

    @Override // defpackage.fhn
    public final int a() {
        return this.a;
    }

    @Override // defpackage.fhn
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fhn
    public final int c() {
        int i = this.a;
        return i == -1 ? this.c.m() : i;
    }
}
