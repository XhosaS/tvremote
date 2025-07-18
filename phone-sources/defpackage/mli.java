package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mli extends sbx {
    private final ntp a;

    public mli(ntp ntpVar) {
        this.a = ntpVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        mle mleVar = new mle();
        mleVar.E = 2131428169L;
        return mleVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        mlc mlcVar = (mlc) obj;
        kkv kkvVar = mlcVar.a;
        mle mleVar = (mle) obj2;
        ulp ulpVarR = r();
        if (!yks.e(mleVar.a, kkvVar)) {
            mleVar.a = kkvVar;
            mleVar.G(0);
        }
        mleVar.b(mlcVar.b);
        mlh mlhVar = new mlh(mlcVar, mleVar, ulpVarR, 0);
        if (yks.e(mleVar.b, mlhVar)) {
            return;
        }
        mleVar.b = mlhVar;
        mleVar.G(2);
    }
}
