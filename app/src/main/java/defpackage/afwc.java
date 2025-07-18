package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afwc implements afhl {
    final /* synthetic */ afhj a;
    final /* synthetic */ afwh b;

    public afwc(afwh afwhVar, afhj afhjVar) {
        this.a = afhjVar;
        this.b = afwhVar;
    }

    @Override // defpackage.afhl
    public final void a(afff afffVar) {
        afhk afweVar;
        affe affeVar = afffVar.a;
        if (affeVar == affe.SHUTDOWN) {
            return;
        }
        afwh afwhVar = this.b;
        affe affeVar2 = affe.TRANSIENT_FAILURE;
        if (affeVar == affeVar2 || affeVar == affe.IDLE) {
            afwhVar.f.d();
        }
        if (afwhVar.g == affeVar2) {
            if (affeVar == affe.CONNECTING) {
                return;
            }
            if (affeVar == affe.IDLE) {
                afwhVar.c();
                return;
            }
        }
        afhj afhjVar = this.a;
        int iOrdinal = affeVar.ordinal();
        if (iOrdinal == 0) {
            afweVar = new afwe(afhg.a);
        } else if (iOrdinal == 1) {
            afweVar = new afwe(afhg.d(afhjVar));
        } else if (iOrdinal == 2) {
            afweVar = new afwe(afhg.b(afffVar.b));
        } else {
            if (iOrdinal != 3) {
                throw new IllegalArgumentException("Unsupported state:".concat(affeVar.toString()));
            }
            afweVar = new afwg(afwhVar, afhjVar);
        }
        afwhVar.e(affeVar, afweVar);
    }
}
