package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jti extends sbx {
    private final iyh a;
    private final hfw b;

    public jti(hfw hfwVar, jzs jzsVar, iyh iyhVar) {
        jzsVar.getClass();
        this.b = hfwVar;
        this.a = iyhVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object C() {
        return new jtl();
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        jth jthVar = (jth) obj;
        iye iyeVar = jthVar.b;
        jtl jtlVar = (jtl) obj2;
        n(iyeVar);
        iyk iykVar = jthVar.c ? (iyk) this.a.l(iyeVar) : null;
        if (yks.e(jtlVar.a, iykVar)) {
            return;
        }
        jtlVar.a = iykVar;
        jtlVar.G(0);
    }
}
