package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lap implements idf {
    final idf a;

    public lap(idf idfVar) {
        this.a = idfVar;
    }

    @Override // defpackage.idf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lao b(vbb vbbVar) {
        vtw vtwVarM = lao.a.m();
        int iAK = a.aK(vbbVar.d);
        if (iAK == 0) {
            iAK = 1;
        }
        int i = iAK - 2;
        lam lamVar = i != 1 ? i != 2 ? i != 3 ? i != 4 ? lam.DETAILS_PAGE_DISTRIBUTOR_SELECTION_TYPE_UNKNOWN : lam.BEST_AVAILABLE : lam.ENTITLED_DISTRIBUTOR : lam.SPECIFIC_DISTRIBUTOR : lam.GOOGLE_PLAY;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((lao) vtwVarM.b).d = lamVar.a();
        int iAs = a.as(vbbVar.c);
        if (iAs == 0) {
            iAs = 1;
        }
        int i2 = iAs - 2;
        lan lanVar = i2 != 1 ? i2 != 2 ? lan.SEASON_SELECTION_LOCATION_UNKNOWN : lan.LATEST : lan.EARLIEST;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((lao) vtwVarM.b).c = lanVar.a();
        if ((vbbVar.b & 1) != 0) {
            idf idfVar = this.a;
            vba vbaVar = vbbVar.e;
            if (vbaVar == null) {
                vbaVar = vba.a;
            }
            val valVar = vbaVar.c;
            if (valVar == null) {
                valVar = val.a;
            }
            ksy ksyVar = (ksy) idfVar.b(valVar);
            vtw vtwVarM2 = lal.a.m();
            String str = ksyVar.b;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ((lal) vtwVarM2.b).b = str;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            lao laoVar = (lao) vtwVarM.b;
            lal lalVar = (lal) vtwVarM2.r();
            lalVar.getClass();
            laoVar.e = lalVar;
            laoVar.b |= 1;
        }
        return (lao) vtwVarM.r();
    }
}
