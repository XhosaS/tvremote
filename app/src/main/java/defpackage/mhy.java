package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mhy extends dxv {

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    aggh a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    obk b;

    @eau(a = eav.NONE)
    @eat(a = 10)
    drq c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oca d;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ofl e;

    public mhy() {
        super("ElementsRootFlat");
    }

    @Override // defpackage.drq
    protected final dzh am(dzh dzhVar) {
        dzh dzhVarA = dzh.a(dzhVar);
        dzhVarA.d(oca.class, this.d);
        dzhVarA.d(obk.class, this.b);
        dzhVarA.d(aggh.class, this.a);
        dzhVarA.d(ofl.class, this.e);
        return dzhVarA;
    }

    @Override // defpackage.dxv
    protected final drq ay(dru druVar) {
        return this.c;
    }

    @Override // defpackage.drq
    public final /* bridge */ /* synthetic */ drq l() {
        mhy mhyVar = (mhy) super.l();
        drq drqVar = mhyVar.c;
        mhyVar.c = drqVar != null ? drqVar.l() : null;
        return mhyVar;
    }
}
