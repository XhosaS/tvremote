package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dwn extends dvs {
    int[] P;
    dtm Q;
    boolean[] R;

    protected dwn(dru druVar, dzh dzhVar) {
        super(druVar);
        dzh.b(dzhVar);
    }

    @Override // defpackage.dvs
    public final void P(int[] iArr, int[] iArr2, float[] fArr) {
        int[] iArr3 = new int[4];
        this.P = iArr3;
        System.arraycopy(iArr, 0, iArr3, 0, 4);
        System.arraycopy(iArr2, 0, this.d, 0, 4);
        System.arraycopy(fArr, 0, this.e, 0, 4);
        this.o = null;
    }

    @Override // defpackage.dvs
    public final /* bridge */ /* synthetic */ dvk f(dve dveVar, eoe eoeVar, dvk dvkVar) {
        return new dwo(dveVar, e(), this, eoeVar, dvkVar);
    }

    @Override // defpackage.dvs
    protected final /* synthetic */ dzu m(eoe eoeVar) {
        return new dwp(eoeVar);
    }

    @Override // defpackage.dvs
    public final /* bridge */ /* synthetic */ dzu n(eoe eoeVar) {
        dwp dwpVar = (dwp) super.n(eoeVar);
        this.P = dwpVar.a;
        this.Q = dwpVar.b;
        this.R = dwpVar.c;
        return dwpVar;
    }
}
